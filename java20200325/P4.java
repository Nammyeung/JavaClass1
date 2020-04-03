package java20200325;
//***********************Input
import java.io.*;

public class P4 {
// try catch문 생략(원래는 항상 써야함 대신 throws)
	public static void main(String[] args) throws Exception{
		// TODO Auto-generated method stub
		//파일 읽기....
		File file = new File("C:\\test\\aaa.dat"); // aaa.dat를 읽음.
		
		FileInputStream fis = new FileInputStream(file);
		// 동일한 구조로 filter를 씌움
		BufferedInputStream bis = new BufferedInputStream(fis);
		DataInputStream dis = new DataInputStream(bis);
		// 읽어들이는 클래스를 불러들인다음 close해야
		
		// 읽기 로직....
		// 파일 입출력 프로토콜(파일 설계가 필요)
		// 비트맵
		// int int byte String 
		// String byte int int
		int a = dis.readInt(); // int 받음
		int b = dis.readInt(); // int 받음
		int c = dis.readByte(); // byte 받음
		String d = dis.readUTF();
		
		System.out.println(a);
		System.out.println(b);
		System.out.println(c);
		System.out.println(d);
		// 파일에서 저장된 것을 그대로 출력.
		
		dis.close();
		
	}

}

// 해당 API를 이용해서 Save와 Load 기능을 추가시킬 것임.