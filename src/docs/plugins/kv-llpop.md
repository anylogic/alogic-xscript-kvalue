kv-llpop.md
=======

kv-llpop.移除并返回列表 key 的头元素，如果列表key不存在元素，可选择性阻塞等待元素.并且将结果存入上下文变量。本指令只能用于List类型table。

> 本指令对应redis的[LPOP](http://redis.io/commands/lpop)指令和[BLPOP](http://redis.io/commands/blpop)指令.

### 实现类

com.alogic.xscript.kvalue.list.KVLLPop

### 配置参数

支持下列参数：

| 编号 | 代码 | 说明 |
| ---- | ---- | ---- |
| 1 | pid | row的上下文对象id,缺省为$kv-row |
| 2 | id | 操作返回变量id,缺省为$kv-llpop |
| 3 | block | 是否支持阻塞等待,支持计算,缺省为false |


### 案例

参考[List类型操作案例](case.list.md)