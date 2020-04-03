package java20200318;
//***********************참조변수에 대한 이해**************************
public class StClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// ***************잘못된 예제******************
		String str1 = "안녕하세요";
		String str2 = "반갑습니다";
		// 참조변수에 대한 이해
		
		System.out.println(str1);
		System.out.println(str2);
		// 지역변수들(int, byte, short, long)과의 차이점 인지
		
		if(str1 == str2) {
			System.out.println("두 값이 같습니다.");
			// 두 값이 같다고 뜰 수 있는 이유
		} else {
			System.out.println("두 값이 다릅니다.");
		}
	}

}
