package java20200318;

public class P15 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int v1 = 10;
		int v2 = 20;
		
		// Calc c1 = new Calc();
		int result = Calc.plus(v1,  v2); // ���� ����ó�� ������ �ؾ��� �ʿ䰡 ����.
		System.out.println(result);
		
		// Math.~~, System. : oS��� �پ��ִ� ��(S)�� Static���� ����(�����ؾ��� �ʿ䰡 ����)
	
	
	
	}
// static ����� �����ϱ� �������� ���϶�(�򰥷���?)
}

//******************�����ϰ� ��ɸ� ���õ� Ŭ���� : static���� ����***********************
class Calc{
// static ��� : �ܺο��� �Ӽ��� ������ �ʿ䰡 ���� ���(������ ����� ���� ������ �޼ҵ带 �����ρٴ�.)	
	static int plus(int a , int b) {
		return a+b;
	}
////// �����ϰ� + ��ɸ� ����
	static int minus(int a , int b) {
		return a-b;
	}
//////�����ϰ� - ��ɸ� ����	
}
