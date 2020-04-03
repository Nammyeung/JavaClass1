package com.ja.t2;

public class P2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		Xxx ref = new Xxx(); => interface도 abstract와 같이 객체 생성이 불가능
//		Xxx ref = new AA();
		AA ref = new AA();
		ref.method();
		
	}

}


interface Xxx{ // 똑같이 상속 받는 용도? => 제약조건이 있음(abstract와 다른점)
//	public abstract void method();
	void method(); // 이만큼만 써도 public abstract가 자동으로 들어감.(private 안됨)
//	public void method(); , 구현하는 메소드가 아닌 선언하는 메소드이다.
		
}

class AA implements Xxx{ // Xxx를 상속받겠다.
	
	public void method() {
		System.out.println("안녕하세요");
	}
// interface에 의해 상속 받았고, AA안에는 반드시 메소드(method())가	Overriding되어야함.
}

//*************인터페이스 사용 이유******************************
//(1) 표준을 정의한다.