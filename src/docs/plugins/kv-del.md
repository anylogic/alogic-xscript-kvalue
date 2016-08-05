kv-del
======

kv-del用于删除当前row。

kv-del会将操作结果以写入上下文变量，变量id由参数id定义，缺省为$kv-del。

> 本指令对应Redis的操作指令[DEL](http://redis.io/commands/del)

### 实现类

com.alogic.xscript.kvalue.KVDel

### 配置参数

支持下列参数：

| 编号 | 代码 | 说明 |
| ---- | ---- | ---- |
| 1 | pid | row的上下文对象id,缺省为$kv-row |
| 2 | id | 操作返回变量id,缺省为$kv-del |


### 案例

参考[String类型操作案例](case.string.md)
