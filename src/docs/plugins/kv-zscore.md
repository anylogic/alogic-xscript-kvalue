kv-zscore.md
=======

kv-zscore.返回有序集 key 中，成员 item 的 score 值,将结果存入上下文变量。本指令只能用于Zset类型table。

> 本指令对应redis的[ZSCORE](http://redis.io/commands/zscore)指令.

### 实现类

com.alogic.xscript.kvalue.zset.KVZscore

### 配置参数

支持下列参数：

| 编号 | 代码 | 说明 |
| ---- | ---- | ---- |
| 1 | pid | row的上下文对象id,缺省为$kv-row |
| 2 | id | 操作返回变量id,缺省为$kv-zscore |
| 3 | item | 有序集合的成员,支持计算,缺省为"" |


### 案例

参考[Zset类型操作案例](case.zset.md)