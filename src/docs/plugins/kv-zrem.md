kv-zrem
======

kv-zrem移除有序集 key 中的一个或多个成员，不存在的成员将被忽略。返回被成功移除的成员的数量，不包括被忽略的成员。将结果存入上下文变量。本指令只能对zset类型的table进行操作。

> 本指令对应redis的[ZREM](http://redis.io/commands/zrem)指令.

### 实现类

com.alogic.xscript.kvalue.zset.KVZrem

### 配置参数

支持下列参数：

| 编号 | 代码 | 说明 |
| ---- | ---- | ---- |
| 1 | pid | row的上下文对象id,缺省为$kv-row |
| 2 | id | 操作返回变量id,缺省为$kv-zrem |
| 3 | item | 一个或者多个元素的拼接字符串,支持计算,缺省为"" |
| 4 | delimeter | 分割符,不支持计算,缺省为"；"|


### 案例

参考[Zset类型操作案例](case.zset.md)


