package col;

import java.util.HashMap;

public class MapEx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		HashMap<String,StudentData> map = 
				new HashMap<String, StudentData>();
//		Map<String,StudentData> map = 
//				new HashMap<String, StudentData>(); 
//	    = 오버라이딩 된(HashMap맵 만의)메소드는 사용할 수 없음
	StudentData st = new StudentData("트레1", 10, 100);
	
//	map("1번학생", st);
	
//	map(st.name, st);
	StudentData ref = map.get("트레1");
//	System.out.println(ref.score);
//	넣을 때 put 
//	뽑을 때 get
	map.put("1번", new StudentData("트레2",10,5));
	map.put("2번", new StudentData("트레2",10,5));
	map.put("3번", new StudentData("트레2",10,5));
	map.put("4번", new StudentData("트레2",10,5));
	map.put("5번", new StudentData("트레2",10,5));
	map.put("6번", new StudentData("트레2",10,5));
//  특성 : 값이 덮어씌워짐
		
	
	//전체 반복.......
//	Set<String> keys = map.keySet();
//	한 개씩 key를 순차적으로 가져옴
	for(String key : map.keySet()) {
		System.out.println(map.get(key).name);
	}
	
	
	}

}
