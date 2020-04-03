package java20200326_n;

import java.net.*;
import java.io.*;

public class TestServer {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		ServerSocket serverSocket = 
				new ServerSocket(1007); // ()�� ��Ʈ ��ȣ�� �־���. 
		// 1007������ ��Ʈ ��ȣ�� ����
		// Socket : ��ű��� ���� 
//	Socket�� ���� ����ڿ��� ����
		
		System.out.println("server]������ ��ٸ��ϴ�.");
		
		Socket socket = serverSocket.accept(); // �������� ������ ��ٸ��� accept()���� ��������
				
		System.out.println("server]������ ����Ǿ����ϴ�.");
	
		InputStream is = socket.getInputStream(); // ������ inputStream�� ������
		DataInputStream dis = new DataInputStream(is); // int������ �ְ� �ޱ� ���� dis�� ����.
		// Buffered ����
		
//		int a = dis.readInt(); // int���� ����
		String a = dis.readUTF(); // �����ϴ� �ʿ����� ���ڿ��� ����
		
		System.out.println("server]���� ���� �� : " + a); // ���� ���� ���� �Է�
		
		socket.close();
		
	}

}

// OutputStream
// InputStream
// Ư¡ : ����Ʈ ������ ������ �ְ����.
// DataInputStream : int������ �ְ� �ޱ� ����
// BufferedStream�� ���� ���� : �ٷιٷ� �������ϱ� ������ buffer�� ����� �ʿ䰡 ����

/*
 * SYN(Synchronization:����ȭ) - S : ���� ��û �÷���


TCP ���� ������ ������ ��  ������� ������ ��Ŷ, 
������ ��ȣ�� ���������� �����Ͽ� ������ �����ϴ� ���� ���Ǹ� �ʱ⿡ ������ ��ȣ�� ������ �ȴ�.

ACK(Acknowledgement) - Ack : ����

�������κ��� ��Ŷ�� �޾Ҵٴ� �� �˷��ִ� ��Ŷ, �ٸ� �÷��׿� ���� ��µǴ� ��쵵 �ֽ��ϴ�.
�޴� ����� ���� ��� ������ ��ȣ�� TCP �������� ���� �Ǵ� ������ ���� ���� �Ͱ� ���� ACK�� �����ϴ�.
(�Ϲ������� +1 �Ͽ� ����) ACK ������ ���� ���� ��Ŷ�� ���� ����, ���и� �Ǵ��Ͽ� ������ �ϰų� ���� ��Ŷ�� �����Ѵ�.

��ó: https://mindgear.tistory.com/206 [����]

* TCP 3-way Handshake ��?

TCP�� ��ġ�� ���̿� ������ ������ ����(establish)�ϱ� ���Ͽ� three-way handshake�� ����Ѵ�.

TCP 3 Way Handshake�� TCP/IP���������� �̿��ؼ� ����� �ϴ� �������α׷��� �����͸� �����ϱ� ���� 
���� ��Ȯ�� ������ �����ϱ� ���� ���� ��ǻ�Ϳ� ������ ������ �����ϴ� ������ �ǹ��Ѵ�..

Client > Server : TCP SYN
Server > Client : TCP SYN ACK
Client > Server : TCP ACK

���⼭ SYN�� 'synchronize sequence numbers', �׸��� ACK��'acknowledgment' �� �����̴�.
�̷��� ������ TCP ������ ���������� �����ϱ� ���Ͽ� �ݵ�� �ʿ��ϴ�.

��ó: https://mindnet.tistory.com/entry/��Ʈ��ũ-����-�����ϱ�-22��-TCP-3-WayHandshake-4-WayHandshake [Mind Net]

*/