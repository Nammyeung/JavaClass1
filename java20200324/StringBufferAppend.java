package java20200324;

public class StringBufferAppend {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*String str = "안녕하세요";
		
		for(int i = 0 ; i < 5 ; i++) {
			str += i; // 문자열 연산 => 문자열 = 문자열 + 숫자
		}
		
		System.out.println(str);
	
*/
		
//		StringBuffer str = new StringBuffer("안녕하세요");
		StringBuffer str = new StringBuffer(100);
		str.append("안녕하세요");
		
		// 안녕하세요를 담을 배열을 만듬.
		// 연산속도가 월등히 빠름
		for(int i = 0 ; i < 5 ; i++) {
			str.append(i);
		}
		// Buffer라는 표현을 하면 할당된 메모리의 임시공간이 있음.
		
		System.out.println(str);
	}
}
