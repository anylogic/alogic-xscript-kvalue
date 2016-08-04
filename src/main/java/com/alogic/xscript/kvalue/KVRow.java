package com.alogic.xscript.kvalue;


import java.util.Map;
import com.alogic.xscript.ExecuteWatcher;
import com.alogic.xscript.Logiclet;
import com.alogic.xscript.LogicletContext;
import com.anysoft.util.Properties;
import com.anysoft.util.PropertiesConstants;
import com.logicbus.kvalue.context.KValueSource;
import com.logicbus.kvalue.core.KeyValueRow;
import com.logicbus.kvalue.core.Schema;
import com.logicbus.kvalue.core.Table;

/**
 * 从table中查找row
 * 
 * @author duanyy
 *
 */
public class KVRow extends KVNS{
	/**
	 * kvtable的cid
	 */
	protected String pid = "$kv-table";
	protected String cid = "$kv-row";
	protected String schema = "";
	protected String table = "";
	protected String key = "";
	protected boolean enableRWSplit = true;
	
	public KVRow(String tag, Logiclet p) {
		super(tag, p);
	}
	
	public void configure(Properties p){
		super.configure(p);
		schema = PropertiesConstants.getString(p,"schema", schema);
		table = PropertiesConstants.getString(p,"table", table);
		pid = PropertiesConstants.getString(p,"pid", pid);
		cid = PropertiesConstants.getString(p,"cid", cid);
		key = PropertiesConstants.getRaw(p, "key", key);
		enableRWSplit = PropertiesConstants.getBoolean(p,"enableRWSplit", enableRWSplit);		
	}

	@Override
	protected void onExecute(Map<String, Object> root,
			Map<String, Object> current, LogicletContext ctx,
			ExecuteWatcher watcher) {
		Table t = ctx.getObject(pid);
		if (t == null){
			//自己创建schema和table
			Schema s = KValueSource.getSchema(schema);
			if (s == null){
				log(String.format("Can not find the schema[%s]",schema), "error");
				return ;
			}
			
			t = s.getTable(table);
			if (t == null){
				log(String.format("Can not find the table [%s/%s]",schema,table),"error");
				return ;
			}
		}
		
		String rowKey = ctx.transform(key);
		KeyValueRow row = t.select(rowKey, enableRWSplit);		
		try {
			ctx.setObject(cid, row);
			super.onExecute(root, current, ctx, watcher);
		}finally{
			ctx.removeObject(cid);
		}
	}
}