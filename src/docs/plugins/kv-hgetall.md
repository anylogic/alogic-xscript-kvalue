kv-hgetall
==========

kv-hgetall用于提取整个数据行的值，以JSON对象的形式插入到当前文档，本指令只能对Hash类型的table进行操作。

> 本指令对应redis的[HGETALL](http://redis.io/commands/hgetall)指令.

### 实现类

com.alogic.xscript.kvalue.string.KVHGetAll

### 配置参数

支持下列参数：

| 编号 | 代码 | 说明 |
| ---- | ---- | ---- |
| 1 | pid | row的上下文对象id,缺省为$kv-row |
| 2 | id | 操作返回变量id,缺省为$kv-hgetall，在本插件中无意义 |
| 3 | extend | 描述插入到当前文档的方式，如果为true，则扩展文档的当前节点，如果为false，则以一个子节点的方式插入 |
| 4 | tag | 子节点方式插入时的tag,当extend为false时有效 |


### 案例

参考[Hash类型操作案例](case.hash.md)