kv-llpush
=========

kv-llpush用于从列表的左边插入一个或多个元素。本指令只能用于List类型的table。

> 本指令对应redis的[LLPUSH](http://redis.io/commands/llpush)指令.

### 实现类

com.alogic.xscript.kvalue.string.KVLLPush

### 配置参数

支持下列参数：

| 编号 | 代码 | 说明 |
| ---- | ---- | ---- |
| 1 | pid | row的上下文对象id,缺省为$kv-row |
| 2 | id | 操作返回变量id,缺省为$kv-llpush |
| 3 | item | 待插入的元素,可以是多个,以delimeter分隔 |
| 4 | delimeter | 元素列表分隔符，缺省为空，当为空的时候，item表示单个元素 |

### 案例

参考[List类型操作案例](case.list.md)