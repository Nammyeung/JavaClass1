package java20200324;

public class TryCatchFinally {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str1 = "안녕하세요";
		System.out.println(str1.charAt(0));
		// . : 접근 연산자(어딘가의 주소에 접근을 하겠다)
		String str2 = null;
//		System.out.println(str2.charAt(0));
//		unchecked error 발생 -> NullPointerException(컴파일은 되지만 실행 시점에서 예외 발생)
		try {
		int [] arr = new int[30];
		arr[0] = 1;
		arr[10000] = 10; // java.lang.ArrayIndexOutOfBoundsException: 10000
		} catch(Exception e) {
			System.out.println("에러 발생....");
			return; // return 코드가 있음에도 finally는 항상 실행된다.
			// Exception이 발생하면 프로그램이 종료되지 않고 이쪽으로 넘어옴.
		}finally {
			System.out.println("안녕하세요");
		} // finally는 항상 실행이 된다.
//		[] : .와 같이 접근연산자 => NullPointerException발생 가능
//		말도 안되지만 컴파일 에러는 발생하지 않는다.
//		exception코드가 발생할 떼 클래스명에 익숙해져야 한다.
		
		System.out.println("이후에 실행될 코드들");
	}

}
