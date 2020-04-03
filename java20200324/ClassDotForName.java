package java20200324;

public class ClassDotForName {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
//			Class.forName("java.lang.String"); // String 클래스를 로드하겠다.
			Class.forName("oracle.jdbc.DBConnector"); 
			// 저런 클래스가 없다고 exception이 표출
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		// 클래스란 이름을 가진 클래스(reflection => 외부 라이브러리를 사용할 때)
		// 외부 라이브러리를 동적으로 컨트롤 할 일이 있을 때
	
	
		System.out.println("안녕하세요"); // 표준 라이브러리에 java.lang.String이 존재하기 때문에 exception 발생하지 않음.
	
	}

}
