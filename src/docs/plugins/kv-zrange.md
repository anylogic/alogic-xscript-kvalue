kv-zrange.md
=======

kv-zrange.返回有序集 key 中，指定区间内的成员，将结果插入到当前文档节点。本指令只能用于Zset类型table。

> 本指令对应redis的[ZRANGE](http://redis.io/commands/zrange)指令和[ZREVRANGE](http://redis.io/commands/zrevrange)指令.

### 实现类

com.alogic.xscript.kvalue.zset.KVZrange

### 配置参数

支持下列参数：

| 编号 | 代码 | 说明 |
| ---- | ---- | ---- |
| 1 | pid | row的上下文对象id,缺省为$kv-row |
| 2 | id | 操作返回变量id,缺省为$kv-zrange |
| 3 | start | 位置区间最小值,支持计算,缺省为"0" |
| 4 | end | 位置区间最大值，支持计算,缺省为"150"|
| 5 | reverse | 是否按分值从大到小排序，支持计算,缺省为"false"|
| 6 | withscores | 返回的成员是否包括它的分值，支持计算,缺省为"false"|
| 7 | tag | 当前文档的节点,支持计算,缺省为"data"|


### 案例

参考[Zset类型操作案例](case.zset.md)