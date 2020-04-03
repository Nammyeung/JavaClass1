package col;

import java.util.*;

// 인터페이스 : 상속, 다형성, 오버라이딩
// 계열 별로 인터페이스 표준이 있다.
public class Ex3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		ArrayList<String> list = new ArrayList<String>();
//		List<String> list = new ArrayList<String>(); // => 다형성 ArrayList는 List를 상속 받았다.
		List<String> list = new LinkedList<String>();
//		오버라이딩된(LinkedList만의) 메소드는 사용할 수 없음.
//		수정을 하더라도 결합도를 최대한 낮추면 오류가 일어날 가능성이 줄어듬.(유지보수의 핵심 : 최소한의 코드를 컨드리게 하는 것.)
//		내부 동작 방식은 완전히 다르겠지만 모듈 객체가 완전히 달라진다.
		
		new Test().method1(list);
	}
// 인터페이스 필요성 : 독립성을 높임
//	캡슐화 : 정보의 은닉(public, private)

}

class Test{
	
	public void method1(List<String> list) {
		method2(list);
	}
	
	public void method2(List<String> list) {
		
	}
	
}
