list类型操作案例
==============

下面是一个list类型的操作案例。

> 您可以在工程代码目录下找到本案例代码
> ```
> 		/src/test/resources/xscript/list.xml
> ```

下面是案例内容：

```xml

	<?xml version="1.0"?>
	<script>
		<using xmlTag = "kv-row" module="com.alogic.xscript.kvalue.KVRow"/>
		
		<!-- 打开 -->
		<kv-row schema="demo" table="list" key="test">
	
			<!-- 从左边插入单个值 -->
			<kv-llpush item="alogic"/>
			<!-- 提取到data1 -->
			<kv-litems tag="data1"/>
			
			<!-- 从左边插入多个值 -->
			<kv-llpush item="alogic;ketty;jetty" delimeter=";"/>
			<!-- 提取到data2 -->
			<kv-litems tag="data2"/>
			
			<!-- 从右边插入多个值 -->
			<kv-lrpush item="tom;harry;jerry" delimeter=";"/>
			<!-- 提取到data3 -->
			<kv-litems tag="data3"/>
					
			<!-- 提取部分到data -->
			<kv-litems tag="data" start="3" stop="10"/>
			
			<!-- 当前列表长度是多少 -->
			<kv-llen/>
			<log msg="The length is ${$kv-llen}"/>
			
			<!-- 设置指定位置的值 -->
			<kv-lset index="1" value="young"/>
			<!-- 提取到data4 -->
			<kv-litems tag="data4"/>
			
			<!-- 将值 item 插入到列表当中，位于值 pivot 之前或之后 -->
			<kv-linsert pivot="harry" value="testlinsertBefore" insertAfter="false" />
			<log msg="testlinsertBefore result is ${$kv-linsert}"/>
			<!-- 提取到data4 -->
			<kv-litems tag="data5"/>
			
			<!-- 将值 item 插入到列表当中，位于值 pivot 之前或之后 -->
			<kv-linsert pivot="harry" value="testlinsertAfter" insertAfter="true" />
			<log msg="testlinsertAfter result is ${$kv-linsert}"/>
			<!-- 提取到data6 -->
			<kv-litems tag="data6"/>
			
			<!-- 移除并返回列表 的头元素-->
			<kv-llpop block="true" />
			<log msg="kv-llpop result is ${$kv-llpop}"/>
			<!-- 移除并返回列表 的尾元素-->
			<kv-lrpop block="true"/>
			<log msg="kv-lrpop result is ${$kv-lrpop}"/>
			<kv-litems tag="data7"/>
			
			<!-- 移除并返回列表 的尾元素-->
			<kv-lrem value="alogic" count="3"/>
			<log msg="kv-lrem result is ${$kv-lrem}"/>
			<kv-litems tag="data8"/>
			
			<!-- 对列表进行修剪 -->
			<kv-ltrim start="1" end="-2"/>
			<log msg="kv-ltrim result is ${$kv-ltrim}"/>
			<kv-litems tag="data9"/>
	
			
			<kv-lget index="1"/>
			<log msg="The value at 1 is ${$kv-lget}"/>
			
			
					
			<!-- 本次测试完成，删除 -->
			<kv-del/>		
		</kv-row>
		
	</script>

```