package java20200324;

public class PrintStackTraceAndGetMessage {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a = 10;
		int b = 0;
				
		try {
			int result = a/b;
			System.out.println(result); //  java.lang.ArithmeticException: / by zero
		}catch(Exception e) {
			e.printStackTrace(); // �ִ��� ������ �� �����
			// java.lang.ArithmeticException: / by zero�ȳ��ϼ��� (�ȳ��ϼ��� �߻� ������ � ������ �߻��ߴ�)
					
			String message = e.getMessage(); // by zero => � ���뿡 ���ؼ�
			System.out.println(message + " �� ������ �߻�");
			// by zero => � ���뿡 ���ؼ�
		}
		System.out.println("�ȳ��ϼ���");
	
	}
}
