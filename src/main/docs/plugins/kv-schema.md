kv-schema
=========

kv-schema用于定位到一个kvalue数据的schema，并定义一个namespace。

kv-schema并不是必须的，可以采用[kv-table](kv-table.md)或[kv-row](kv-row)替代。

### 实现类

com.alogic.xscript.kvalue.KVSchema


### 配置参数

支持下列参数：

| 编号 | 代码 | 说明 |
| ---- | ---- | ---- |
| 1 | schema | 待连接的schema，通常定义在kvalue.xml文件中 |
| 2 | cid | 上下文对象的id,缺省为$kv-schema |


### 案例

下面是一个定位schema的案例.

```
	
	<script>
		<using xmlTag="kv-schema" module="com.alogic.xscript.kvalue.KVSchema"/>
		
		<kv-schema schema="demo">
		
			<!--下面是针对kvalue数据库demo的操作-->
		
		</kv-schema>
	</script>
	
```