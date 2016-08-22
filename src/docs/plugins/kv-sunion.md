kv-sunion.md
=======

kv-sunion.返回一个集合的全部成员，该集合是所有给定集合之间的并集。并将结果插入到当前文档节点。本指令只能用于Set类型table。

> 本指令对应redis的[SUNION](http://redis.io/commands/sunion)指令.

### 实现类

com.alogic.xscript.kvalue.set.KVSUnion

### 配置参数

支持下列参数：

| 编号 | 代码 | 说明 |
| ---- | ---- | ---- |
| 1 | pid | row的上下文对象id,缺省为$kv-row |
| 2 | id | 操作返回变量id,缺省为$kv-sunion |
| 3 | others | 一个或者多个key的拼接字符串,支持计算,缺省为"" |
| 4 | delimeter | 分割符,不支持计算,缺省为"；"|
| 5 | tag | 当前文档的节点,支持计算,缺省为"data"|

### 案例

参考[Set类型操作案例](case.set.md)