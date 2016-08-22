kv-sismember.md
=======

kv-sismember.判断 item 元素是否集合 key 的成员。并且将结果存入上下文变量。本指令只能用于Set类型table。

> 本指令对应redis的[SISMEMBER](http://redis.io/commands/sismember)指令.

### 实现类

com.alogic.xscript.kvalue.set.KVSIsmember

### 配置参数

支持下列参数：

| 编号 | 代码 | 说明 |
| ---- | ---- | ---- |
| 1 | pid | row的上下文对象id,缺省为$kv-row |
| 2 | id | 操作返回变量id,缺省为$kv-sismember |
| 3 | item | 一个元素,支持计算,缺省为"" |


### 案例

参考[Set类型操作案例](case.set.md)