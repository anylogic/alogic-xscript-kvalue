kv-exist
========

kv-exist用于检查当前row是否存在。

kv-exist会将操作结果写入上下文变量，变量id由参数id指定，缺省为$kv-exist。

> 本指令对应Redis的操作指令[EXISTS](http://redis.io/commands/exists)

### 实现类

com.alogic.xscript.kvalue.KVExist

### 配置参数

支持下列参数：

| 编号 | 代码 | 说明 |
| ---- | ---- | ---- |
| 1 | pid | row的上下文对象id,缺省为$kv-row |
| 2 | id | 操作返回变量id,缺省为$kv-exist |


### 案例

参考[String类型操作案例](case.string.md)
