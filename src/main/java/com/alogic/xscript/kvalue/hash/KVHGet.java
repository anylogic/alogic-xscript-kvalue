package com.alogic.xscript.kvalue.hash;

import java.util.Map;

import com.alogic.xscript.ExecuteWatcher;
import com.alogic.xscript.Logiclet;
import com.alogic.xscript.LogicletContext;
import com.alogic.xscript.kvalue.KVRowOperation;
import com.anysoft.util.Properties;
import com.anysoft.util.PropertiesConstants;
import com.logicbus.kvalue.core.HashRow;
import com.logicbus.kvalue.core.KeyValueRow;

public class KVHGet extends KVRowOperation {
	protected String key = "";
	protected String dft = "";
	
	public KVHGet(String tag, Logiclet p) {
		super(tag, p);
	}
	
	@Override
	public void configure(Properties p){
		super.configure(p);
		
		key = PropertiesConstants.getRaw(p,"key",key);
		dft = PropertiesConstants.getRaw(p,"dft",dft);
	}
	
	@Override
	protected void onExecute(KeyValueRow row, Map<String, Object> root, Map<String, Object> current,
			LogicletContext ctx, ExecuteWatcher watcher) {
		String keyList = ctx.transform(key);

		if (row instanceof HashRow) {
			HashRow r = (HashRow) row;
			String dftValue = ctx.transform(dft);
			ctx.SetValue(id, String.valueOf(r.get(keyList, dftValue)));
		}
	}

}