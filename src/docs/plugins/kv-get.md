kv-get
======

kv-get用于获取数据行的值，并将该值存入到指定的变量中。本指令只能对String类型的table进行操作。

> 本指令对应redis的[GET](http://redis.io/commands/get)指令.

### 实现类

com.alogic.xscript.kvalue.string.KVGet

### 配置参数

支持下列参数：

| 编号 | 代码 | 说明 |
| ---- | ---- | ---- |
| 1 | pid | row的上下文对象id,缺省为$kv-row |
| 2 | id | 操作返回变量id,缺省为$kv-get |
| 3 | dft | 缺省值，当该row不存在时，以缺省值返回 |

### 案例

参考[String类型操作案例](case.string.md)






