kv-llen
=======

kv-llen用于计算数据行中列表元素的个数，并且将结果存入上下文变量。本指令只能用于List类型table。

> 本指令对应redis的[LLEN](http://redis.io/commands/llen)指令.

### 实现类

com.alogic.xscript.kvalue.string.KVLLength

### 配置参数

支持下列参数：

| 编号 | 代码 | 说明 |
| ---- | ---- | ---- |
| 1 | pid | row的上下文对象id,缺省为$kv-row |
| 2 | id | 操作返回变量id,缺省为$kv-llen |

### 案例

参考[List类型操作案例](case.list.md)