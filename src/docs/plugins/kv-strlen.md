kv-strlen
=========

kv-set用于计算数据行当前值的长度。本指令只能对String类型的table进行操作。

> 本指令对应redis的[STRLEN](http://redis.io/commands/strlen)指令.

### 实现类

com.alogic.xscript.kvalue.string.KVStrlen

### 配置参数

支持下列参数：

| 编号 | 代码 | 说明 |
| ---- | ---- | ---- |
| 1 | pid | row的上下文对象id,缺省为$kv-row |
| 2 | id | 操作返回变量id,缺省为$kv-strlen |


### 案例

参考[String类型操作案例](case.string.md)