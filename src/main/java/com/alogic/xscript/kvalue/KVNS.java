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
import com.alogic.xscript.kvalue.list.KVLGet;
import com.alogic.xscript.kvalue.list.KVLInsert;
import com.alogic.xscript.kvalue.list.KVLItems;
import com.alogic.xscript.kvalue.list.KVLLPop;
import com.alogic.xscript.kvalue.list.KVLLPush;
import com.alogic.xscript.kvalue.list.KVLLength;
import com.alogic.xscript.kvalue.list.KVLRPop;
import com.alogic.xscript.kvalue.list.KVLRPush;
import com.alogic.xscript.kvalue.list.KVLRem;
import com.alogic.xscript.kvalue.list.KVLSet;
import com.alogic.xscript.kvalue.list.KVLTrim;
import com.alogic.xscript.kvalue.string.KVAppend;
import com.alogic.xscript.kvalue.string.KVGet;
import com.alogic.xscript.kvalue.string.KVSet;
import com.alogic.xscript.kvalue.string.KVSetRange;
import com.alogic.xscript.kvalue.string.KVStrlen;
import com.alogic.xscript.kvalue.zset.KVZAdd;
import com.alogic.xscript.kvalue.zset.KVZCard;
import com.alogic.xscript.kvalue.zset.KVZCount;
import com.alogic.xscript.kvalue.zset.KVZIncrby;
import com.alogic.xscript.kvalue.zset.KVZRange;
import com.alogic.xscript.kvalue.zset.KVZRangeByScore;
import com.alogic.xscript.kvalue.zset.KVZRank;
import com.alogic.xscript.kvalue.zset.KVZRem;
import com.alogic.xscript.kvalue.zset.KVZRemrangeByRank;
import com.alogic.xscript.kvalue.zset.KVZRemrangeByScore;
import com.alogic.xscript.kvalue.zset.KVZScore;
import com.alogic.xscript.plugins.Segment;
import com.alogic.xscript.kvalue.set.*;

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
		
		/**
		 * list
		 */
		registerModule("kv-llen",KVLLength.class);
		registerModule("kv-litems",KVLItems.class);
		registerModule("kv-llpush",KVLLPush.class);
		registerModule("kv-lrpush",KVLRPush.class);
		registerModule("kv-lget",KVLGet.class);
		registerModule("kv-lset",KVLSet.class);
		registerModule("kv-linsert",KVLInsert.class);
		registerModule("kv-llpop",KVLLPop.class);
		registerModule("kv-lrpop",KVLRPop.class);
		registerModule("kv-lrem",KVLRem.class);
		registerModule("kv-ltrim",KVLTrim.class);
		
		/**
		 * sortedSet
		 */
		registerModule("kv-zadd",KVZAdd.class);
		registerModule("kv-zcard",KVZCard.class);
		registerModule("kv-zcount",KVZCount.class);
		registerModule("kv-zincrby",KVZIncrby.class);
		registerModule("kv-zrange",KVZRange.class);
		registerModule("kv-zrangebyscore",KVZRangeByScore.class);
		registerModule("kv-zrank",KVZRank.class);
		registerModule("kv-zrem",KVZRem.class);
		registerModule("kv-zremrangebyrank",KVZRemrangeByRank.class);
		registerModule("kv-zremrangebyscore",KVZRemrangeByScore.class);
		registerModule("kv-zscore",KVZScore.class);
		
		/**
		 * set
		 */
		registerModule("kv-sadd",KVSAdd.class);
		registerModule("kv-scard",KVSCard.class);
		registerModule("kv-sdiff",KVSDiff.class);
		registerModule("kv-sdiffstore",KVSDiffStore.class);
		registerModule("kv-sinter",KVSInter.class);
		registerModule("kv-sinterstore",KVSInterStore.class);
		registerModule("kv-sismember",KVSIsMember.class);
		registerModule("kv-smembers",KVSMembers.class);
		registerModule("kv-spop",KVSPop.class);
		registerModule("kv-srandmember",KVSRandMember.class);
		registerModule("kv-srem",KVSRem.class);		
		registerModule("kv-sunion",KVSUnion.class);
		registerModule("kv-sunionstore",KVSUnionStore.class);

	}

}
