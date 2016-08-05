kv-ttl
======

kv-ttl用于操作row的ttl。

> kv-ttl对应着redis的[PTTL](http://redis.io/commands/pttl),[PEXPIRE](http://redis.io/commands/pexpire),[PERSIST](http://redis.io/commands/persist),[PEXPIREAT](http://redis.io/commands/pexpireat)

### 实现类

com.alogic.xscript.kvalue.KVTTL

### 配置参数

支持下列参数：

| 编号 | 代码 | 说明 |
| ---- | ---- | ---- |
| 1 | pid | row的上下文对象id,缺省为$kv-row |
| 2 | id | 操作返回变量id,缺省为$kv-ttl |
| 3 | ttl | row的生存时间，单位毫秒，缺省为0 |
| 4 | at | ttl的值是否为绝对时间，缺省为false |

kv-ttl支持4种工作模式：

- 当ttl参数值为0的时候，表示是获取当前的ttl，对应了redis的[PTTL](http://redis.io/commands/pttl)；
- 当ttl参数值为负数的时候，表示移除当前的ttl，对应了redis的[PERSIST](http://redis.io/commands/persist);
- 当ttl为正数，且at为true的时候，表示以绝对时间来设置ttl，对应了redis的[PEXPIREAT](http://redis.io/commands/pexpireat);
- 当ttl为正数，且at为false的时候，表示以相对时间来设置ttl，对应了redis的[PEXPIRE](http://redis.io/commands/pexpire);

### 案例

参考[String类型操作案例](case.string.md)