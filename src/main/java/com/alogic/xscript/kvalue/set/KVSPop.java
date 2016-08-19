package com.alogic.xscript.kvalue.set;

import java.util.Map;

import com.alogic.xscript.ExecuteWatcher;
import com.alogic.xscript.Logiclet;
import com.alogic.xscript.LogicletContext;
import com.alogic.xscript.kvalue.KVRowOperation;
import com.anysoft.util.Properties;
import com.logicbus.kvalue.core.KeyValueRow;
import com.logicbus.kvalue.core.SetRow;

/**移除并返回集合中的一个随机元素
 * 
 * @author zhongyi
 *
 */
public class KVSPop extends KVRowOperation {

	public KVSPop(String tag, Logiclet p) {
		super(tag, p);
	}

	@Override
	public void configure(Properties p) {
		super.configure(p);
	}

	@Override
	protected void onExecute(KeyValueRow row, Map<String, Object> root, Map<String, Object> current,
			LogicletContext ctx, ExecuteWatcher watcher) {

		if (row instanceof SetRow) {		
			SetRow r = (SetRow) row;
			ctx.SetValue(id, String.valueOf(r.pop()));
		}

	}

}
