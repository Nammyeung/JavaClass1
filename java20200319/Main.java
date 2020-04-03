package java20200319;

import java.util.*; // 필수적으로 넣을 것.(너무나 중요한 API가 많음)
// 설계를 하려면 이유가 있어야 한다.

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scn = new Scanner(System.in);
		
		
//		System.out.println("값을 입력하세요>");
////		String value = scn.nextLine(); // nextInt() 필요없음(parseInt가 있으므로)
//		System.out.println(value + "가 입력되었습니다.");
		while(true) {
		System.out.println("====메뉴====");
		System.out.println("1.입력");
		System.out.println("2.출력");
		System.out.println("3.수정");
		System.out.println("Q.종료");
		System.out.println("입력>");
		String value = scn.nextLine(); // nextInt() 필요없음(parseInt가 있으므로)
		
		if(value.equals("Q")) {
		// String은 클래스 => 주소값을 참조 => 문자값을 확인하려면 => equals	
			break;
			}
		if(value.equals("1")) {
			
		}else if(value.equals("2")) {
			
		}else if(value.equals("3")) {
			
		}else {
			System.out.println("정상적인 값을 입력해주세요.");
		}
		// Command UI
		}
		System.out.println("이용해주셔서 감사합니다.");
		
	
	}

}
