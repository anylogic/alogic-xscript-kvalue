kv-hexist
=========

kv-hexist用于测试hash类型数据中的某些field是否存在。本指令只能对Hash类型的table进行操作。

> 本指令对应redis的[HEXISTS](http://redis.io/commands/hexists)指令.

### 实现类

com.alogic.xscript.kvalue.string.KVHExist

### 配置参数

支持下列参数：

| 编号 | 代码 | 说明 |
| ---- | ---- | ---- |
| 1 | pid | row的上下文对象id,缺省为$kv-row |
| 2 | id | 操作返回变量id,缺省为$kv-hexist |
| 3 | key | 待测试field的key |


### 案例

参考[Hash类型操作案例](case.hash.md)