package wcPro_Output;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.*;


public class OutputFile {
	public static void main (String[] args) throws IOException{
		//测试是否正确，加入一些值
		Map<String,Integer> m1 = new HashMap<String,Integer>();
		m1.put("as", 1);
		m1.put("ww", 2);
		m1.put("like", 4);
		List<Map.Entry<String,Integer>> res=new ArrayList<Map.Entry<String,Integer>>(m1.entrySet());
		
		//输出到文件
		OutputFile test = new OutputFile();//声明输出类
		test.OutPut(res);//调用输出到文件的方法

	}
	public void OutPut(List<Map.Entry<String,Integer>> res) throws IOException
	{
		String result = "";
		for(int i = 0;i<res.size();i++){
			result += res.get(i).getKey()+" "+res.get(i).getValue();
			if(i != res.size()-1){
				result +="\n";
			}			
		}
		File f = new File("result.txt");
		FileWriter file = new FileWriter(f);
		file.write(result);
		file.close();
	}

}
