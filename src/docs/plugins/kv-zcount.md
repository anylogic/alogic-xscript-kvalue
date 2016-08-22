kv-zcount.md
=======

kv-zcount.返回有序集 key 中， score 值在 min 和 max 之间(默认包括 score 值等于 min 或 max )的成员的数量,将结果存入上下文变量。本指令只能用于Zset类型table。

> 本指令对应redis的[ZCOUNT](http://redis.io/commands/zcount)指令.

### 实现类

com.alogic.xscript.kvalue.zset.KVZcount

### 配置参数

支持下列参数：

| 编号 | 代码 | 说明 |
| ---- | ---- | ---- |
| 1 | pid | row的上下文对象id,缺省为$kv-row |
| 2 | id | 操作返回变量id,缺省为$kv-zcount |
| 3 | min | score区间最小值,支持计算,缺省为"0" |
| 4 | max | score区间最大值，支持计算,缺省为"10"|

### 案例

参考[Zset类型操作案例](case.zset.md)