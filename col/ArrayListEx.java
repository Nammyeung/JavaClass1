package col;
//*********************ArrayList*******************************
import java.util.*;

public class ArrayListEx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		StudentData [] arr = new StudentData[100];
		ArrayList<StudentData> list =
				new ArrayList<StudentData>(100); // 자동으로 두 배의 크기를 갖는 배열을 생성한다.
		
		StudentData st1 = new StudentData("한조",10,70);
		
		list.add(st1); // StudentData 데이터의 참조변수를 넣을 수 있음.
		list.add(new StudentData("트레",10,100)); // 5위
		list.add(new StudentData("트레2",30,800)); // 1위
		list.add(new StudentData("트레3",20,700)); // 2위
		list.add(new StudentData("트레4",50,500)); // 3위
		list.add(new StudentData("트레5",70,300)); // 4위
		list.add(new StudentData("트레6",50,10)); // 6위
		
		list.add(3,new StudentData("트레7",20,100)); // API는 지원해주지만 잘못 사용하고 있다.
		// ArrayList를 쓸 때 해당 기능이 필요하면 잘못 선택한 것.
		list.remove(5); // 5번째 공간을 삭제(인덱스로 지우는 법)
		
		list.remove(st1); // 값으로 지우는 법, 맨 뒤에서 st1이 맞는지 일일이 다 체크.
		
		StudentData t = list.get(3); // 인덱스로 인한 접근 속도
		
		for(int i = 0 ; i < list.size() ; i++) { 
//			list.get(i); //list.name;
			StudentData ref = list.get(i);
			System.out.println("이름 : " + ref.name);
			System.out.println("나이 : " + ref.age);
			System.out.println("점수 : " + ref.score);
		}
		
		
	}

}
//Comparable<StudentData> set계열을 쓸 때만 문제가 됨.
//기준(Comparable<StudentData>이 인터페이스로 적용
class StudentData implements Comparable<StudentData>{
	String name;
	int age;
	int score;
//	Comparable 인터페이스란?
//		Comparable 인터페이스는 객체간의 비교를 가능하게 해주는 인터페이스이다. 
//		해당 인터페이스를 구현(implements)한 클래스는 반드시 compareTo(T o) 메소드를 정의해야 한다.	
	StudentData(String name, int age, int score){
		this.name = name;
		this.age = age;
		this.score = score;
	}

	@Override
	public int compareTo(StudentData o) {
		// TODO Auto-generated method stub
		if(this.score == o.score) {
			return 0;
		} else if(this.score > o.score) {
			return 1;
		} else {
			return -1;
		}
// 정렬
		
	}
	// add를 할 때 호출.
}