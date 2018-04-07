package wcPro_Output;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.*;


public class OutputFile {
	
	public void outPut(List<Map.Entry<String,Integer>> res) throws IOException
	{
		String result = ""; //输出到文件的内容
		//遍历map的list数组并按照指定格式加入到result中
		for(int index = 0;index<res.size();index++){
			result += res.get(index).getKey()+" "+res.get(index).getValue();
			if(index != res.size()-1){
				result +="\r\n"; //除了最后一个单词的词频不加换行符其他都要加
			}			
		}
		File f = null;
		FileWriter file = null;
		try{
			f = new File("result.txt");//打开名为result的文件
			file = new FileWriter(f);
			file.write(result);//写入到指定文件
		}
		catch(Exception e){
			System.out.println(e);
		}	
		finally{
			file.close();//关闭文件流
		}
		
		
	}

}
