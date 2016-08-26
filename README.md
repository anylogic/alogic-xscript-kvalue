alogic-xscript-kvalue
=====================

### Overview

alogic-xscript-kvalue是基于xscript2.0的kvalue插件，提供了使用kvalue所需的相关指令，无缝对接redis等kvalue实现。

### Getting started

按照以下步骤，您可轻松在您的项目中使用alogic-xscript-kvalue.

不过开始之前，我们希望您了解xscript的相关知识。

- [xscript2.0](https://github.com/yyduan/alogic/blob/master/alogic-doc/alogic-common/xscript2.md) - 您可以了解xscript的基本原理及基本编程思路
- [xscript2.0基础插件](https://github.com/yyduan/alogic/blob/master/alogic-doc/alogic-common/xscript2-plugins.md) - 如何使用xscript的基础插件
- [基于xscript的together](https://github.com/yyduan/alogic/blob/master/alogic-doc/alogic-common/xscript2-together.md) - 如何将你的script发布为alogic服务

#### 增加maven依赖

您可以在[中央仓库](http://mvnrepository.com/)上找到[alogic-xscript-kvalue](http://mvnrepository.com/search?q=com.github.anylogic%3Aalogic-xscript-kvalue)的发布版本。

```xml

    <dependency>
        <groupId>com.github.anylogic</groupId>
        <artifactId>alogic-xscript-kvalue</artifactId>
        <version>1.6.5-20160826</version>
    </dependency>   	

```

> alogic-xscript-kvalue版本号前面的1.6.5是其所依赖的[alogic-kvalue](https://github.com/anylogic/alogic/tree/master/alogic-kvalue)的版本号，后面的20160826是其发布的日期。

#### 引入Namespace

在您的脚本中，你需要引入kvalue作为Namespace，比如:

```xml
	
	<using xmlTag = "kv-row" module="com.alogic.xscript.kvalue.KVRow"/>
	
	<kv-row schema="demo" table="hash" key="test">
		<!--下面是针对指定row的操作-->
	</kv-row

```
或者

```xml

	<script>
        <using xmlTag="kv-schema" module="com.alogic.xscript.kvalue.KVSchema"/>

        <kv-schema schema="demo">
            <!--下面是针对kvalue数据库demo的操作-->
        </kv-schema>
    </script>

```
或者
```xml

	<script>
        <using xmlTag="kv-table" module="com.alogic.xscript.kvalue.KVTable"/>

        <kv-table schema="demo" table="str">
            <!--下面是对demo下str表的操作-->
        </kv-table>
    </script>

```


### Example

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

### Reference

参见[alogic-xscript-kvalue参考](src/docs/reference.md)。

### History

- 0.0.1 [20160804 duanyy]
	+ 初次发布
- 1.6.5 [20160810 duanyy]
	+ 更改版本为1.6.5,和alogic-kvalue保持一致;
	+ 增加list类型的相关插件(1.6.5.1)
	+ 发布20160826版本


