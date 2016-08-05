string类型操作案例
================

下面是一个String类型的操作案例，包含了通用操作和字符串操作的样例。

> 您可以在工程代码目录下找到本案例代码
> ```
> 		/src/test/resources/xscript/string.xml
> ```

下面是案例内容：

```xml

	<?xml version="1.0"?>
	<script>
		<using xmlTag = "kv-row" module="com.alogic.xscript.kvalue.KVRow"/>
		
		<!-- 定位到demo下表str中的testkey这一行 -->
		<kv-row schema="demo" table="str" key="testkey">
			
			<!-- 在开始之前，测试一下testkey是否存在 -->
			<kv-exist/>
			<!-- 看看结果 -->
			<log msg="Does the row exist now? ${$kv-exist}"/>
			
			<!-- 设置testkey的值 -->
			<kv-set value="Hello"/>
			
			<!-- 可以通过变量$kv-set获取上面语句执行结果 -->
			<log msg="The return of kv-set is ${$kv-set}"/>
			
			<!-- 尝试读取值到上下文变量testkey -->
			<kv-get id="testkey"/>
			<!-- log出来看看 -->
			<log msg="the value now is '${testkey}'"/>
			
			<!-- 看看kv-append -->
			<kv-append value=" logic"/>
			
			<!-- 尝试读取值到上下文变量testkey -->
			<kv-get id="testkey"/>
			<!-- log出来看看 -->
			<log msg="the value now is '${testkey}'"/>				
			
			<!-- 看看kv-setrange -->
			<kv-setrange value="ketty" offset="6"/>
			<!-- 尝试读取值到上下文变量testkey -->
			<kv-get id="testkey"/>
			<!-- log出来看看 -->
			<log msg="the value now is '${testkey}'"/>				
			
			<!-- 看看kv-strlen -->
			<kv-strlen/>
			<!-- 可以通过变量$kv-set获取上面语句执行结果 -->
			<log msg="The length of kv-set is ${$kv-strlen}"/>		
			
			<!-- 查看ttl -->
			<kv-ttl/>
			<!-- 可以通过变量$kv-set获取上面语句执行结果 -->
			<log msg="The ttl of kv-set is ${$kv-ttl}"/>		
			<!-- 设置ttl为10分钟 -->
			<kv-ttl ttl="6000000"/>
			<!-- 查看ttl -->
			<kv-ttl/>
			<!-- 可以通过变量$kv-set获取上面语句执行结果 -->
			<log msg="The ttl of kv-set is ${$kv-ttl}"/>				
			
			<!-- 再次测试一下是否存在 -->
			<kv-exist/>
			<!-- 看看结果 -->
			<log msg="Does the row exist now? ${$kv-exist}"/>	
			
			<!-- 删除testkey -->
			<kv-del/>
			<!-- 可以通过变量$kv-del获取上面语句执行结果 -->
			<log msg="The return of kv-del is ${$kv-del}"/>		
	
			<!-- 再次测试一下是否存在 -->
			<kv-exist/>
			<!-- 看看结果 -->
			<log msg="Does the row exist now? ${$kv-exist}"/>
			
		</kv-row>
	
	</script>
```