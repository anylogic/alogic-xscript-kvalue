kv-sadd.md
=======

kv-sadd.将一个或多个 元素加入到集合 key 当中，已经存在于集合的 元素将被忽略。返回被添加到集合中的新元素的数量，不包括被忽略的元素。并且将结果存入上下文变量。本指令只能用于Set类型table。

> 本指令对应redis的[SADD](http://redis.io/commands/sadd)指令.

### 实现类

com.alogic.xscript.kvalue.set.KVSAdd

### 配置参数

支持下列参数：

| 编号 | 代码 | 说明 |
| ---- | ---- | ---- |
| 1 | pid | row的上下文对象id,缺省为$kv-row |
| 2 | id | 操作返回变量id,缺省为$kv-sadd |
| 3 | item | 一个或者多个元素的拼接字符串,支持计算,缺省为"" |
| 4 | delimeter | 分割符,不支持计算,缺省为"；"|

### 案例

参考[Set类型操作案例](case.set.md)