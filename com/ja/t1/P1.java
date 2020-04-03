package com.ja.t1;
// 패키지 명 : 소속한 회사의 도메인 주소를 역순으로 뒤집어서 => com.회사명(예 : samsung).Project명
public class P1 {
// Spring framework는 설계 프레임워크(기능 프레임워크 x)
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// 상속 - 다형성 - 오버라이딩 => 인터페이스
		// 인터페이스 => 상속
		// 응집도는 높이고 결합도는 낮추기 위한....
		// 상속과 다형성과 오버라이딩이 묶여야 의미를 가짐
		
		// (1) 일반적인 경우
		B ref = new B();
		// (2) 다형성을 고려한 경우
		A ref1 = new B(); // 다형성
		//B형태로 메모리가 형성되었지만 A에 저장 => 자동 형변환이 일어남.
		ref1.v1 = 10;
	
		ref1.method3(); // A의 메소드를 선언했지만 재정의된 B의 method3()이 호출
		}
	}


class A{
	public int v1;
	public void method1() {
		System.out.println("안녕하세요");
	}	
	public void method3() {
		System.out.println("A의 메소드...");
	}	
}
class B extends A{ // 클래스 B는 A를 상속받겠다.
	public int v2;
	public void method2() {
		System.out.println("반갑습니다");
	}
	
	public void method3() { // 오버라이딩
		System.out.println("B의 메소드....");
	}
	
}





