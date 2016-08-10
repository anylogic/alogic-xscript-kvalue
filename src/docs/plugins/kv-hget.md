kv-hget
=======

kv-hget用于提取Hash类型数据中的field的取值，并存入上下文变量。本指令只能对Hash类型的table进行操作。

> 本指令对应redis的[HGET](http://redis.io/commands/hget)指令.

### 实现类

com.alogic.xscript.kvalue.string.KVHGet

### 配置参数

支持下列参数：

| 编号 | 代码 | 说明 |
| ---- | ---- | ---- |
| 1 | pid | row的上下文对象id,缺省为$kv-row |
| 2 | id | 操作返回变量id,缺省为$kv-hget |
| 3 | key | 待提取field的key |
| 4 | dft | 缺省值，如果该key不存在，则返回缺省值 |


### 案例

参考[Hash类型操作案例](case.hash.md)