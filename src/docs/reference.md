alogic-xcript-kvalue参考
=======================

alogic-xscript-kvalue插件包括：

- [schema定位kv-schema](plugins/kv-schema.md)
- [table定位kv-table](plugins/kv-table.md)
- [row定位kv-row](plugins/kv-row.md)
- row的通用操作
	- [删除kv-del](plugins/kv-del.md)
	- [是否存在kv-exist](plugins/kv-exist.md)
	- [ttl操作kv-ttl](plugins/kv-ttl.md)
- string类型的操作 [查看案例](plugins/case.string.md)
	- [获取值kv-get](plugins/kv-get.md)
	- [设置值kv-set](plugins/kv-set.md)
	- [设置范围值kv-setrange](plugins/kv-setrange.md)
	- [获取取值的字符串长度kv-strlen](plugins/kv-strlen.md)
- Hash类型的操作[查看案例](plugins/case.hash.md)
	- [删除指定的field值kv-hdel](plugins/kv-hdel.md)
	- [指定的field是否存在kv-hexist](plugins/kv-hexist.md)
	- [获取指定field的值kv-hget](plugins/kv-hget.md)
	- [设置指定field的值kv-hset](plugins/kv-hset.md)
	- [获取所有field的值kv-hgetall](plugins/kv-hgetall.md)
	- [获取所有field的键kv-hkeys](plugins/kv-hkeys.md)
	- [获取所有field的值kv-hvals](plugins/kv-hvals.md)
	- [获取指定多个field的值kv-hmget](plugins/kv-hmget.md)
	- [设置指定多个field的值kv-hmset](plugins/kv-hmset.md)
- List类型的操作[查看案例](plugins/case.list.md)
	- [获取当前列表长度kv-llen](plugins/kv-llen.md)
	- [从左边push到列表kv-llpush](plugins/kv-llpush.md)
	- [从右边push到列表kv-lrpush](plugins/kv-lrpush.md)
	- [获取指定范围的元素列表kv-litems](plugins/kv-litems.md)
	- [获取指定位置的元素kv-lget](plugins/kv-lget.md)
	- [设置指定位置的元素kv-lset](plugins/kv-lset.md)
	- [从指定的元素位置插入新的元素kv-linsert](plugins/kv-linsert.md)
	- [从左边移除并返回头元素kv-llpop](plugins/kv-llpop.md)
	- [从右边移除并返回头元素kv-lrpop](plugins/kv-llpop.mdd)
	- [从列表中移除指定的元素kv-lrm](plugins/kv-lrm.md)
	- [剪裁不在指定区域的元素kv-ltrim](plugins/kv-ltrim.md)
	
- SortedSet类型的操作(开发中...)
- Set类型的操作(开发中)

