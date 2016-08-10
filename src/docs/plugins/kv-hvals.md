kv-hvals
========

kv-hvals用于提取整个数据行记录value列表，并将结果插入到当前文档节点，本指令只能对Hash类型的table进行操作。

> 本指令对应redis的[HVALS](http://redis.io/commands/hvals)指令.

### 实现类

com.alogic.xscript.kvalue.string.KVHVals

### 配置参数

支持下列参数：

| 编号 | 代码 | 说明 |
| ---- | ---- | ---- |
| 1 | pid | row的上下文对象id,缺省为$kv-row |
| 2 | id | 操作返回变量id,缺省为$kv-hvals，在本插件中无意义 |
| 3 | tag | 插入时的tag |


### 案例

参考[Hash类型操作案例](case.hash.md)