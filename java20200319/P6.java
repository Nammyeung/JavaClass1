package java20200319;

public class P6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		A3 a = new A3();
		
		A3.plus(10, 20);
		
		Math.abs(1);
		
//		Math a = new Math(); / The constructor Math() is not visible
		// �����ڰ� �־�� ��ü ����?
		System sss = null; // The value of the local variable sss is not used
		
	}

}

class A3{
	
	public A3() { // �����ڿ� private�� ���� �� �ִ°�? => �����ڰ� ������ �ȴ�. => ���� ����Ŵ(�� ������ ����, �� �̷�(����)������)
		
	}
	
	public static int plus(int a, int b) { // API�� Static���� �ۼ�
		return a+b;
	}
}