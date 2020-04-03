package java20200324;

public class TryCatchFinally {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str1 = "�ȳ��ϼ���";
		System.out.println(str1.charAt(0));
		// . : ���� ������(����� �ּҿ� ������ �ϰڴ�)
		String str2 = null;
//		System.out.println(str2.charAt(0));
//		unchecked error �߻� -> NullPointerException(�������� ������ ���� �������� ���� �߻�)
		try {
		int [] arr = new int[30];
		arr[0] = 1;
		arr[10000] = 10; // java.lang.ArrayIndexOutOfBoundsException: 10000
		} catch(Exception e) {
			System.out.println("���� �߻�....");
			return; // return �ڵ尡 �������� finally�� �׻� ����ȴ�.
			// Exception�� �߻��ϸ� ���α׷��� ������� �ʰ� �������� �Ѿ��.
		}finally {
			System.out.println("�ȳ��ϼ���");
		} // finally�� �׻� ������ �ȴ�.
//		[] : .�� ���� ���ٿ����� => NullPointerException�߻� ����
//		���� �ȵ����� ������ ������ �߻����� �ʴ´�.
//		exception�ڵ尡 �߻��� �� Ŭ������ �ͼ������� �Ѵ�.
		
		System.out.println("���Ŀ� ����� �ڵ��");
	}

}
