package java20200324;

public class TryCatchCatch {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
		int a = 10;
		int b = 20;
		String str = null;
		
		int result = a/b;
		
		System.out.println(result);
		System.out.println(str.charAt(0));
		}catch(ArithmeticException e) { // �ش� exception�� �߻��� ���� ����.
			// e : ��������
			System.out.println("���� ó�� �ڵ�...");
		
		}//else if�� ���� ���� ���� catch���� ����� �� ����.
		catch(NullPointerException e) {
			System.out.println("null ���� ó�� �ڵ�...");
		}catch(Exception e) {
			System.out.println("��Ÿ ��� ���� ó�� �ڵ�....");
		}
		
		
		
		
		
		
		System.out.println("������ �ڵ��....");
	
	}

}
