kv-set
======

kv-set用于设置数据行的值。本指令只能对String类型的table进行操作。

> 本指令对应redis的[SET](http://redis.io/commands/set)指令.

### 实现类

com.alogic.xscript.kvalue.string.KVSet

### 配置参数

支持下列参数：

| 编号 | 代码 | 说明 |
| ---- | ---- | ---- |
| 1 | pid | row的上下文对象id,缺省为$kv-row |
| 2 | id | 操作返回变量id,缺省为$kv-set |
| 3 | value | 待设置的值 |
| 4 | ttl | 本行的生命周期,缺省为0 | 
| 5 | writeIfExist | 如果行存在，才写入，缺省为false |
| 6 | writeIfNotExist | 如果行不存在，才写入，缺省为false |


### 案例

参考[String类型操作案例](case.string.md)


