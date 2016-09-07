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

		if (row instanceof SortedSetRow) {
			SortedSetRow r = (SortedSetRow) row;
			
			if(getBoolean(ctx.transform(withscores), false)){
				
				boolean _reverse=getBoolean(ctx.transform(reverse), false);
				List<Pair<String,Double>> l=null;
			/*	if(_reverse){
					current.put(ctx.transform(tag), r.rangeByScoreWithScores(getDouble(ctx.transform(max), 0), getDouble(ctx.transform(min), 150d),
							_reverse, getLong(ctx.transform(offset), 0), getLong(ctx.transform(count), 100)));
				}else{
					current.put(ctx.transform(tag), r.rangeByScoreWithScores(getDouble(ctx.transform(min), 0), getDouble(ctx.transform(max), 150d),
							_reverse, getLong(ctx.transform(offset), 0), getLong(ctx.transform(count), 100)));
				}*/
				if(_reverse){
					l=r.rangeByScoreWithScores(getDouble(ctx.transform(max), 0), getDouble(ctx.transform(min), 150d),
							_reverse,getLong(ctx.transform(offset), 0), getLong(ctx.transform(count), 100l));
				}else{
					l=r.rangeByScoreWithScores(getDouble(ctx.transform(min), 0), getDouble(ctx.transform(max), 150d),
							_reverse,getLong(ctx.transform(offset), 0l), getLong(ctx.transform(count), 100l));
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

/*				int offsetInt = getInt(ctx.transform(offset), 0);
				int countInt = getInt(ctx.transform(count), 100);
				if(offsetInt >= 0 && offsetInt <= l.size()){
					List<Map<String,Double>> res=new ArrayList<Map<String,Double>>();
					for(int i = offsetInt; (i < l.size()) && (i < (offsetInt + countInt)); ++i){
						Pair<String,Double> p= l.get(i);
						Map<String,Double> map=new HashMap<String,Double>();
						map.put(p.key(), p.value());
						res.add(map);
					}
					current.put(ctx.transform(tag), res);
				}else if(offsetInt < 0){
					throw new ServantException("core.failed", String.format(
							"empty list or set,offset can not be a negative!offset:%s", offset));
				}*/
				
			}else{
				boolean _reverse=getBoolean(ctx.transform(reverse), false);
				//List<Pair<String,Double>> l=null;
				if(_reverse){
					current.put(ctx.transform(tag), r.rangeByScore(getDouble(ctx.transform(max), 0), getDouble(ctx.transform(min), 150l),
							_reverse, getLong(ctx.transform(offset), 0), getLong(ctx.transform(count), 100)));
				}else{
					current.put(ctx.transform(tag), r.rangeByScore(getDouble(ctx.transform(min), 0), getDouble(ctx.transform(max), 150l),
							_reverse, getLong(ctx.transform(offset), 0), getLong(ctx.transform(count), 100)));
				}
			}			
		}
	}
}
