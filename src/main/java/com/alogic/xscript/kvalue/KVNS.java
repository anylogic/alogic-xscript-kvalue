package com.alogic.xscript.kvalue;

import com.alogic.xscript.Logiclet;
import com.alogic.xscript.kvalue.hash.KVHDel;
import com.alogic.xscript.kvalue.hash.KVHExist;
import com.alogic.xscript.kvalue.hash.KVHGet;
import com.alogic.xscript.kvalue.hash.KVHGetAll;
import com.alogic.xscript.kvalue.hash.KVHKeys;
import com.alogic.xscript.kvalue.hash.KVHMGet;
import com.alogic.xscript.kvalue.hash.KVHMSet;
import com.alogic.xscript.kvalue.hash.KVHSet;
import com.alogic.xscript.kvalue.hash.KVHValues;
import com.alogic.xscript.kvalue.string.KVAppend;
import com.alogic.xscript.kvalue.string.KVGet;
import com.alogic.xscript.kvalue.string.KVSet;
import com.alogic.xscript.kvalue.string.KVSetRange;
import com.alogic.xscript.kvalue.string.KVStrlen;
import com.alogic.xscript.plugins.Segment;

/**
 * KeyValue相关xscript插件的namespace
 * 
 * @author duanyy
 *
 */
public class KVNS extends Segment {

	public KVNS(String tag, Logiclet p) {
		super(tag, p);
		registerModule("kv-schema",KVSchema.class);
		registerModule("kv-table",KVTable.class);
		registerModule("kv-row", KVRow.class);
		registerModule("kv-del",KVDel.class);
		registerModule("kv-exist",KVExist.class);
		registerModule("kv-ttl",KVTTL.class);
		
		/**
		 * string
		 */
		registerModule("kv-set",KVSet.class);
		registerModule("kv-get",KVGet.class);
		registerModule("kv-append",KVAppend.class);
		registerModule("kv-strlen",KVStrlen.class);
		registerModule("kv-setrange",KVSetRange.class);
		
		/**
		 * hash
		 */
		registerModule("kv-hdel",KVHDel.class);
		registerModule("kv-hkeys",KVHKeys.class);
		registerModule("kv-hvals",KVHValues.class);
		registerModule("kv-hget",KVHGet.class);
		registerModule("kv-hgetall",KVHGetAll.class);
		registerModule("kv-hset",KVHSet.class);
		registerModule("kv-hmget",KVHMGet.class);
		registerModule("kv-hmset",KVHMSet.class);
		registerModule("kv-hexist",KVHExist.class);
	}

}
