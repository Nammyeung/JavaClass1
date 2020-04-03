package java20200324;

public class TrimAndSplit {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str = "안녕하세요\n반갑습니다\n잘부탁...";
		// Enter값을 br로 바꿔줘야
		System.out.println(str);
		// 데이터베이스 혹은 입력을 했을 때 Enter가 들어갈 수 있다.
		
		String temp = str.replace("\n", "<br>");
		System.out.println(temp);
		
		
		String str2 = " 박 지성   "; // 화이트스페이스(노이즈)를 제거하고 싶다.
		temp = str2.trim(); // 양옆의 공백을 제거한 후 리턴
		
		System.out.println("<" + str2 + ">");
		System.out.println("<" + temp + ">");
		// 검색창에서 박지성이라는 코드를 찾고싶다.
		
		str = "abCDeF";
		System.out.println(str);
		temp = str.toUpperCase(); // 안쪽에 있는 문자가 싹다 대문자로 바뀌고 리턴
		System.out.println(temp);
		
	
		str = "안녕하세요,반갑습니다,잘부탁드려요";
		// 내부에서 배열을 만들어서 구분선을 기준으로 채워넣어 리턴
		String [] datas = str.split(","); // ,를 기준으로 나누겠다.
		System.out.println(datas[0]);
		System.out.println(datas[1]);
		System.out.println(datas[2]);
		// 가급적 반복문을 돌릴 것.
		
		
		
		
		
		
		
	}

}
