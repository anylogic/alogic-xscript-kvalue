kv-ltrim.md
=======

对一个列表进行修剪(trim)，就是说，让列表只保留指定区间内的元素，不在指定区间之内的元素都将被删除。
命令返回结果为（start-stop），并且将结果存入上下文变量。本指令只能用于List类型table。

> 本指令对应redis的[LTRIM](http://redis.io/commands/ltrim)指令.

### 实现类

com.alogic.xscript.kvalue.list.KVLTrim

### 配置参数

支持下列参数：

| 编号 | 代码 | 说明 |
| ---- | ---- | ---- |
| 1 | pid | row的上下文对象id,缺省为$kv-row |
| 2 | id | 操作返回变量id,缺省为$kv-ltrim |
| 3 | start | 指定区间的开始下标,支持计算,缺省为0|
| 4 | end | 指定区间的结束下标,支持计算,缺省为-1|

### 案例

参考[List类型操作案例](case.list.md)