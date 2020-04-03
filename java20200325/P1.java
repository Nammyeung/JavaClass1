package java20200325;
/////////////////// 파일 저장하는 API가 있다.
import java.io.*; // java패키지 안에 io(Input/Output)관련 API를 모두 사용하겠다.

public class P1 {

	public static void main(String[] args) throws Exception{
		// TODO Auto-generated method stub
		//파일 입출력..... API... 활용...
		int a = 400; // a -> RAM(메모리)에 저장 => 하드디스크에 저장할 방법은?
		
		File xxx = new File("C:\\test\\aaa.dat");
		//"C:\\test\\aaa.dat" 파일을 선택해 존재유무, 속성을 검색(file descriptor)

		FileOutputStream fos 
			= new FileOutputStream(xxx);
		//FileOutputStream(FOS)
		/*
		 * Multiple markers at this line - Unhandled exception type
		 * FileNotFoundException - The constructor FileOutputStream() is undefined
		 * 논리적인 문제가 아닌 물리적인 문제가 발생할 수 있음.
		 * => try catch 문 VS 던질지(throws)
		 */
	
		// throw를 쓰면 메소드 안에서 try catch 문 안써도 됨.
		
//		fos.write(0); // a안의 값 10이 넘어가서 저장을 함. / 00
//		fos.write(9); // 1바이트 생성 	    	  	  / 09
//		fos.write(11); // 1바이트 생성 				  / 0B 
//		fos.write(15); // 1바이트 생성 				  / 0F
//		fos.write(-1); // 1바이트 생성 				  / FF
		// 바이트 단위로 들어감 => 5바이트 생성
		//[00][00][00][0A] => aaa.bat
		
//		fos.write(a); //90 => 잘린다?
//		// 400을 16진수로 나타내면 190
//		
//		// a: 00 00 01 90
//		// 4바이트
//		
//		fos.write(a >> 24); // 00 00 00 00 오른쪽부터 3개 밀음
//		fos.write(a >> 16); // 00 00 00 00 오른쪽부터 2개 밀음
//		fos.write(a >> 8); //  00 00 00 01 오른쪽부터 1개 밀음
//		fos.write(a >> 0); //  00 00 01 90 오른쪽부터 0개 밀음
//		
//		
//		위의 과정을 간편하게 하기 위해 Filter를 등록해서 사용하는 API가 있음
//		코어
//		FileOutputStream fos 
//		= new FileOutputStream(xxx);
//		얘를 보조해주는 Api를 쓰겠다.
//		파일을 저장해주는게 API로 되어있다.
		
		BufferedOutputStream bos =
				new BufferedOutputStream(fos);
		
//		DataOutputStream dos =
//				new DataOutputStream(fos); // fos를 넣어서 묶어줌.
//		
		DataOutputStream dos =
				new DataOutputStream(bos);
//		************************************총 3개의 필터를 연결.
		
		dos.writeInt(10);
		dos.writeInt(400); // 4바이트씩 두 번 들어감 => 8바이트
//		Int값을 쪼개서 writing할 것임.
		dos.writeByte(5); // 한바이트로 넣을 것임.
		
		dos.writeUTF("AABBaabb"); 
		// 00 00 00 0A 00 00 01 90 05 00 08 41 41 42 42 61 61 62 62
		
		//대안 2: RAM에 저장할 것을 모두 모은다음에 한 방에 저장
		// Buffer에 쌓아둔 다음에 한 방에 저장
		
		
		fos.close(); // 파일을 닫지 않으면 파일입출력을 점유해서 문제가 생길 수 있음.
		//ex - 이미 열려있는 문서입니다, 접근이 불가능합니다.
		
		System.out.println("안녕하세요");
		// "C:\\test\\aaa.dat" 생김
		// 크기가 1바이트?
	
	}

}
