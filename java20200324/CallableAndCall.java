package java20200324;
// ****************람다식의 목적 : 코드의 간결화(지저분해 짐.)*****************

public class CallableAndCall {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		Callable x = new Callable() {
//			int a = 10;
//			public void call() { // 선언하자마자 생성을 해서 넣겠다.
//				System.out.println("아주 간단한 코드..");
//				this.a = 20;
//			}
//		}; // ***다형성***에 의해서 변수가 들어갈 수 있다.
		// 익명 객체  생성이 가능하다

// 안드로드이쪽에서만 나오는 내용
		// 람다식...
		Callable x = (a,str) -> { // 매개변수
			System.out.println("아주 간단한 코드");
//			System.out.println(a);
			System.out.println(str);
		};
//		-> {} call()을 오버라이딩한 구간
		
		
		x.call(10,"aaaa");
		
		
		// 상속받는 객체가 생성
		
		
		
//		x.call(); // Test3안의 call이 아닌 Test3를 오버라이딩한 Callable의 ss메소드가 호출.
		
		
		
	}
	
	
}

interface Callable{
	public void call(int a, String str);
//	public void call(); // 하나밖에 없을 때
//	public void call2();
}

// 자바는 객체 지향에 최적화 => class 구현이 첫 단계 => but 하고싶지 않다면? => 
// class Test3 implements Callable{
// 	public void call() {
// 		System.out.println("무언가 아주~~~~ 간단한 코드");
// 	}
// }

// 람다식은 만능이 아니다.
// 별거없는데 클래스를 생성하기 싫은 코드에 사용
// 안드로이드에서 버튼을 클릭했을 때 하나의 기능을 추가하고 싶을 때