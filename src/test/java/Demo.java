import java.util.HashMap;
import java.util.Map;

import com.alogic.xscript.ExecuteWatcher;
import com.alogic.xscript.LogicletContext;
import com.alogic.xscript.Script;
import com.anysoft.util.CommandLine;
import com.anysoft.util.Properties;
import com.anysoft.util.Settings;
import com.jayway.jsonpath.spi.JsonProvider;
import com.jayway.jsonpath.spi.JsonProviderFactory;

public class Demo {

	public static void run(String src,Properties p){
		Script script = Script.create(src, p);
		if (script == null){
			System.out.println("Fail to compile the script");
			return;
		}
		long start = System.currentTimeMillis();
		Map<String,Object> root = new HashMap<String,Object>();
		LogicletContext ctx = new LogicletContext(p);
		script.execute(root, root, ctx, new ExecuteWatcher.Quiet());
		
		System.out.println("Script:" + src);
		System.out.println("Duration:" + (System.currentTimeMillis() - start) + "ms");
		
		JsonProvider provider = JsonProviderFactory.createProvider();
		System.out.println("#########################################################");
		System.out.println(provider.toJson(root));				
		System.out.println("#########################################################");
	}
	
	public static void main(String[] args) {
		Settings settings = Settings.get();		
		settings.addSettings(new CommandLine(args));		
		settings.addSettings("java:///conf/settings.xml#Demo", null, Settings.getResourceFactory());
		
		run("java:///xscript/Helloworld.xml#Demo",settings);
		run("java:///xscript/string.xml#Demo",settings);
		run("java:///xscript/hash.xml#Demo",settings);
		run("java:///xscript/list.xml#Demo",settings);
		run("java:///xscript/sortedSet.xml#Demo",settings);
		run("java:///xscript/set.xml#Demo",settings);
	}

}
