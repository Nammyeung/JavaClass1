package java20200325;
/////////////////// ���� �����ϴ� API�� �ִ�.
import java.io.*; // java��Ű�� �ȿ� io(Input/Output)���� API�� ��� ����ϰڴ�.

public class P1 {

	public static void main(String[] args) throws Exception{
		// TODO Auto-generated method stub
		//���� �����..... API... Ȱ��...
		int a = 400; // a -> RAM(�޸�)�� ���� => �ϵ��ũ�� ������ �����?
		
		File xxx = new File("C:\\test\\aaa.dat");
		//"C:\\test\\aaa.dat" ������ ������ ��������, �Ӽ��� �˻�(file descriptor)

		FileOutputStream fos 
			= new FileOutputStream(xxx);
		//FileOutputStream(FOS)
		/*
		 * Multiple markers at this line - Unhandled exception type
		 * FileNotFoundException - The constructor FileOutputStream() is undefined
		 * ������ ������ �ƴ� �������� ������ �߻��� �� ����.
		 * => try catch �� VS ������(throws)
		 */
	
		// throw�� ���� �޼ҵ� �ȿ��� try catch �� �Ƚᵵ ��.
		
//		fos.write(0); // a���� �� 10�� �Ѿ�� ������ ��. / 00
//		fos.write(9); // 1����Ʈ ���� 	    	  	  / 09
//		fos.write(11); // 1����Ʈ ���� 				  / 0B 
//		fos.write(15); // 1����Ʈ ���� 				  / 0F
//		fos.write(-1); // 1����Ʈ ���� 				  / FF
		// ����Ʈ ������ �� => 5����Ʈ ����
		//[00][00][00][0A] => aaa.bat
		
//		fos.write(a); //90 => �߸���?
//		// 400�� 16������ ��Ÿ���� 190
//		
//		// a: 00 00 01 90
//		// 4����Ʈ
//		
//		fos.write(a >> 24); // 00 00 00 00 �����ʺ��� 3�� ����
//		fos.write(a >> 16); // 00 00 00 00 �����ʺ��� 2�� ����
//		fos.write(a >> 8); //  00 00 00 01 �����ʺ��� 1�� ����
//		fos.write(a >> 0); //  00 00 01 90 �����ʺ��� 0�� ����
//		
//		
//		���� ������ �����ϰ� �ϱ� ���� Filter�� ����ؼ� ����ϴ� API�� ����
//		�ھ�
//		FileOutputStream fos 
//		= new FileOutputStream(xxx);
//		�긦 �������ִ� Api�� ���ڴ�.
//		������ �������ִ°� API�� �Ǿ��ִ�.
		
		BufferedOutputStream bos =
				new BufferedOutputStream(fos);
		
//		DataOutputStream dos =
//				new DataOutputStream(fos); // fos�� �־ ������.
//		
		DataOutputStream dos =
				new DataOutputStream(bos);
//		************************************�� 3���� ���͸� ����.
		
		dos.writeInt(10);
		dos.writeInt(400); // 4����Ʈ�� �� �� �� => 8����Ʈ
//		Int���� �ɰ��� writing�� ����.
		dos.writeByte(5); // �ѹ���Ʈ�� ���� ����.
		
		dos.writeUTF("AABBaabb"); 
		// 00 00 00 0A 00 00 01 90 05 00 08 41 41 42 42 61 61 62 62
		
		//��� 2: RAM�� ������ ���� ��� ���������� �� �濡 ����
		// Buffer�� �׾Ƶ� ������ �� �濡 ����
		
		
		fos.close(); // ������ ���� ������ ����������� �����ؼ� ������ ���� �� ����.
		//ex - �̹� �����ִ� �����Դϴ�, ������ �Ұ����մϴ�.
		
		System.out.println("�ȳ��ϼ���");
		// "C:\\test\\aaa.dat" ����
		// ũ�Ⱑ 1����Ʈ?
	
	}

}
