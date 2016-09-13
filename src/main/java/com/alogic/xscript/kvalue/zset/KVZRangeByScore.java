package com.alogic.xscript.kvalue.zset;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

import com.alogic.xscript.ExecuteWatcher;
import com.alogic.xscript.Logiclet;
import com.alogic.xscript.LogicletContext;
import com.alogic.xscript.kvalue.KVRowOperation;
import com.anysoft.util.Pair;
import com.anysoft.util.Properties;
import com.anysoft.util.PropertiesConstants;
import com.logicbus.kvalue.core.KeyValueRow;
import com.logicbus.kvalue.core.SortedSetRow;

/**
 * @author zhongyi
 *
 */
public class KVZRangeByScore extends KVRowOperation {

	protected String min = "0";
	protected String max = "150";
	protected String withscores = "false";
	protected String reverse = "false";
	protected String tag = "data";
	
	/**
	 * 预留2个参数用来支持分页
	 */
	protected String offset = "0";
	protected String count = "100";

	public KVZRangeByScore(String tag, Logiclet p) {
		super(tag, p);
	}

	@Override
	public void configure(Properties p) {
		super.configure(p);
		min = PropertiesConstants.getRaw(p, "min", min);
		max = PropertiesConstants.getRaw(p, "max", max);
		withscores = PropertiesConstants.getRaw(p, "withscores", withscores);
		reverse = PropertiesConstants.getRaw(p, "reverse", reverse);
		tag = PropertiesConstants.getRaw(p, "tag", tag);
		offset = PropertiesConstants.getRaw(p, "offset", offset);
		count = PropertiesConstants.getRaw(p,"count",count);
	}

	@Override
	protected void onExecute(KeyValueRow row, Map<String, Object> root, Map<String, Object> current,
			LogicletContext ctx, ExecuteWatcher watcher) {
		double _min = getDouble(ctx.transform(min), 0d);
		double _max = getDouble(ctx.transform(max), 150d);
		long _offset = getLong(ctx.transform(offset), 0l);
		long _count = getLong(ctx.transform(count), 100l);
		
		if (row instanceof SortedSetRow) {
			SortedSetRow r = (SortedSetRow) row;
			boolean _reverse=getBoolean(ctx.transform(reverse), false);
			
			if(getBoolean(ctx.transform(withscores), false)){
				List<Pair<String,Double>> l=null;
				
				if(_reverse){
					l=r.rangeByScoreWithScores(_min, _max, _reverse, _offset, _count);
				}else{
					l=r.rangeByScoreWithScores(_min, _max, _reverse, _offset, _count);
				}
			    
				List<Map<String,Double>> result=new ArrayList<Map<String,Double>>();
				if(null!=l&&l.size()>0){
					Iterator<Pair<String,Double>> ite=l.iterator();
					while(ite.hasNext()){
						Pair<String,Double> p=ite.next();
						Map<String,Double> map=new HashMap<String,Double>();
						map.put(p.key(), p.value());
						result.add(map);
					}
				}
				
				current.put(ctx.transform(tag), result);	
			}else{
				if(_reverse){
					current.put(ctx.transform(tag), r.rangeByScore(_min, _max,
							_reverse, _offset, _count));
				}else{
					current.put(ctx.transform(tag), r.rangeByScore(_min, _max,
							_reverse, _offset, _count));
				}
			}			
		}
	}
}
