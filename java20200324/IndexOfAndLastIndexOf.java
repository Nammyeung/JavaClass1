package java20200324;

public class IndexOfAndLastIndexOf {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		String str = "안녕하세요,반갑습니다,잘부탁드립니다.";
		String str = "aaeess.eee.txt"; // 값을 업로드한 사람의 파일명
		// 확장자명을 뽑아내고 싶다.
//		int commaIndex = str.indexOf("."); // 9
		int commaIndex = str.lastIndexOf("."); // 9
//		.이라는 문자의 인덱스를 찾겠다.
		String ext = str.substring(commaIndex); // 9부터 잘라라
		// return타입이 있으면 본래 값이 잘리지는 않음.
		
		System.out.println(ext);
		System.out.println(str);
	}
}

