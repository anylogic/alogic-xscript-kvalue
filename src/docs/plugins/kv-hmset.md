kv-hmset
========

kv-hmset用于同时设置多个field的值。本指令只能对String类型的table进行操作。

> 本指令对应redis的[HMSET](http://redis.io/commands/hmset)指令.

### 实现类

com.alogic.xscript.kvalue.string.KVMSet

### 配置参数

支持下列参数：

| 编号 | 代码 | 说明 |
| ---- | ---- | ---- |
| 1 | pid | row的上下文对象id,缺省为$kv-row |
| 2 | id | 操作返回变量id,缺省为$kv-hmget |
| 3 | values | 待设置的值的列表，列表中元素个数必须为偶数。奇数为field的key, 偶数表示field的value，列表通过delimeter分隔 |
| 4 | delimeter | values列表分隔符，缺省为; |

### 案例

参考[Hash类型操作案例](case.hash.md)
