kv-table
========

kv-table用于定位到kvalue数据库的一张表上，同时定义一个namespace.

kv-table可以定义在一个[kv-schema](kv-schema.md)环境下；如果没有定义在[kv-schema](kv-schema.md)环境下，那么就需要配置schema参数，kv-table会自动根据该参数连接一个schema。

kv-table并不是必须的，有些时候，可以直接采用[kv-row](kv-row.md)来连接到指定表。


### 实现类

com.alogic.xscript.kvalue.KVTable


### 配置参数

支持下列参数：

| 编号 | 代码 | 说明 |
| ---- | ---- | ---- |
| 1 | schema | 待连接的schema，通常定义在kvalue.xml文件中,如果放在kv-schema的环境下，则无需配置 |
| 2 | pid | schema的上下文对象id,缺省为$kv-schema |
| 3 | table | 待连接的table，通常定义在kvalue.xml文件中 |
| 4 | cid | table的上下文对象id,缺省为$kv-table | 


### 案例

下面是一个定位table的案例.

```xml
	
	<script>
		<using xmlTag="kv-schema" module="com.alogic.xscript.kvalue.KVSchema"/>
		
		<kv-schema schema="demo">		
			<kv-table table="str">
				<!--下面是对demo下str表的操作-->
			</kv-table>
		</kv-schema>
	</script>
	
```

在某些时候，可以直接定位到table，例如：

```xml
	
	<script>
		<using xmlTag="kv-table" module="com.alogic.xscript.kvalue.KVTable"/>
		
		<kv-table schema="demo" table="str">
			
			<!--下面是对demo下str表的操作-->
		
		</kv-table>
	</script>
	
```

下面两个案例效果是等同的。
