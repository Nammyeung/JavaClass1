package java20200324;

public class TrimAndSplit {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str = "�ȳ��ϼ���\n�ݰ����ϴ�\n�ߺ�Ź...";
		// Enter���� br�� �ٲ����
		System.out.println(str);
		// �����ͺ��̽� Ȥ�� �Է��� ���� �� Enter�� �� �� �ִ�.
		
		String temp = str.replace("\n", "<br>");
		System.out.println(temp);
		
		
		String str2 = " �� ����   "; // ȭ��Ʈ�����̽�(������)�� �����ϰ� �ʹ�.
		temp = str2.trim(); // �翷�� ������ ������ �� ����
		
		System.out.println("<" + str2 + ">");
		System.out.println("<" + temp + ">");
		// �˻�â���� �������̶�� �ڵ带 ã��ʹ�.
		
		str = "abCDeF";
		System.out.println(str);
		temp = str.toUpperCase(); // ���ʿ� �ִ� ���ڰ� �ϴ� �빮�ڷ� �ٲ�� ����
		System.out.println(temp);
		
	
		str = "�ȳ��ϼ���,�ݰ����ϴ�,�ߺ�Ź�����";
		// ���ο��� �迭�� ���� ���м��� �������� ä���־� ����
		String [] datas = str.split(","); // ,�� �������� �����ڴ�.
		System.out.println(datas[0]);
		System.out.println(datas[1]);
		System.out.println(datas[2]);
		// ������ �ݺ����� ���� ��.
		
		
		
		
		
		
		
	}

}
