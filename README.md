alogic-xscript-kvalue
=====================

alogic-xscript-kvalue是基于xscript2.0的kvalue插件，提供了使用kvalue所需的相关指令，无缝对接redis等kvalue实现。

### 案例

下面的案例是对redis缓存的Hash类型的操作.

```xml

	<script>
		<using xmlTag = "kv-row" module="com.alogic.xscript.kvalue.KVRow"/>
		
		<array tag="log">
			<kv-row schema="demo" table="hash" key="test">
				<kv-hmset values="id;alogic;name;ketty;note;it's a web server"/>
				
				<array-item><get id="result" value="${$kv-hmset}"/></array-item>
				
				<kv-hset key="address" value="192.168.1.23"/>
				<array-item><get id="result" value="${$kv-hset}"/></array-item>
				
				<kv-hget key="note"/>
				<array-item><get id="result" value="${$kv-hget}"/></array-item>
				
				<kv-hmget tag="mget" keys="id;name"/>
				
				<kv-hgetall tag="getall"/>
			</kv-row>
		</array>
		
	</script>	

```

### 如何开始？

为了运行上面的指令，你必须要做下列工作：
* 启动一个redis服务器;
* 在环境变量中配置redis服务器的地址和端口，参考[settings.xml](src/test/resources/conf/settings.xml);
```xml

	<?xml version="1.0"?>
	<settings>
		<parameter id="kvalue.master" value="java:///conf/kvalue.xml#App" />
		<parameter id="redis.server0.ip" value="localhost" final="true"/>
		<parameter id="redis.server0.port" value="6379" final="true"/>
	</settings>	

```

* 指定一个kvalue配置文件，参考[kvalue.xml](src/test/resources/conf/kvalue.xml);
```xml

	<?xml version="1.0" encoding="UTF-8"?>
	<kvdb>
		<context>
			<schema id="demo" module="com.logicbus.redis.kvalue.RedisSchema">
				<redis.source module="com.logicbus.redis.context.InnerContext">
					<rcp id = "redis0" host="${redis.server0.ip}" port="${redis.server0.port}" defaultDB="0" maxIdle="20" maxActive="100"/>
				</redis.source>
				<redis.tables>
					<table name="zset" possessive="false" dataType="SortedSet">
						<partitioner module="com.logicbus.kvalue.common.SimpleHash" nodesCnt="1">
							<partition src="redis0"/>
							<partitions>
								<partition case="0" src="redis0"/>
							</partitions>
						</partitioner>									 
					</table>	
					<table name="hash" possessive="false" dataType="Hash">
						<partitioner module="com.logicbus.kvalue.common.SimpleHash" nodesCnt="1">
							<partition src="redis0"/>
							<partitions>
								<partition case="0" src="redis0"/>
							</partitions>
						</partitioner>									 
					</table>	
					<table name="str" possessive="false" dataType="String">
						<partitioner module="com.logicbus.kvalue.common.SimpleHash" nodesCnt="1">
							<partition src="redis0"/>
							<partitions>
								<partition case="0" src="redis0"/>
							</partitions>
						</partitioner>									 
					</table>
					<table name="list" possessive="false" dataType="List">
						<partitioner module="com.logicbus.kvalue.common.SimpleHash" nodesCnt="1">
							<partition src="redis0"/>
							<partitions>
								<partition case="0" src="redis0"/>
							</partitions>
						</partitioner>									 
					</table>										
				</redis.tables>
			</schema>
		</context>
	</kvdb>

```
在上面的配置文件中，创建一个名为demo的schema，并在其中创建了4张表(zset,hash,str,list),分别用于测试SortedSet,Hash,String,List等4种常见的redis数据类型。

做好上面的工作之后，可以运行[demo](src/test/java/Demo.java)来测试xscript脚本。

### 指令参考

参见[alogic-xscript-rest参考](src/docs/reference.md)。

### 版本历史
    - 0.0.1 [20160804 duanyy]
		+ 初次发布
