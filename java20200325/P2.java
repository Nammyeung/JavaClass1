package java20200325;

import java.io.*;

public class P2 {

	public static void main(String[] args) throws Exception{
		// TODO Auto-generated method stub
		File file = new File("C:\\test\\bbb.dat");
		//�Ϲ������� descript�����
		
		FileOutputStream fos = new FileOutputStream(file);
		BufferedOutputStream bos = new BufferedOutputStream(fos);
		DataOutputStream dos = new DataOutputStream(bos);
		
		//���� ����...�ڵ�...������ ���� ������ �ְ�....
		
		
		
		dos.close();
		
		
	}

}
