package java20200326_n;

import java.io.*;
import java.net.*;
import java.util.*;

public class MessageServer {

	public static void main(String[] args) throws Exception{
		// TODO Auto-generated method stub
		ServerSocket ss = new ServerSocket(7777); // ��Ʈ��ȣ�� 1~1000�� ����, 8000����� ���� �ȵ�.
		
		
		System.out.println("����]���� ���� �� ���� ���...");
	
		
		Socket socket = ss.accept(); // �������� ���� �� Ŭ�������� �ҹ��ڷ� �ص� ����(Ư���� ���� �̸��� ������)
		
		
		System.out.println("����]���� �Ǿ���...");
		
		RecvThread rt = new RecvThread();
		SendThread st = new SendThread();
		
		rt.socket = socket;
		st.socket = socket;
	
		rt.start();
		st.start();
	}

}
// �Ѵ� while true ���鼭 
class RecvThread extends Thread{
	
	Socket socket;
	
	InputStream is; // Setter & Getter �ȸ���� =���� ó��.
	@Override
	public void run() {
		try {
			InputStream is = socket.getInputStream();
			DataInputStream dis = new DataInputStream(is);
			// while : Ż���� ���� ����(������ ����Ǹ� �ڵ����� exception�� ����Ǿ� �ڵ����� Ż�� ����)
			while(true) {
				String value = dis.readUTF();
				System.out.println("���� �޼���>" + value);
				// ���� �ݺ�
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
	public void run() { // send : ��� �����⸸ �� ���̱� ������ OutputStream ���
		try {
			Scanner scn = new Scanner(System.in);
			OutputStream os = socket.getOutputStream();
			DataOutputStream dos = new DataOutputStream(os);			
			
			while(true) {
				System.out.println("�Է� q=����>");
				String value = scn.nextLine();
				
				if(value.equals("q")) {
					break;
				}
				
				dos.writeUTF(value);
			}			
			
			socket.close();
			System.out.println("����Ǿ���.");
			
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}
	}
}