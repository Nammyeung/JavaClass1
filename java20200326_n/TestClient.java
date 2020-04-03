package java20200326_n;
//*********서버 : 포트를 열고 기다림 // 클라이언트 : 접속을 하는 쪽***************************

import java.net.*;
import java.io.*;
import java.util.*;

public class TestClient {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		Socket socket = new Socket("211.183.2.91",1007); // 문자열로 ip주소를 넘겨주고 1007번(포트 번호)에 접속
//		Socket socket = new Socket("localhost",1007); // 내컴퓨터에 접속
//		Socket socket = new Socket("127.0.0.1",1007); // 1007번 포트가 돌고있는 서버가 없어서 exception이 발생
		// 내부 통신을 할 때
//	TestServer를 실행 -> 접속 대기 => TestClient -> 연결 
		
		System.out.println("client]연결 성공...");
		
		OutputStream os = socket.getOutputStream();
		DataOutputStream dos = new DataOutputStream(os);
		
		Scanner scn = new Scanner(System.in);
		System.out.print("전달값 입력>");
		String value = scn.nextLine(); // enter를 치면 문자열이 전달되고
//		dos.writeInt(value);
		dos.writeUTF(value);
	
		socket.close();
	
	}

}

// 네트워크 - 이더넷
// or cmd - ipconfig
// IPV4 주소 : 컴퓨터의 고유한 주소
// 211.183.2.87

// 한 명 빼고는 exception이 되었음.