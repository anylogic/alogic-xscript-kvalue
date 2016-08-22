kv-lrm.md
=======

kv-lrm.根据参数 COUNT 的值，移除列表中与参数 VALUE 相等的元素.
count 的值可以是以下几种：
* count > 0 : 从表头开始向表尾搜索，移除与 value 相等的元素，数量为 count 。
* count < 0  从表尾开始向表头搜索，移除与 value 相等的元素，数量为 count 的绝对值。
* count = 0 : 移除表中所有与 value 相等的值。  
返回结果为被移除元素的数量，并且将结果存入上下文变量。本指令只能用于List类型table。

> 本指令对应redis的[LREM](http://redis.io/commands/lrem)指令.

### 实现类

com.alogic.xscript.kvalue.list.KVLRem

### 配置参数

支持下列参数：

| 编号 | 代码 | 说明 |
| ---- | ---- | ---- |
| 1 | pid | row的上下文对象id,缺省为$kv-row |
| 2 | id | 操作返回变量id,缺省为$kv-lrm |
| 3 | count | 移除的元素数量,支持计算,缺省为1|


### 案例

参考[List类型操作案例](case.list.md)