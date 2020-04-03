package java20200327;

import java.util.*; // Hashmap, Arraylist
import java.io.*; // input/output
import java.net.*; // ��Ʈ��ũ, ����


public class ChatServer {

	public static void main(String[] args) throws Exception{
		// TODO Auto-generated method stub
		System.out.println("����] ���� ����...");
		// ���α׷��� �� ��� �����ϴ��� Ȯ���ϱ� ���� �α׸� ����
		ServerSocket ss = new ServerSocket(7755);
		
//		read�ʿ����� set�� ���� ��.
		while(true) {
						
			try {
				Socket socket = ss.accept();
				// ������ ��� �� ������ ����
				// ������ ������� inputStream, OutputStrem ����
				DataInputStream dis 
				= new DataInputStream(socket.getInputStream());
				int command = dis.readInt();
				// �������ڸ��� 1�� �� ��
				if(command == 1) {
					String nick = dis.readUTF(); 
					// �г����� ����� => ������ȭ => ArrayList�� ��´�
					// ArrayList�� ó������ ������ �����ؾ�
					User u = new User(nick, socket); // UserŬ������ �Ű����� �޾Ƽ� ��ü ����
					DataModel.list.add(u);
					
					//greeting
					// HashMap�� �־�� �ϴ��� ArrayList�� �־�� �ϴ��� �ڷᱸ���� �� �Ǵ��ؼ� ���� ��.
					// HashMap VS ArrayList
					for(User user : DataModel.list) {
						//collection�����ӿ�ũ�� �ݺ���ų �� ���ʿ� �ִ� ��� ��ŭ�� �ݺ�
						DataOutputStream dos = 
								new DataOutputStream(user.socket.getOutputStream()); // writeUTF
						
						dos.writeUTF(u.name + "���� �����Ͽ����ϴ�.");
						
					}
						
					System.out.println(u.name + "���� �����Ͽ����ϴ�.");
						
						
					ServerRecvThread rt = new ServerRecvThread();
					rt.user = u;
					rt.start();
				}
				
				
				
				// ������ ���ڸ��� writeInt or writeUTF
			} catch (Exception e) {
				// TODO: handle exception
				System.out.println("accept ����...�߻�");
			}
	
		}
		
	}

}


// Data ...
class User{
	public String name;
	public Socket socket;
	// �ϳ��� �������� 
	public User(String name , Socket socket) {
		this.name = name;
		this.socket = socket;
	}
	
}


class DataModel{
	//������ ���� ArrayList�� �����ؼ� static�� ����
	public static ArrayList<User> list = new ArrayList<User>(); 
	// �� ���� �����ǰ� DataModel�� ȣ���ϸ� ���������� �� �� ����.(static)
}


class ServerRecvThread extends Thread {
	
	public User user;
	
	public void run() {
		
		try {
			DataInputStream dis 
			= new DataInputStream(user.socket.getInputStream());
			
			
			while(true) {
				int command = dis.readInt(); 
				// ���� ���� ����
				//2. �޼��� 3. ���ῡ ���� ��ȣ
				
				if(command == 2) {
					// ��ȭ�� ���뿡 ���� ���ڿ��� �����
					String message = dis.readUTF();
					
					for(User u : DataModel.list) {
						DataOutputStream dos = 
								new DataOutputStream(u.socket.getOutputStream());
						// ��� �������� Broadcasting
					dos.writeUTF(user.name + "�� : " + message);
					}
					
					System.out.println(user.name + "�� : " + message);
										
				} else if(command == 3) {
					
					DataModel.list.remove(user);
					// ������ ����Ʈ���� ����
					
					for(User u : DataModel.list) {
						DataOutputStream dos =
								new DataOutputStream(u.socket.getOutputStream());
						
						dos.writeUTF(user.name + "���� �����Ͽ����ϴ�.");
						
						System.out.println(user.name + "���� �����Ͽ����ϴ�.");
						break; // Ż���ؼ� ���� ����.
					}
					
				}
				
			}
		} catch (Exception e) {
			// TODO: handle exception
			//����Ʈ���� ����....
			DataModel.list.remove(user);
			System.out.println(user.name + "����..");
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
// 10�� => Thread 10�� ����

/* ����(Socket)��  ����
 * 
 * ����(Socket)�� 1982�� BSD(Berkeley Softward Distribution) UNIX 4.1���� ó�� �Ұ��Ǿ����� ���� �θ� ���Ǵ� ���� 1986�� BSD UNIX 4.3���� ������ ���Դϴ�.
 * 
 * ������ ����Ʈ����� �ۼ��� �߻����� ������ ��� �������̶�� �� �� �ִµ� ��Ʈ�� ���� ���α׷��� ������ ���Ͽ� ��Ÿ����� �����͸� �ۼ����ϰ� �ȴ�.
 * 
 * ������ ���� ���α׷����� TCP/IP�� �̿��ϴ� â�� ������ �Ͽ� ���� ���α׷��� ���� ������ �������̽� ������ �ϰ� �ֽ��ϴ�.
 * 
 * �� ���α׷��� ��Ʈ��ũ�� ���� ���� ����� ������ �� �ֵ��� ���ʿ� �����Ǵ� ��ũ�� �����Դϴ�.
 * �� ������ ����Ǹ� ���� �ٸ� ���μ������� �����͸� ������ �� �ֽ��ϴ�.
 * �ᱹ ������ ����Ǹ� ���� �ٸ� ���μ������� �����͸� ���� �� �� �ֽ��ϴ�.
 * ������ ���� Ķ�����Ͼ� ��Ŭ�� ���� �б����� UNIX������ ���ߵǾ�����,
 * UNIX������ ����� �޼ҵ��� ǥ���� ����/�б�/����/�ݱ� ��Ŀ������ �����ϴ�.
 * 
 * �⺻������ ������ ����� ���� ������ ��ζ�� ������ �� �ֽ��ϴ�. �⺻������ ������ ���濡��
 * �����͸� �����ų� �޴� ������ �ϸ�, ������ ���������� ��ٸ�����, �ɵ������� ������ �ϴ��ķ�!!
 * [����] �� [Ŭ���̾�Ʈ]�� ������ �� �ֽ��ϴ�.
 * (��ɻ� �̷����� ������ Ŭ���̾�Ʈ ���Ǵ� �ƴմϴ�.)
 * 
 * https://juyoung-1008.tistory.com/19 ����
 */



