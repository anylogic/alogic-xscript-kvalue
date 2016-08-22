kv-srandmember.md
=======

kv-srandmember.返回集合中的一个随机元素,将结果存入上下文变量。本指令只能用于Set类型table。

> 本指令对应redis的[SRANDMEMBER](http://redis.io/commands/srandmember)指令.

### 实现类

com.alogic.xscript.kvalue.set.KVSRandmember

### 配置参数

支持下列参数：

| 编号 | 代码 | 说明 |
| ---- | ---- | ---- |
| 1 | pid | row的上下文对象id,缺省为$kv-row |
| 2 | id | 操作返回变量id,缺省为$kv-srandmember |


### 案例

参考[Set类型操作案例](case.set.md)