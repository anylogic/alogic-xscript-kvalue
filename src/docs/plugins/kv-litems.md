kv-litems
=========

kv-litems用于提取列表指定范围的元素，并将结果插入文档的当前节点。本指令只能用于List类型的table。

> 本指令对应redis的[LRANGE](http://redis.io/commands/lrange)指令.

### 实现类

com.alogic.xscript.kvalue.string.KVLItems

### 配置参数

支持下列参数：

| 编号 | 代码 | 说明 |
| ---- | ---- | ---- |
| 1 | pid | row的上下文对象id,缺省为$kv-row |
| 2 | id | 操作返回变量id,缺省为$kv-llpush |
| 3 | start | 范围的开始位置，缺省为0 |
| 4 | stop | 范围的结束位置，缺省为100 |
| 5 | tag | 插入文档的tag，缺省为data |

### 案例

参考[List类型操作案例](case.list.md)