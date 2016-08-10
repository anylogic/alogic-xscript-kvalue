kv-lset
=======

kv-lset用于设置指定位置的元素。本指令只能用于List类型的table。

> 本指令对应redis的[LSET](http://redis.io/commands/lset)指令.

### 实现类

com.alogic.xscript.kvalue.string.KVLSet

### 配置参数

支持下列参数：

| 编号 | 代码 | 说明 |
| ---- | ---- | ---- |
| 1 | pid | row的上下文对象id,缺省为$kv-row |
| 2 | id | 操作返回变量id,缺省为$kv-lget |
| 3 | index | 指定的位置，缺省为0 |
| 4 | value | 待插入的元素 |

### 案例

参考[List类型操作案例](case.list.md)