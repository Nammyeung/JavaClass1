package java20200319;

public class P6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		A3 a = new A3();
		
		A3.plus(10, 20);
		
		Math.abs(1);
		
//		Math a = new Math(); / The constructor Math() is not visible
		// 생성자가 있어야 객체 생성?
		System sss = null; // The value of the local variable sss is not used
		
	}

}

class A3{
	
	public A3() { // 생성자에 private을 붙일 수 있는가? => 생성자가 은닉이 된다. => 생성 못시킴(쓸 이유가 없음, 걍 이론(문법)적으로)
		
	}
	
	public static int plus(int a, int b) { // API를 Static으로 작성
		return a+b;
	}
}