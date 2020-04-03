package java20200319;
//******************************제한자*******************************
public class P1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

//		//		int a = 10; // 변수 생성
//		final int a = 10; // 변수 생성
//		// 기능이 나빠지는 의미이기도 함.(final(제한자)을 사용하는 이유는?)
//		a = 20; // 값을 넣는다 =! 변수생성
//		a = 30; // 오류(final : 제한자) => 컴파일이 안된다.(문법오류, 실행오류)
//		
//		System.out.println(a);
	int v1 = 10;
	int v2 = 20;
	int result = A1.plus(v1,  v2);
	System.out.println(result);
	}

}

class A1 {
	static int plus(final int a ,final int b) { // final : 코드의 안정성을 학보
		
		a = 20; // 매개변수는 받은 값으로 처리를 해야하는데 변환하는 것을 의미
		// 차후에 업무를 할 때 실수가 발생하지 않도록 매개변수로 들어오는 값이 바뀌지 않도록 fianl로 재한을 둔다 => 제한자
		
		return a + b;
	}
}
// 한 달 전에 짠 코드, 예전에 짠 코드
