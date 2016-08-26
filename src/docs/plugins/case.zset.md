sortedset类型操作案例
==============

下面是一个Sortedset类型的操作案例。

> 您可以在工程代码目录下找到本案例代码
> ```
> 		/src/test/resources/xscript/zset.xml
> ```

下面是案例内容：

```xml

	<?xml version="1.0"?>
	<script>
		<using xmlTag = "kv-row" module="com.alogic.xscript.kvalue.KVRow"/>
		
		<!-- 打开 -->
		<kv-row schema="demo" table="zset" key="test">
			<!-- 从左边插入单个值 -->
			<kv-zadd item="alogic;nihao;wohao;last;first" score="8.4;2;5.67;100;0" delimeter=";"/>
			<!-- 提取到data1 -->
			<kv-zrange start="0" end="15" withscores="false" reverse="false" tag="data1"/>
			<kv-zrange start="0" end="15" withscores="true" reverse="true" tag="data2"/>			
			<!-- 本次测试完成，删除 -->
			
			<kv-zcard/>
			<log msg="The kv-zcard length is ${$kv-zcard}"/>
			
			<kv-zcount min="0" max="3"/>
			<log msg="The kv-zcount length is ${$kv-zcount}"/>
			
			<kv-zincrby item="alogic" increment="100"/>
			<log msg="The kv-zincrby score is ${$kv-zincrby}"/>
			<kv-zrange start="0" end="15" withscores="true" reverse="true" tag="data3"/>
			
			<kv-zrank item="nihao" reverse="false"/>
			<log msg="The kv-zrank is ${$kv-zrank}"/>
			<kv-zrank item="nihao" reverse="true"/>
			<log msg="The kv-zrank reverse is ${$kv-zrank}"/>
			
			<kv-zremrangebyscore min="0" max="3"/>
			<kv-zrange start="0" end="-1" withscores="false" reverse="false" tag="data4"/>
			
			<kv-zremrangebyrank start="0" end="1"/>
			<kv-zrange start="0" end="1" withscores="false" reverse="false" tag="data5"/>
			
			<kv-zrem item="notexist"/>
			<log msg="The kv-zem  is ${$kv-zrem}"/>
			
			<kv-zscore item="alogic" />
			<log msg="The kv-zscore  is ${$kv-zscore}"/>
			
			<kv-del/>
		</kv-row>
		
	</script>
```