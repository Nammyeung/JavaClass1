package java20200327;

import java.util.*; // Hashmap, Arraylist
import java.io.*; // input/output
import java.net.*; // 네트워크, 소켓


public class ChatServer {

	public static void main(String[] args) throws Exception{
		// TODO Auto-generated method stub
		System.out.println("서버] 가동 시작...");
		// 프로그램할 때 어떻게 동작하는지 확인하기 위해 로그를 찍음
		ServerSocket ss = new ServerSocket(7755);
		
//		read쪽에서만 set을 쓰면 됌.
		while(true) {
						
			try {
				Socket socket = ss.accept();
				// 접속한 사람 당 소켓이 형성
				// 접속한 사람마다 inputStream, OutputStrem 형성
				DataInputStream dis 
				= new DataInputStream(socket.getInputStream());
				int command = dis.readInt();
				// 접속하자마자 1번 한 줄
				if(command == 1) {
					String nick = dis.readUTF(); 
					// 닉네임이 날라옴 => 데이터화 => ArrayList에 담는다
					// ArrayList는 처음부터 끝까지 존재해야
					User u = new User(nick, socket); // User클래스의 매개변수 받아서 객체 생성
					DataModel.list.add(u);
					
					//greeting
					// HashMap을 넣어야 하는지 ArrayList를 넣어야 하는지 자료구조를 잘 판단해서 넣을 것.
					// HashMap VS ArrayList
					for(User user : DataModel.list) {
						//collection프레임워크를 반복시킬 때 안쪽에 있는 사람 만큼만 반복
						DataOutputStream dos = 
								new DataOutputStream(user.socket.getOutputStream()); // writeUTF
						
						dos.writeUTF(u.name + "님이 입장하였습니다.");
						
					}
						
					System.out.println(u.name + "님이 입장하였습니다.");
						
						
					ServerRecvThread rt = new ServerRecvThread();
					rt.user = u;
					rt.start();
				}
				
				
				
				// 소켓을 받자마자 writeInt or writeUTF
			} catch (Exception e) {
				// TODO: handle exception
				System.out.println("accept 문제...발생");
			}
	
		}
		
	}

}


// Data ...
class User{
	public String name;
	public Socket socket;
	// 하나의 유저에는 
	public User(String name , Socket socket) {
		this.name = name;
		this.socket = socket;
	}
	
}


class DataModel{
	//유저를 담을 ArrayList를 생성해서 static에 담음
	public static ArrayList<User> list = new ArrayList<User>(); 
	// 한 개만 생성되고 DataModel만 호출하면 전역적으로 쓸 수 있음.(static)
}


class ServerRecvThread extends Thread {
	
	public User user;
	
	public void run() {
		
		try {
			DataInputStream dis 
			= new DataInputStream(user.socket.getInputStream());
			
			
			while(true) {
				int command = dis.readInt(); 
				// 정상 종료 가능
				//2. 메세지 3. 종료에 대한 신호
				
				if(command == 2) {
					// 대화의 내용에 대한 문자열이 날라옴
					String message = dis.readUTF();
					
					for(User u : DataModel.list) {
						DataOutputStream dos = 
								new DataOutputStream(u.socket.getOutputStream());
						// 모든 유저에게 Broadcasting
					dos.writeUTF(user.name + "님 : " + message);
					}
					
					System.out.println(user.name + "님 : " + message);
										
				} else if(command == 3) {
					
					DataModel.list.remove(user);
					// 유저는 리스트에서 삭제
					
					for(User u : DataModel.list) {
						DataOutputStream dos =
								new DataOutputStream(u.socket.getOutputStream());
						
						dos.writeUTF(user.name + "님이 퇴장하였습니다.");
						
						System.out.println(user.name + "님이 퇴장하였습니다.");
						break; // 탈출해서 정상 종료.
					}
					
				}
				
			}
		} catch (Exception e) {
			// TODO: handle exception
			//리스트에서 제거....
			DataModel.list.remove(user);
			System.out.println(user.name + "종료..");
		} finally {
			try {
				user.socket.close();
			} catch (Exception e) {
				// TODO: handle exception
				System.out.println("?????");
			}
		}
	
	}
}	
// 10명 => Thread 10개 생성

/* 소켓(Socket)의  정의
 * 
 * 소켓(Socket)은 1982년 BSD(Berkeley Softward Distribution) UNIX 4.1에서 처음 소개되었으며 현재 널리 사용되는 것은 1986년 BSD UNIX 4.3에서 개정된 것입니다.
 * 
 * 소켓은 소프트웨어로 작성된 추상적인 개념의 통신 접속점이라고 할 수 있는데 네트웍 응용 프로그램은 소켓을 통하여 통신망으로 데이터를 송수신하게 된다.
 * 
 * 소켓은 응용 프로그램에서 TCP/IP를 이용하는 창구 역할을 하여 응용 프로그램과 스켓 사이의 인터페이스 역할을 하고 있습니다.
 * 
 * 두 프로그램이 네트워크를 통해 서로 통신을 수행할 수 있도록 양쪽에 생성되는 링크의 단자입니다.
 * 두 소켓이 연결되면 서로 다른 프로세스끼리 데이터를 전달할 수 있습니다.
 * 결국 소켓이 연결되면 서로 다른 프로세스끼리 데이터를 전달 할 수 있습니다.
 * 소켓은 원래 캘리포니아 버클리 대학 분교에서 UNIX용으로 개발되었으며,
 * UNIX에서의 입출력 메소드의 표준인 개방/읽기/쓰기/닫기 메커니즘을 따릅니다.
 * 
 * 기본적으로 소켓은 통신을 위한 일종의 통로라고 생각할 수 있습니다. 기본적으로 소켓은 상대방에게
 * 데이터를 보내거나 받는 역할을 하며, 연결을 수동적으로 기다리느냐, 능동적으로 연결을 하느냐로!!
 * [서버] 나 [클라이언트]냐 구분할 수 있습니다.
 * (기능상 이런거지 서버와 클라이언트 정의는 아닙니다.)
 * 
 * https://juyoung-1008.tistory.com/19 참고
 */



