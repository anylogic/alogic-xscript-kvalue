kv-zrangebylex.md
=======

kv-zrangebyscore.通过字典区间返回有序集合的成员。将结果插入到当前文档节点。本指令只能用于Zset类型table。

> 本指令对应redis的[ZRANGEBYLEX](http://http://redis.io/commands/zrangebylex)指令.  

### 实现类

com.alogic.xscript.kvalue.zset.KVZRangeByLex

### 配置参数

支持下列参数：

| 编号 | 代码 | 说明 |
| ---- | ---- | ---- |
| 1 | pid | row的上下文对象id,缺省为$kv-row |
| 2 | id | 操作返回变量id,缺省为$kv-zrangebylex |
| 3 | min | 字典区间最小值字符串,支持计算,缺省为"-" |
| 4 | max | 字典区间最大值字符串，支持计算,缺省为"+"|
| 5 | offset | offset 偏移位置，支持计算,缺省为"0l"|
| 6 | count | 从偏移位置开始返回 count的数量记录，支持计算,缺省为"100l"|
| 7 | tag | 当前文档的节点,支持计算,缺省为"data"|


### 案例

参考[Zset类型操作案例](case.zset.md)