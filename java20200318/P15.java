package java20200318;

public class P15 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int v1 = 10;
		int v2 = 20;
		
		// Calc c1 = new Calc();
		int result = Calc.plus(v1,  v2); // 상위 내용처럼 생성을 해야할 필요가 없음.
		System.out.println(result);
		
		// Math.~~, System. : oS라고 붙어있는 것(S)들 Static으로 구현(생성해야할 필요가 없는)
	
	
	
	}
// static 멤버는 숙달하기 전까지는 피하라(헷갈려서?)
}

//******************순수하게 기능만 관련된 클래스 : static으로 선언***********************
class Calc{
// static 사용 : 외부에서 속성을 가져올 필요가 없는 경우(고유한 기능을 가진 온전한 메소드를 구현하곘다.)	
	static int plus(int a , int b) {
		return a+b;
	}
////// 순수하게 + 기능만 있음
	static int minus(int a , int b) {
		return a-b;
	}
//////순수하게 - 기능만 있음	
}
