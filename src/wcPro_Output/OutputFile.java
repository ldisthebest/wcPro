package wcPro_Output;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.*;


public class OutputFile {
	
	public void outPut(List<Map.Entry<String,Integer>> res) throws IOException
	{
		String result = ""; //������ļ�������
		//����map��list���鲢����ָ����ʽ���뵽result��
		for(int index = 0;index<res.size();index++){
			result += res.get(index).getKey()+" "+res.get(index).getValue();
			if(index != res.size()-1){
				result +="\r\n"; //�������һ�����ʵĴ�Ƶ���ӻ��з�������Ҫ��
			}			
		}
		File f = null;
		FileWriter file = null;
		try{
			f = new File("result.txt");//����Ϊresult���ļ�
			file = new FileWriter(f);
			file.write(result);//д�뵽ָ���ļ�
		}
		catch(Exception e){
			System.out.println(e);
		}	
		finally{
			file.close();//�ر��ļ���
		}
		
		
	}

}
