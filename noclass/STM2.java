package noclass;

import java.util.*;

public class STM2 {

	public static void main(String[] args) {
		//*************프로그램이 시작점부터 끝까지 남아있기 위해 위치를 최상단에 위치
		STData [] stList = new STData[100];
		int stCount = 0;
		
		
		// TODO Auto-generated method stub
		Scanner scn = new Scanner(System.in);
		// 실행할 때마다 생성되고 소멸되고를 반복.
//		System.out.println("aaaa");
				
		System.out.println("***학생관리프로그램에 오신걸 환영합니다***");
				
		while(true) {
		System.out.println("===메뉴===");
		System.out.println("1.학생 정보 입력");
		System.out.println("2.학생 리스트 출력");
		System.out.println("3.학생 정보 검색");
		System.out.println("4.학생 정보 삭제");
		System.out.println("5.학생 점수 수정");
		System.out.print("입력 q=종료>"); // println으로 입력을 받았기 때문에 inputValue가 밑으로 내려간다.
		String inputValue = scn.nextLine();
		
//		String aa = "안녕하세요";
//		"ㅇㅇㅇㅇ".charAt(9); // "oooo" : 문법적으로 봤을 때는 주소값이다.
		
//		if(inputValue=="q") { // inputValue =='q' => 메모리주소값 비교 == 'q'(x)
		if(inputValue.equals("q")) {
				break;
		}
		if(inputValue.equals("1")) {
			//학생 정보 입력 코드...
			System.out.println("======학생 정보 입력 시작======");
			System.out.println("학생 이름을 입력해 주세요");
			System.out.print("입력>");
			String name = scn.nextLine();
			
			System.out.println("나이를 입력해 주세요");
			System.out.print("입력>");
			String temp = scn.nextLine();
			int age = Integer.parseInt(temp); // Integer 클래스의 parseInt 메소드(API 사용)
			
			System.out.println("점수를 입력해 주세요");
			System.out.print("입력>");
			int score = Integer.parseInt(scn.nextLine()); // parseInt(String type만);
			// 위보다 메모리 관리의 효율이 있다.
//			String temp = scn.nextLine();
//			int age = Integer.parseInt(temp);
			
			STData stData = new STData(name,age,score); // heap 메모리 생성
			
			stList[stCount] = stData; // 3개의 매개변수를 받아서 한꺼번에 배열에 저장 가능?
			stCount++;
			
			System.out.println("======학생 정보 입력 끝======");
			System.out.print("계속 하시려면 Enter를 입력해주세요.");
			scn.nextLine();
			
		} else if(inputValue.equals("2")) {
			//학생 리스트 출력....
			System.out.println("======학생 리스트 시작======");
			
			for(int i = 0 ; i < stCount ; i++) {
				System.out.println(stList[i].name);
			}
			
			System.out.println("======학생 리스트 끝======");
			System.out.print("계속 ... Enter...");
			scn.nextLine();
			
		} else if(inputValue.equals("3")) {			
			//검색...
			System.out.println("======검색 시작======");
			
			System.out.println("검색할 학생의 이름을 입력해주세요");
			System.out.print("입력");
			String searchingName = scn.nextLine();
			
			int searchingCount = 0;			
			
			for(int i = 0 ; i < stCount ; i++) {
				
				if(stList[i].name.contains(searchingName)) {
					String print = ""; // 연산자 + 적용
					print += "이름 : "; // 문자 연산이 가능함
					print += stList[i].name;
					print += ", 나이 : ";
					print += stList[i].age;
					print += ", 점수 : ";
					print += stList[i].score;
					
					System.out.println(print);
					
					searchingCount++;
				}
				
			}
			
			System.out.println(searchingCount + "명이 검색되었습니다.");
			
			System.out.println("======검색 끝======");
			System.out.println("계속 ....Enter....");
			scn.nextLine();
			
		} else if(inputValue.equals("4")) {
			//삭제...
			System.out.println("======학생 삭제 시작======");
			System.out.println("삭제 할 학생의 이름을 입력해 주세요");
			System.out.print("입력>");
			String deletingName = scn.nextLine();
			int count = 0;
			for(int i = 0 ; i < stCount ; i++) {
				if(stList[i].name.equals(deletingName)) {
					
					for(int x = i ; x < stCount ; x++) {
						stList[x] = stList[x+1];
					}
					i--;
				
					stCount--;
				
					Count++;
					
					
//					for(int x = i ; x < stCount ; i++) { // i번째 것을 지우고 그 다음 것을 밀어넣어야 함.
//						stList[x] = stList[x+1]; 
//						// 마지막 넘치는 배열 부분 outofbound exception이 생기는데 collection framework로 나중에 해결 예정
////						0    1   <-  2    3 4 5
////						[][트레이서][트레이서][][][]
////						   delete
////					i--; / 지워진 해당 인스턴스의 값을 다시 확인하게 하는 연산자, 나중에 빼고 실행해보기(비교)
//				//------------------------------------------지우는 로직
////					stCount--;
//					count++;
//			    //------------------------------------------증가시키는 로직
//					}
//				}
//				i--;
				}
			}			
			// 배열 [][null][][][][][][][][][][]
			//			|
			//		---------
			//		|		 |
			//		----------
			// delete를 하면 null이 생기고 전체 배열을 호출할 때 nullpointexception이 발생할 수 있음.
			// 중간에 끼워넣는 것(x - 위험), 뒤에부터 다시 쌓음
			System.out.println(count + "명이 삭제되었습니다.");
			
			
			System.out.println("======학생 삭제 끝======");
			System.out.println("계속...Enter...");
			scn.nextLine();
		} else if(inputValue.equals("5")) {
			//점수 수정...
			
		} else {
			//예외 상황.
			System.out.println("잘못 입력하셨습니다.");
		}
		
	}
		
	System.out.println("이용해 주셔서 감사합니다.");
		
}

}

class STData2{
	public String name;
	public int age;
	public int score;
	
	public STData2(String name, int age, int score) {
		this.name = name;
		this.age = age;
		this.score = score;
	}
}

/*
 * Ram 전기신호에 의해 작동, 윈도우가 종료되면 메모리를 회수해감 => 
 * 영구적으로 저장되는 것이 아님.
 */