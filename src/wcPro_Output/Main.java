package wcPro_Output;

import java.io.IOException;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

public class Main {
	public static void main (String[] args) throws IOException{
		//�����Ƿ���ȷ������һЩֵ
		Map<String, Integer> map = new LinkedHashMap <String, Integer>();
		map.put("as", 1);
		map.put("ll",23);
		map.put("we",11);
		map.put("qute",3);
		List<Map.Entry<String,Integer>> res = new ArrayList<Map.Entry<String,Integer>>(map.entrySet());

		
		//������ļ�
		OutputFile test = new OutputFile();//���������
		test.outPut(res);//����������ļ��ķ���

	}
}
