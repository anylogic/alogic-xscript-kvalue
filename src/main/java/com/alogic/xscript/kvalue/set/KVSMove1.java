package com.alogic.xscript.kvalue.set;

import java.util.Map;

import com.alogic.xscript.ExecuteWatcher;
import com.alogic.xscript.Logiclet;
import com.alogic.xscript.LogicletContext;
import com.alogic.xscript.kvalue.KVRowOperation;
import com.anysoft.util.Properties;
import com.anysoft.util.PropertiesConstants;
import com.logicbus.kvalue.core.KeyValueRow;
import com.logicbus.kvalue.core.SetRow;
import com.logicbus.kvalue.core.SortedSetRow;

/**
 * 
 * @author zhongyi
 *
 */
public class KVSMove1 extends KVRowOperation {

	protected String item = "";
	protected String delimeter = ";";

	public KVSMove1(String tag, Logiclet p) {
		super(tag, p);
	}

	@Override
	public void configure(Properties p) {
		super.configure(p);
		item = PropertiesConstants.getRaw(p, "item", item);
		delimeter = PropertiesConstants.getRaw(p, "delimeter", delimeter);

	}

	@Override
	protected void onExecute(KeyValueRow row, Map<String, Object> root, Map<String, Object> current,
			LogicletContext ctx, ExecuteWatcher watcher) {
		String[] items = ctx.transform(item).split(delimeter);
		if (row instanceof SetRow) {		
			SetRow r = (SetRow) row;
			
			//TO-DO 接口还没直接提供本方法
		}

	}

}
