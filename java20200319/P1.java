package java20200319;
//******************************������*******************************
public class P1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

//		//		int a = 10; // ���� ����
//		final int a = 10; // ���� ����
//		// ����� �������� �ǹ��̱⵵ ��.(final(������)�� ����ϴ� ������?)
//		a = 20; // ���� �ִ´� =! ��������
//		a = 30; // ����(final : ������) => �������� �ȵȴ�.(��������, �������)
//		
//		System.out.println(a);
	int v1 = 10;
	int v2 = 20;
	int result = A1.plus(v1,  v2);
	System.out.println(result);
	}

}

class A1 {
	static int plus(final int a ,final int b) { // final : �ڵ��� �������� �к�
		
		a = 20; // �Ű������� ���� ������ ó���� �ؾ��ϴµ� ��ȯ�ϴ� ���� �ǹ�
		// ���Ŀ� ������ �� �� �Ǽ��� �߻����� �ʵ��� �Ű������� ������ ���� �ٲ��� �ʵ��� fianl�� ������ �д� => ������
		
		return a + b;
	}
}
// �� �� ���� § �ڵ�, ������ § �ڵ�
