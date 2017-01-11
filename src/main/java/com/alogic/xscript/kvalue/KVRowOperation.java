package com.alogic.xscript.kvalue;

import java.util.Map;

import org.apache.commons.lang3.StringUtils;

import com.alogic.xscript.AbstractLogiclet;
import com.alogic.xscript.ExecuteWatcher;
import com.alogic.xscript.Logiclet;
import com.alogic.xscript.LogicletContext;
import com.anysoft.util.BaseException;
import com.anysoft.util.Properties;
import com.anysoft.util.PropertiesConstants;
import com.logicbus.kvalue.core.KeyValueRow;

/**
 * 对KeyValueRow的操作
 * 
 * @author duanyy
 *
 */
public abstract class KVRowOperation extends AbstractLogiclet{
	/**
	 * row的cid
	 */
	private String pid = "$kv-row";
	
	/**
	 * 返回结果的id
	 */
	protected String id;
	
	public KVRowOperation(String tag, Logiclet p) {
		super(tag, p);
	}
	
	public void configure(Properties p){
		super.configure(p);
		pid = PropertiesConstants.getString(p,"pid", pid,true);
		id = PropertiesConstants.getString(p,"id", "$" + getXmlTag());
	}

	@Override
	protected void onExecute(Map<String, Object> root,
			Map<String, Object> current, LogicletContext ctx,
			ExecuteWatcher watcher) {
		KeyValueRow r = ctx.getObject(pid);
		if (r == null){
			throw new BaseException("core.no_row","It must be in a kvRow context,check your script.");
		}
		
		if (StringUtils.isNotEmpty(id)){
			onExecute(r,root,current,ctx,watcher);
		}
	}

	protected abstract void onExecute(KeyValueRow row, Map<String, Object> root,
			Map<String, Object> current, LogicletContext ctx,
			ExecuteWatcher watcher);
	
	protected boolean getBoolean(String value,boolean dftValue){
		try{
			return Boolean.parseBoolean(value);
		}catch (NumberFormatException ex){
			return dftValue;
		}
	}
	
	protected long getLong(String value,long dftValue){
		try{
			return Long.parseLong(value);
		}catch (NumberFormatException ex){
			return dftValue;
		}
	}	
	
	protected int getInt(String value,int dftValue){
		try{
			return Integer.parseInt(value);
		}catch (NumberFormatException ex){
			return dftValue;
		}
	}	
	
	protected double getDouble(String value,double dftValue){
		try{
			return Double.parseDouble(value);
		}catch (NumberFormatException ex){
			return dftValue;
		}
	}	
	
	protected float getFloat(String value,float dftValue){
		try{
			return Float.parseFloat(value);
		}catch (NumberFormatException ex){
			return dftValue;
		}
	}	
}