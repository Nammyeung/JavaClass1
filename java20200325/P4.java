package java20200325;
//***********************Input
import java.io.*;

public class P4 {
// try catch�� ����(������ �׻� ����� ��� throws)
	public static void main(String[] args) throws Exception{
		// TODO Auto-generated method stub
		//���� �б�....
		File file = new File("C:\\test\\aaa.dat"); // aaa.dat�� ����.
		
		FileInputStream fis = new FileInputStream(file);
		// ������ ������ filter�� ����
		BufferedInputStream bis = new BufferedInputStream(fis);
		DataInputStream dis = new DataInputStream(bis);
		// �о���̴� Ŭ������ �ҷ����δ��� close�ؾ�
		
		// �б� ����....
		// ���� ����� ��������(���� ���谡 �ʿ�)
		// ��Ʈ��
		// int int byte String 
		// String byte int int
		int a = dis.readInt(); // int ����
		int b = dis.readInt(); // int ����
		int c = dis.readByte(); // byte ����
		String d = dis.readUTF();
		
		System.out.println(a);
		System.out.println(b);
		System.out.println(c);
		System.out.println(d);
		// ���Ͽ��� ����� ���� �״�� ���.
		
		dis.close();
		
	}

}

// �ش� API�� �̿��ؼ� Save�� Load ����� �߰���ų ����.