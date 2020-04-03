package java20200327;

import java.util.*;
import java.io.*;
import java.net.*;

public class ChatClient {

	public static void main(String[] args) throws Exception{
		// TODO Auto-generated method stub
		Scanner scn = new Scanner(System.in);
				
		System.out.println("채팅 클라이언트 시작");
		System.out.println("사용할 닉네임을 입력해 주세요...");
		System.out.print("입력>");
		
		String name = scn.nextLine();
		
		Socket socket = new Socket("211.183.2.91",7755); 
		// 연결을 원하고자 하는 ip , 포트 번호
		
		DataOutputStream dos = 
				new DataOutputStream(socket.getOutputStream());
		
		dos.writeInt(1);
		dos.writeUTF(name);
		
		// *************************************리시브 쓰레드(Receive Thread)
		ClientRecvThread rt = new ClientRecvThread();
		rt.socket = socket;
		rt.start();
		
		System.out.println("채팅 서버에 입장 하였습니다.");
		System.out.println("종료는 q를 입력하여주세요");
				
		
		while(true) {
			String message = scn.nextLine();
			if(message.equals("q")) {
				socket.close();
				System.out.println("프로그램 종료...");
				break;
			}
			
			dos.writeInt(2);
			dos.writeUTF(message);
			// 입력한 것을 서버쪽으로 전달
			// 서버는 받은 것을 Broadcasting.
			
		}
			
		
		
		
		// 전달할 thread
		
		
		
		
	}
	
}

class ClientRecvThread extends Thread{
	
	public Socket socket;
	
	public void run() {
				
		try {
			DataInputStream dis = 
					new DataInputStream(socket.getInputStream());
			
			while(true) {
				String message = dis.readUTF();
				System.out.println(message);
			}
		} catch (Exception e) {
			// TODO: handle exception
			System.out.println("");
		}
	
	}
}