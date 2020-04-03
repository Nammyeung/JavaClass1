package java20200326_n;

import java.net.*;
import java.io.*;

public class TestServer {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		ServerSocket serverSocket = 
				new ServerSocket(1007); // ()에 포트 번호를 넣어줌. 
		// 1007번으로 포트 번호를 생성
		// Socket : 통신기의 소켓 
//	Socket을 열고 통신자원만 생산
		
		System.out.println("server]연결을 기다립니다.");
		
		Socket socket = serverSocket.accept(); // 누군가의 연결을 기다리며 accept()에서 멈춰있음
				
		System.out.println("server]누군가 연결되었습니다.");
	
		InputStream is = socket.getInputStream(); // 무언가의 inputStream을 가져옴
		DataInputStream dis = new DataInputStream(is); // int단위로 주고 받기 위해 dis를 받음.
		// Buffered 없음
		
//		int a = dis.readInt(); // int값을 리턴
		String a = dis.readUTF(); // 전달하는 쪽에서도 문자열을 전달
		
		System.out.println("server]전달 받은 값 : " + a); // 전달 받은 값을 입력
		
		socket.close();
		
	}

}

// OutputStream
// InputStream
// 특징 : 바이트 단위로 전달을 주고받음.
// DataInputStream : int단위로 주고 받기 위해
// BufferedStream은 쓰지 말라 : 바로바로 보내야하기 때문에 buffer에 저장될 필요가 없음

/*
 * SYN(Synchronization:동기화) - S : 연결 요청 플래그


TCP 에서 세션을 성립할 때  가장먼저 보내는 패킷, 
시퀀스 번호를 임의적으로 설정하여 세션을 연결하는 데에 사용되며 초기에 시퀀스 번호를 보내게 된다.

ACK(Acknowledgement) - Ack : 응답

상대방으로부터 패킷을 받았다는 걸 알려주는 패킷, 다른 플래그와 같이 출력되는 경우도 있습니다.
받는 사람이 보낸 사람 시퀀스 번호에 TCP 계층에서 길이 또는 데이터 양을 더한 것과 같은 ACK를 보냅니다.
(일반적으로 +1 하여 보냄) ACK 응답을 통해 보낸 패킷에 대한 성공, 실패를 판단하여 재전송 하거나 다음 패킷을 전송한다.

출처: https://mindgear.tistory.com/206 [정리]

* TCP 3-way Handshake 란?

TCP는 장치들 사이에 논리적인 접속을 성립(establish)하기 위하여 three-way handshake를 사용한다.

TCP 3 Way Handshake는 TCP/IP프로토콜을 이용해서 통신을 하는 응용프로그램이 데이터를 전송하기 전에 
먼저 정확한 전송을 보장하기 위해 상대방 컴퓨터와 사전에 세션을 수립하는 과정을 의미한다..

Client > Server : TCP SYN
Server > Client : TCP SYN ACK
Client > Server : TCP ACK

여기서 SYN은 'synchronize sequence numbers', 그리고 ACK는'acknowledgment' 의 약자이다.
이러한 절차는 TCP 접속을 성공적으로 성립하기 위하여 반드시 필요하다.

출처: https://mindnet.tistory.com/entry/네트워크-쉽게-이해하기-22편-TCP-3-WayHandshake-4-WayHandshake [Mind Net]

*/