kv-smembers.md
=======

kv-smembers.返回集合 key 中的所有成员。并将结果插入到当前文档节点。本指令只能用于Set类型table。

> 本指令对应redis的[SMEMBERS](http://redis.io/commands/smember)指令.

### 实现类

com.alogic.xscript.kvalue.set.KVSMembers

### 配置参数

支持下列参数：

| 编号 | 代码 | 说明 |
| ---- | ---- | ---- |
| 1 | pid | row的上下文对象id,缺省为$kv-row |
| 2 | id | 操作返回变量id,缺省为$kv-smember |
| 3 | tag | 当前文文档的节点,支持计算,缺省为"data" |


### 案例

参考[Set类型操作案例](case.set.md)