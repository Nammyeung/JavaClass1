package java20200324;

public class ThrowsException {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
		new Test().method1(); // Test클래스의 method1실행
		// try/catch문을 없애니 컴파일 오류가 사라짐.
		}catch(Exception e) {
			
		}
		System.out.println("메인 나머지 코드들...");
	}

}

class Test{
	
	void method1() throws Exception{ 
		// 프로그램을 종료를 하지않고 프로그램을 호출하는 곳에서 exception을 처리할 권한을 주겠다.
		// throws Exception을 추가하니 메인 메소드에서 compile에러가 뜸. (Unhandled exception type Exception)
		String str = null; // null str이 가리키는 주소값이 없다.
		System.out.println(str.charAt(0)); // NullPointer Exception발생
	}
}
