package java20200323;

import java.util.*;

public class ArrayListEx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		StudentData [] arr = new StudentData[100];
		ArrayList<StudentData> list =
				new ArrayList<StudentData>(100); // 자동으로 두 배의 크기를 갖는 배열을 생성한다.
		
		StudentData st1 = new StudentData("한조",10,70);
		
		list.add(st1); // StudentData 데이터의 참조변수를 넣을 수 있음.
		list.add(new StudentData("트레",20,100));
		list.add(new StudentData("트레2",20,100));
		list.add(new StudentData("트레3",20,100));
		list.add(new StudentData("트레4",20,100));
		list.add(new StudentData("트레5",20,100));
		list.add(new StudentData("트레6",20,100));
		
		list.add(3,new StudentData("트레7",20,100)); // API는 지원해주지만 잘못 사용하고 있다.
		// ArrayList를 쓸 때 해당 기능이 필요하면 잘못 선택한 것.
		list.remove(5); // 5번째 공간을 삭제(인덱스로 지우는 법)
		
		list.remove(st1); // 값으로 지우는 법, 맨 뒤에서 st1이 맞는지 일일이 다 체크.
		
		StudentData t = list.get(3); // 인덱스로 인한 접근 속도
		
		for(int i = 0 ; i < list.size() ; i++) { 
//			list.get(i); //list.name;
			StudentData ref = list.get(i);
			System.out.println(ref.name);			
		}
		
	}

}

class StudentData{
	String name;
	int age;
	int score;
	
	StudentData(String name, int age, int score){
		this.name = name;
		this.age = age;
		this.score = score;
		
	}
}