kv-zincrby.md
=======

kv-zincrby.为有序集 key 的成员 item 的 score 值加上增量 increment ,返回成员的新score值,将结果存入上下文变量。本指令只能用于Zset类型table。

> 本指令对应redis的[ZINCRBY](http://redis.io/commands/zincrby)指令.

### 实现类

com.alogic.xscript.kvalue.zset.KVZincrby

### 配置参数

支持下列参数：

| 编号 | 代码 | 说明 |
| ---- | ---- | ---- |
| 1 | pid | row的上下文对象id,缺省为$kv-row |
| 2 | id | 操作返回变量id,缺省为$kv-zincrby |
| 3 | item | 有序集合的成员,支持计算,缺省为"" |
| 4 | increment | 增加的分值，支持计算,缺省为"0"|

### 案例

参考[Zset类型操作案例](case.zset.md)