package java20200324;

public class ThrowsMyException {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
			new Test2().method1(10);
		}catch(MyException e) {
			e.method1();
		}
	}

}

class Test2{
	
	
	void method1(int value) throws MyException{ // 메소드 상에서 throw
		System.out.println("method1..코드들...");
		System.out.println("method1..코드들...");
		if(value < 0) {
		throw new MyException("0보다 작은 값이 들어왔습니다."); // 무조건 throw가 됨.
		// *********************코드에서 예외 발생시키는 방법(코드 상에서 예외를 throw)
		}
		
		System.out.println("method1..코드들...");
		System.out.println("method1..코드들...");
	}
	
	
	
}

class MyException extends Exception{
	
	public MyException(String message) {
		super(message); // 생성자 호출(Exception에 있는 생성자를 호출하겠다)
	}
	
	public void method1() {
		System.out.println("안녕하세요");
	}
}