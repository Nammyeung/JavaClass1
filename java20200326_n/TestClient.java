package java20200326_n;
//*********���� : ��Ʈ�� ���� ��ٸ� // Ŭ���̾�Ʈ : ������ �ϴ� ��***************************

import java.net.*;
import java.io.*;
import java.util.*;

public class TestClient {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		Socket socket = new Socket("211.183.2.91",1007); // ���ڿ��� ip�ּҸ� �Ѱ��ְ� 1007��(��Ʈ ��ȣ)�� ����
//		Socket socket = new Socket("localhost",1007); // ����ǻ�Ϳ� ����
//		Socket socket = new Socket("127.0.0.1",1007); // 1007�� ��Ʈ�� �����ִ� ������ ��� exception�� �߻�
		// ���� ����� �� ��
//	TestServer�� ���� -> ���� ��� => TestClient -> ���� 
		
		System.out.println("client]���� ����...");
		
		OutputStream os = socket.getOutputStream();
		DataOutputStream dos = new DataOutputStream(os);
		
		Scanner scn = new Scanner(System.in);
		System.out.print("���ް� �Է�>");
		String value = scn.nextLine(); // enter�� ġ�� ���ڿ��� ���޵ǰ�
//		dos.writeInt(value);
		dos.writeUTF(value);
	
		socket.close();
	
	}

}

// ��Ʈ��ũ - �̴���
// or cmd - ipconfig
// IPV4 �ּ� : ��ǻ���� ������ �ּ�
// 211.183.2.87

// �� �� ����� exception�� �Ǿ���.