package java20200326_n;

import java.util.*;
import java.net.*;
import java.io.*;

public class MessageClient {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		Socket socket = new Socket("211.183.2.87",7777); //("ip�ּ�",��Ʈ��ȣ)
		System.out.println("Ŭ��]���� �Ǿ���");
		
		RecvThread rt = new RecvThread();
		SendThread st = new SendThread();
		
		rt.socket = socket;
		st.socket = socket;
		
		rt.start();
		st.start();
	}

}


