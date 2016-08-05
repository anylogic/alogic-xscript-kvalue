kv-row
======

kv-row用于定位到一个kvalue数据库某个表的某个row,并定义一个namespace.

kv-row可以放在一个[kv-table](kv-table.md)环境下，也可以独立存在；如果独立存在的话，那么必须配置schema和table参数，kv-row会自动根据该参数定位到row.

### 实现类

com.alogic.xscript.kvalue.KVRow


### 配置参数

支持下列参数：

| 编号 | 代码 | 说明 |
| ---- | ---- | ---- |
| 1 | schema | 待连接的schema，通常定义在kvalue.xml文件中,如果放在kv-table的环境下，则无需配置 |
| 2 | table | 待连接的table,通常定义在kvalue.xml文件中，如果放在kv-table环境下，则无需配置 |
| 3 | pid | table的上下文对象id,缺省为$kv-table |
| 4 | cid | row的上下文对象id,缺省为$kv-row | 
| 5 | key | 待定位的row的key |
| 6 | enableRWSplit | 是否支持读写分离，缺省为true |


### 案例

下面是一个定位row的案例.

```xml
	
	<script>
		<using xmlTag="kv-schema" module="com.alogic.xscript.kvalue.KVSchema"/>
		
		<kv-schema schema="demo">		
			<kv-table table="str">
				<kv-row key="KEYID">
					<!--下面是对该row的操作-->
				</kv-row>
			</kv-table>
		</kv-schema>
	</script>
	
```

在某些时候，可以直接定位到一个row，例如:

```xml
	
	<script>
		<using xmlTag="kv-row" module="com.alogic.xscript.kvalue.KVRow"/>
		<kv-row schema="demo" table="str" key="KEYID">
			<!--下面是对该row的操作-->
		</kv-row>
	</script>
	
```

上面两种写法是等同的。