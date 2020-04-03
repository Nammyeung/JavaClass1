package java20200323;

import java.util.*;

public class LinkedListEx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		LinkedList<StudentData> list =
				new LinkedList<StudentData>();
		
		StudentData st1 = new StudentData("한조",10,100);
		
		list.add(st1);
		list.add(new StudentData("트레1",20,70));
		list.add(new StudentData("트레2",30,70));
		list.add(new StudentData("트레3",40,70));
		list.add(new StudentData("트레4",50,70));
		list.add(new StudentData("트레5",60,70));
		list.add(new StudentData("트레6",70,70));
		// 노드 생성, 붙이고, 생성, 붙이고, 생성, 붙이고
		
		list.add(3, new StudentData("트레7", 20, 70));
		list.remove(5);
		list.remove(st1);
		
		
		StudentData t = list.get(4); // 내부가 반복문을 통해서 5만번 접근.
		// *******************잘못된 예제...
//		for(int i = 0 ; i < list.size(); i++) {
//			StudentData ref = list.get(i);
//			System.out.println(ref.name);
//		}
		// 정답이지만 귀찮은 정답? 아무도 이렇게 쓰지 않는다.(옛날 방식)
		Iterator<StudentData> iter = list.iterator(); // 반복동작을 통해 내부를 탐색하는 객체를 보유하고 있음.
		while(iter.hasNext()) {
			StudentData ref = iter.next();			
			System.out.println(ref.name);
		}
		// 내부저장방식이 다르기 때문에 반복하는 방식이 다르기 때문에 구조에 맞는 방법을 써야한다.
	
		for(StudentData data : list) {
			System.out.println(data.name);
		}
	
//		for(int a : st1) {
//			
//		}
		
	}

}

// 절대적인 문제가 있음.(로직???)