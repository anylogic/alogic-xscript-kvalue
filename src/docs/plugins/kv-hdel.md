kv-hdel
=======

kv-hdel用于删除hash类型数据中的某些field。本指令只能对Hash类型的table进行操作。

> 本指令对应redis的[HDEL](http://redis.io/commands/hdel)指令.

### 实现类

com.alogic.xscript.kvalue.string.KVHDel

### 配置参数

支持下列参数：

| 编号 | 代码 | 说明 |
| ---- | ---- | ---- |
| 1 | pid | row的上下文对象id,缺省为$kv-row |
| 2 | id | 操作返回变量id,缺省为$kv-hdel |
| 3 | key | 待删除的field的key,可以是多个,以delimeter分隔 |
| 4 | delimeter | key列表分隔符，缺省为空，当为空的时候，key表示某个field的key |


### 案例

参考[Hash类型操作案例](case.hash.md)