package java20200319;

public class P4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		A2 ref = new A2();
		ref.v1 = 10;
//		ref.v4 = 20;
//		Ŭ������ ��ü ������ ����, 
//		.(ȣ��)�� ���� �� : private ȣ�� �ȵ�.
		String name1 = "����";
		int balance1 = 10000;
		
		balance1 += 20000;
		
		System.out.println(balance1);
		
		balance1 -= 10000;
		
		System.out.println(balance1);
	}

}

class A2{
	// public�� private�� ���������� ���(99%���), �ٸ� �͵�(1%)
	public int v1;
	protected int v2;
	int v3;
	private int v4;	
}
