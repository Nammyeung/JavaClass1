package java20200319;
//*******************final의 예시(ip)****************************
public class P2 {
	// 서버가 이전을 해서 바꿔야 한다면?
	final static String ip = "192.0.0.1";// 192.0.0.1 => 192.0.0.2 
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(ip); // 접속하기 위한 ip코드
		
		ip = "192.0.0.3"; // 처음 코드를 짠 사람의 의도에 맞지 않은 결과가 나올 수 있는 코드
		// final을 사용함으로써 이를 막음
		System.out.println(ip);
		
		
		System.out.println(ip);
		
				
		System.out.println(ip);
	}

}
