kv-linsert.md
=======

kv-linsert将值 item 插入到列表 key 当中，位于值 pivot 之前或之后,返回插入操作完成之后，列表的长度.并且将结果存入上下文变量。本指令只能用于List类型table。

> 本指令对应redis的[LINSERT](http://redis.io/commands/linsert)指令.

### 实现类

com.alogic.xscript.kvalue.list.KVLInsert

### 配置参数

支持下列参数：

| 编号 | 代码 | 说明 |
| ---- | ---- | ---- |
| 1 | pid | row的上下文对象id,缺省为$kv-row |
| 2 | id | 操作返回变量id,缺省为$kv-linsert |
| 3 | value | 待插入的元素,支持计算 |
| 4 | pivot | 参照的元素,支持计算 |
| 5 | insertAfter | 参照元素之后插入,支持计算,缺省为false |

### 案例

参考[List类型操作案例](case.list.md)