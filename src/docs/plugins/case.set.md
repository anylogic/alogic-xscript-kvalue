set类型操作案例
==============

下面是一个Set类型的操作案例。

> 您可以在工程代码目录下找到本案例代码
> ```
> 		/src/test/resources/xscript/set.xml
> ```

下面是案例内容：

```xml

	<?xml version="1.0"?>
	<script>
		<using xmlTag = "kv-row" module="com.alogic.xscript.kvalue.KVRow"/>
		
		<!-- 辅助数据，用来测试差集，交集，并集 -->
		<kv-row schema="demo" table="set" key="test1">
			<kv-sadd item="one;two;nihao" delimeter=";"/>
		</kv-row>
		
		<!-- 打开 -->
		<kv-row schema="demo" table="set" key="test">
			<!-- 批量添加元素 -->
			<kv-sadd item="one;two;three;four;hello;world;xiexie" delimeter=";"/>
			<log msg="The kv-sadd length is ${$kv-sadd}"/>
			
			<!-- 返回set里的元素 -->
			<kv-smembers tag="data1"/>
					
			<!-- 返回set元素数量 -->
			<kv-scard/>
			<log msg="The kv-scard length is ${$kv-scard}"/>
			
			<!-- 差集 -->
			<kv-sdiff others="set:test1" delimeter=";" tag="kv-sdiff"/>
			<kv-sdiffstore dstKey="set:sdiffstore" others="set:test1" delimeter=";"/>
			
			
			<!-- 交集 -->
			<kv-sinter others="set:test1" delimeter=";" tag="kv-sinter"/>
			<kv-sinterstore dstKey="set:sinterstore" others="set:test1" delimeter=";"/>
			
			<!-- 并集 -->
			<kv-sunion others="set:test1" delimeter=";" tag="kv-sunion"/>
			<kv-sunionstore dstKey="set:sunionstore" others="set:test1" delimeter=";"/>
			
			<!-- 判断是否set的元素 -->
			<kv-sismember item="three"/>
			<log msg="The kv-sismember is ${$kv-sismember}"/>
			
			<!-- 随机返回一个元素，并没从set里移除该元素 -->
			<kv-srandmember />
			<log msg="The kv-srandmember is ${$kv-srandmember}"/>
			<kv-smembers tag="aftersrandmember"/>
			
			<!-- 随机返回一个元素，且从set里移除该元素 -->
			<kv-spop />
			<log msg="The kv-spop is ${$kv-spop}"/>
			<kv-smembers tag="afterpop"/>
			
			<kv-srem item="two;three"  delimeter=";"/>
			<kv-smembers tag="afterrem"/>
			
			<kv-del/>
		</kv-row>
		
		
		<kv-row schema="demo" table="set" key="test1">
			<kv-del/>
		</kv-row>
		<kv-row schema="demo" table="set" key="sdiffstore">
			<kv-smembers tag="sdiffstore"/>
			<kv-del/>
		</kv-row>
		<kv-row schema="demo" table="set" key="sinterstore">
			<kv-smembers tag="sinterstore"/>
			<kv-del/>
		</kv-row>
		<kv-row schema="demo" table="set" key="sunionstore">
			<kv-smembers tag="sunionstore"/>
			<kv-del/>
		</kv-row>
	</script>

```