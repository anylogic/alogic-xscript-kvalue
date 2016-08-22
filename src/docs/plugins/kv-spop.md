kv-spop.md
=======

kv-spop.移除并返回集合中的一个随机元素,将结果存入上下文变量。本指令只能用于Set类型table。

> 本指令对应redis的[SPOP](http://redis.io/commands/spop)指令.

### 实现类

com.alogic.xscript.kvalue.set.KVSpop

### 配置参数

支持下列参数：

| 编号 | 代码 | 说明 |
| ---- | ---- | ---- |
| 1 | pid | row的上下文对象id,缺省为$kv-row |
| 2 | id | 操作返回变量id,缺省为$kv-spop |


### 案例

参考[Set类型操作案例](case.set.md)