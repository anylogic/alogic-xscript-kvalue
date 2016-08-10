kv-hmget
========

kv-hmget用于获取数据行的多个field的值，并将结果插入当前文档。本指令只能对String类型的table进行操作。

> 本指令对应redis的[HMGET](http://redis.io/commands/hmget)指令.

### 实现类

com.alogic.xscript.kvalue.string.KVHMGet

### 配置参数

支持下列参数：

| 编号 | 代码 | 说明 |
| ---- | ---- | ---- |
| 1 | pid | row的上下文对象id,缺省为$kv-row |
| 2 | id | 操作返回变量id,缺省为$kv-hmget |
| 3 | key | 待查询的field的key,可以是多个,以delimeter分隔 |
| 4 | delimeter | key列表分隔符，缺省为空，当为空的时候，key表示某个field的key |
| 5 | tag | 插入到当前文档的tag |

### 案例

参考[Hash类型操作案例](case.hash.md)



