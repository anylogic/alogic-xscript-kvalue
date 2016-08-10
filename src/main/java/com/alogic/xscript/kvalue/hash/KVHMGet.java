package com.alogic.xscript.kvalue.hash;

import java.util.Map;

import org.apache.commons.lang3.StringUtils;

import com.alogic.xscript.ExecuteWatcher;
import com.alogic.xscript.Logiclet;
import com.alogic.xscript.LogicletContext;
import com.alogic.xscript.kvalue.KVRowOperation;
import com.anysoft.util.Properties;
import com.anysoft.util.PropertiesConstants;
import com.logicbus.kvalue.core.HashRow;
import com.logicbus.kvalue.core.KeyValueRow;

public class KVHMGet extends KVRowOperation {
	protected String key = "";
	protected String delimeter = ";";
	protected String tag = "data";
	
	public KVHMGet(String tag, Logiclet p) {
		super(tag, p);
	}
	
	@Override
	public void configure(Properties p){
		super.configure(p);
		
		tag = PropertiesConstants.getRaw(p,"tag",tag);
		key = PropertiesConstants.getRaw(p,"key",key);
		delimeter = PropertiesConstants.getString(p,"delimiter",delimeter,true);
	}
	
	@Override
	protected void onExecute(KeyValueRow row, Map<String, Object> root, Map<String, Object> current,
			LogicletContext ctx, ExecuteWatcher watcher) {
		String tagValue = ctx.transform(tag);

		if (StringUtils.isNotEmpty(tagValue) && row instanceof HashRow) {
			HashRow r = (HashRow) row;
			String keyList = ctx.transform(key);
			
			current.put(tagValue,r.mget(keyList.split(delimeter)));
		}
	}

}