kv-zrangebyscore.md
=======

kv-zrangebyscore.返回有序集 key 中，所有score介于min和max间的成员，将结果插入到当前文档节点。本指令只能用于Zset类型table。

> 本指令对应redis的[ZRANGEBYSCORE](http://redis.io/commands/zrangebyscore)指令和[ZREVRANGEBYSCORE](http://redis.io/commands/zrevrangebyscore)指令.

### 实现类

com.alogic.xscript.kvalue.zset.KVZrangebyscore

### 配置参数

支持下列参数：

| 编号 | 代码 | 说明 |
| ---- | ---- | ---- |
| 1 | pid | row的上下文对象id,缺省为$kv-row |
| 2 | id | 操作返回变量id,缺省为$kv-zrangebyscore |
| 3 | min | 分值区间最小值,支持计算,缺省为"0" |
| 4 | max | 分值区间最大值，支持计算,缺省为"150"|
| 5 | reverse | 是否按分值从大到小排序，支持计算,缺省为"false"|
| 6 | withscores | 返回的成员是否包括它的分值，支持计算,缺省为"false"|
| 7 | withscore-item-type | 指定返回的成员的类型，withscore-item-type=string,返回的类型为字符串，格式如下“e:element;s:score”;withscore-item-type=map,item的类型为map,格式如下{“element”:"score"},缺省为"string"|
| 8 | offset | offset 偏移位置，支持计算,缺省为"0l"|
| 9 | count | 从偏移位置开始返回 count的数量记录，支持计算,缺省为"100l"|
| 10 | tag | 当前文档的节点,支持计算,缺省为"data"|


### 案例

参考[Zset类型操作案例](case.zset.md)