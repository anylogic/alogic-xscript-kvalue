kv-sinterstore.md
=======

kv-sinterstore.这个命令的作用和 SINTER 类似，但它将结果保存到 dstKey 集合，返回集合中元素的数量，将结果插入到当前文档节点。本指令只能用于Set类型table。

> 本指令对应redis的[SINTERSTORE](http://redis.io/commands/sinterstore)指令.

### 实现类

com.alogic.xscript.kvalue.set.KVSInterStore

### 配置参数

支持下列参数：

| 编号 | 代码 | 说明 |
| ---- | ---- | ---- |
| 1 | pid | row的上下文对象id,缺省为$kv-row |
| 2 | id | 操作返回变量id,缺省为$kv-sinterstore |
| 3 | others | 一个或者多个key的拼接字符串,支持计算,缺省为"" |
| 4 | dstKey | 指定用来存放结果的集合,支持计算,缺省为"" |
| 5 | delimeter | 分割符,不支持计算,缺省为"；"|

### 案例

参考[Set类型操作案例](case.set.md)