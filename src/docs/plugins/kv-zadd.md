kv-zadd
======

kv-zadd将一个或多个 item 元素及其 score 值加入到有序集 key 当中,返回被成功添加的新成员的数量，不包括那些被更新的、已经存在的成员。将结果存入上下文变量。本指令只能对zset类型的table进行操作。

> 本指令对应redis的[ZADD](http://redis.io/commands/zadd)指令.

### 实现类

com.alogic.xscript.kvalue.zset.KVZAdd

### 配置参数

支持下列参数：

| 编号 | 代码 | 说明 |
| ---- | ---- | ---- |
| 1 | pid | row的上下文对象id,缺省为$kv-row |
| 2 | id | 操作返回变量id,缺省为$kv-zadd |
| 3 | item | 一个或者多个元素的拼接字符串,支持计算,缺省为"" |
| 4 | score | 一个或者多个元素的分值的拼接字符串,支持计算,缺省为"" |
| 5 | delimeter | 分割符,不支持计算,缺省为"；"|


### 案例

参考[Zset类型操作案例](case.zset.md)


