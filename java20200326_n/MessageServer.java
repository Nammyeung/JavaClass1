package java20200326_n;

import java.io.*;
import java.net.*;
import java.util.*;

public class MessageServer {

	public static void main(String[] args) throws Exception{
		// TODO Auto-generated method stub
		ServerSocket ss = new ServerSocket(7777); // 포트번호는 1~1000번 이하, 8000번대는 쓰면 안됨.
		
		
		System.out.println("서버]가동 시작 및 접속 대기...");
	
		
		Socket socket = ss.accept(); // 변수명을 지을 때 클래스명을 소문자로 해도 좋음(특별히 지을 이름이 없을때)
		
		
		System.out.println("서버]연결 되었음...");
		
		RecvThread rt = new RecvThread();
		SendThread st = new SendThread();
		
		rt.socket = socket;
		st.socket = socket;
	
		rt.start();
		st.start();
	}

}
// 둘다 while true 돌면서 
class RecvThread extends Thread{
	
	Socket socket;
	
	InputStream is; // Setter & Getter 안만들고 =으로 처리.
	@Override
	public void run() {
		try {
			InputStream is = socket.getInputStream();
			DataInputStream dis = new DataInputStream(is);
			// while : 탈출을 안할 예정(소켓이 적용되면 자동으로 exception이 적용되어 자동으로 탈출 예정)
			while(true) {
				String value = dis.readUTF();
				System.out.println("받은 메세지>" + value);
				// 무한 반복
			}
						
		} catch (Exception e) {
			// TODO: handle exception
					
		}
	}
}

class SendThread extends Thread{
	
	Socket socket;
	
	OutputStream os;
	@Override
	public void run() { // send : 계속 보내기만 할 것이기 때문에 OutputStream 사용
		try {
			Scanner scn = new Scanner(System.in);
			OutputStream os = socket.getOutputStream();
			DataOutputStream dos = new DataOutputStream(os);			
			
			while(true) {
				System.out.println("입력 q=종료>");
				String value = scn.nextLine();
				
				if(value.equals("q")) {
					break;
				}
				
				dos.writeUTF(value);
			}			
			
			socket.close();
			System.out.println("종료되었음.");
			
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}
	}
}