kv-zremrangebyrank
======

kv-zremrangebyrank移除有序集 key 中，指定排名(rank)区间内的所有成员。返回被移除的成员的数量。将结果存入上下文变量。本指令只能对zset类型的table进行操作。

> 本指令对应redis的[ZREMRANGEBYRANK](http://redis.io/commands/zremrangebyrank)指令.

### 实现类

com.alogic.xscript.kvalue.zset.KVZremrangebyrank

### 配置参数

支持下列参数：

| 编号 | 代码 | 说明 |
| ---- | ---- | ---- |
| 1 | pid | row的上下文对象id,缺省为$kv-row |
| 2 | id | 操作返回变量id,缺省为$kv-zremrangebyrank |
| 3 | start | 位置区间最小值,支持计算,缺省为"0" |
| 4 | end | 位置区间最大值，支持计算,缺省为"0"|


### 案例

参考[Zset类型操作案例](case.zset.md)


