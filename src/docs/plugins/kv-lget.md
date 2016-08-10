kv-lget
=======

kv-lget用于获取指定位置的元素，并将结果存入上下文变量。本指令只能用于List类型的table。

> 本指令对应redis的[LGET](http://redis.io/commands/lget)指令.

### 实现类

com.alogic.xscript.kvalue.string.KVLGet

### 配置参数

支持下列参数：

| 编号 | 代码 | 说明 |
| ---- | ---- | ---- |
| 1 | pid | row的上下文对象id,缺省为$kv-row |
| 2 | id | 操作返回变量id,缺省为$kv-lget |
| 3 | index | 指定的位置，缺省为0 |
| 4 | dft | 缺省值，缺省为空 |

### 案例

参考[List类型操作案例](case.list.md)