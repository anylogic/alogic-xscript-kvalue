kv-zcard.md
=======

kv-zcard.返回有序集 key 的基数(集合中元素的数量),将结果存入上下文变量。本指令只能用于Zset类型table。

> 本指令对应redis的[ZCARD](http://redis.io/commands/zcard)指令.

### 实现类

com.alogic.xscript.kvalue.zset.KVZCard

### 配置参数

支持下列参数：

| 编号 | 代码 | 说明 |
| ---- | ---- | ---- |
| 1 | pid | row的上下文对象id,缺省为$kv-row |
| 2 | id | 操作返回变量id,缺省为$kv-zcard |


### 案例

参考[Zset类型操作案例](case.Zset.md)