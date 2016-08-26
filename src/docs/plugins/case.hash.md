hash类型操作案例
==============

下面是一个Hash类型的操作案例。

> 您可以在工程代码目录下找到本案例代码
> ```
> 		/src/test/resources/xscript/hash.xml
> ```

下面是案例内容：

```xml

	<?xml version="1.0"?>
	<script>
		<using xmlTag = "kv-row" module="com.alogic.xscript.kvalue.KVRow"/>
		
		<!-- 打开 -->
		<kv-row schema="demo" table="hash" key="test">
			<!-- 设置一个field的值 -->
			<kv-hset key="id" value="alogic"/>
			<!-- 列出当前所有field到 -->
			<kv-hgetall tag="data1"/>
			
			<!-- 设置多个field的值 -->
			<kv-hmset values="name;ketty;note;it's a web server;address;localhost"/>
			<!-- 列出当前所有field到 -->
			<kv-hgetall tag="data2"/>				
			
			<!-- 获取指定field的值 -->			
			<kv-hget id="note" key="note"/>
			<log msg="the value of note is ${note}"/>
			
			<!-- 删除指定的field -->
			<kv-hdel key="note"/>	
			<!-- 列出当前所有field到 -->
			<kv-hgetall tag="data3"/>	
	
			<!-- 已经删除的field是否存在 -->
			<kv-hexist key="note"/>
			<log msg="Does note exist? ${$kv-hexist} "/>
	
			<!-- 当前有哪些keys -->
			<kv-hkeys tag="keys"/>
			
			<!-- 当前有哪些values -->
			<kv-hvals tag="vals"/>
		</kv-row>
		
	</script>

```