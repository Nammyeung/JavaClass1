package col;

import java.util.HashMap;

public class MapEx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		HashMap<String,StudentData> map = 
				new HashMap<String, StudentData>();
//		Map<String,StudentData> map = 
//				new HashMap<String, StudentData>(); 
//	    = �������̵� ��(HashMap�� ����)�޼ҵ�� ����� �� ����
	StudentData st = new StudentData("Ʈ��1", 10, 100);
	
//	map("1���л�", st);
	
//	map(st.name, st);
	StudentData ref = map.get("Ʈ��1");
//	System.out.println(ref.score);
//	���� �� put 
//	���� �� get
	map.put("1��", new StudentData("Ʈ��2",10,5));
	map.put("2��", new StudentData("Ʈ��2",10,5));
	map.put("3��", new StudentData("Ʈ��2",10,5));
	map.put("4��", new StudentData("Ʈ��2",10,5));
	map.put("5��", new StudentData("Ʈ��2",10,5));
	map.put("6��", new StudentData("Ʈ��2",10,5));
//  Ư�� : ���� �������
		
	
	//��ü �ݺ�.......
//	Set<String> keys = map.keySet();
//	�� ���� key�� ���������� ������
	for(String key : map.keySet()) {
		System.out.println(map.get(key).name);
	}
	
	
	}

}
