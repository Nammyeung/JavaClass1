package java20200324;

public class PrintStackTraceAndGetMessage {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a = 10;
		int b = 0;
				
		try {
			int result = a/b;
			System.out.println(result); //  java.lang.ArithmeticException: / by zero
		}catch(Exception e) {
			e.printStackTrace(); // 최대한 내용을 다 찍어줌
			// java.lang.ArithmeticException: / by zero안녕하세요 (안녕하세요 발생 이전에 어떤 오류가 발생했다)
					
			String message = e.getMessage(); // by zero => 어떤 내용에 의해서
			System.out.println(message + " 의 문제가 발생");
			// by zero => 어떤 내용에 의해서
		}
		System.out.println("안녕하세요");
	
	}
}
