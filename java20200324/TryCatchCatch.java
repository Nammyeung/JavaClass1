package java20200324;

public class TryCatchCatch {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
		int a = 10;
		int b = 20;
		String str = null;
		
		int result = a/b;
		
		System.out.println(result);
		System.out.println(str.charAt(0));
		}catch(ArithmeticException e) { // 해당 exception이 발생할 때만 들어옴.
			// e : 참조변수
			System.out.println("예외 처리 코드...");
		
		}//else if와 같이 여러 개의 catch문을 사용할 수 있음.
		catch(NullPointerException e) {
			System.out.println("null 예외 처리 코드...");
		}catch(Exception e) {
			System.out.println("기타 등등 예외 처리 코드....");
		}
		
		
		
		
		
		
		System.out.println("나머지 코드들....");
	
	}

}
