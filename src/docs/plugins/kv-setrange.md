kv-setrange
===========

kv-set用于设置数据行的部分值。本指令只能对String类型的table进行操作。

> 本指令对应redis的[SETRANGE](http://redis.io/commands/setrange)指令.

### 实现类

com.alogic.xscript.kvalue.string.KVSetRange

### 配置参数

支持下列参数：

| 编号 | 代码 | 说明 |
| ---- | ---- | ---- |
| 1 | pid | row的上下文对象id,缺省为$kv-row |
| 2 | id | 操作返回变量id,缺省为$kv-setrange |
| 3 | value | 待设置的值 |
| 4 | offset | 起始位置，缺省为0 |


### 案例

参考[String类型操作案例](case.string.md)