package java20200324;

public class HashCode {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		BBB b = new BBB();
		// 다형성 적용된다.
		int value = b.hashCode();
		System.out.println(value); 
		// 객체의 해시코드 값.(메모리의 주소값을 기준으로 해싱)
		System.out.println(b); // 16진수
		
		String str = "안녕하세요";
		System.out.println(str.hashCode());
		// 메모리의 주소값의 해시코드일까
		String str2 = new String("안녕하세요");
//		해시코드를 출력하는 toString이 오버라이딩 되어 있고 이를 자르고 수정해서 ~~~
//		.equals는 직접적으로 안녕하세요를 비교하는가?
//		=> 내부적으로 문자열 해시코드로 바로 비교할 것이다.
//		메모리 해싱코드 != 문자열 해싱코드
//		
		System.out.println(str2.hashCode());
	}

}

class BBB{
	
}
// 모든 클래스는 Object를 상속받았고
// Object안의 api중 하나인 HashCode()를 호출 가능.