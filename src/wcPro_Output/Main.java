package wcPro_Output;

import java.io.IOException;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

public class Main {
	public static void main (String[] args) throws IOException{
		//测试是否正确，加入一些值
		Map<String, Integer> map = new LinkedHashMap <String, Integer>();
		map.put("as", 1);
		map.put("ll",23);
		map.put("we",11);
		map.put("qute",3);
		List<Map.Entry<String,Integer>> res = new ArrayList<Map.Entry<String,Integer>>(map.entrySet());

		
		//输出到文件
		OutputFile test = new OutputFile();//声明输出类
		test.outPut(res);//调用输出到文件的方法

	}
}
