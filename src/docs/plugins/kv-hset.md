kv-hset
=======

kv-hset用于设置Hash类型数据中的field的取值。本指令只能对Hash类型的table进行操作。

> 本指令对应redis的[HSET](http://redis.io/commands/hset)指令.

### 实现类

com.alogic.xscript.kvalue.string.KVHSet

### 配置参数

支持下列参数：

| 编号 | 代码 | 说明 |
| ---- | ---- | ---- |
| 1 | pid | row的上下文对象id,缺省为$kv-row |
| 2 | id | 操作返回变量id,缺省为$kv-hset |
| 3 | key | 设置field的key |
| 4 | value | field的value，支持计算 |


### 案例

参考[Hash类型操作案例](case.hash.md)