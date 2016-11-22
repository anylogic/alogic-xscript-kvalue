kv-zremrangebylex.md
=======

kv-zremrangebylex.用于移除有序集合中给定的字典区间的所有成员。将结果存入上下文变量。本指令只能用于Zset类型table。

> 本指令对应redis的[ZREMRANGEBYLEX](http://http://redis.io/commands/zremrangebylex)指令.  

### 实现类

com.alogic.xscript.kvalue.zset.KVZRemoveByLex

### 配置参数

支持下列参数：

| 编号 | 代码 | 说明 |
| ---- | ---- | ---- |
| 1 | pid | row的上下文对象id,缺省为$kv-row |
| 2 | id | 操作返回变量id,缺省为$kv-zremrangebylex |
| 3 | min | 字典区间最小值字符串,支持计算,缺省为"-" |
| 4 | max | 字典区间最大值字符串，支持计算,缺省为"+"|


### 案例

参考[Zset类型操作案例](case.zset.md)