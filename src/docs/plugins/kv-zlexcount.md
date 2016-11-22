kv-zlexcount.md
=======

kv-zlexcount.计算有序集合中指定字典区间内成员数量。将结果存入上下文变量。本指令只能用于Zset类型table。

> 本指令对应redis的[ZLEXCOUNT](http://http://redis.io/commands/zlexcount)指令.  

### 实现类

com.alogic.xscript.kvalue.zset.KVZCountByLex

### 配置参数

支持下列参数：

| 编号 | 代码 | 说明 |
| ---- | ---- | ---- |
| 1 | pid | row的上下文对象id,缺省为$kv-row |
| 2 | id | 操作返回变量id,缺省为$kv-zlexcount |
| 3 | min | 字典区间最小值字符串,支持计算,缺省为"-" |
| 4 | max | 字典区间最大值字符串，支持计算,缺省为"+"|


### 案例

参考[Zset类型操作案例](case.zset.md)