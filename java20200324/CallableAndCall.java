package java20200324;
// ****************���ٽ��� ���� : �ڵ��� ����ȭ(�������� ��.)*****************

public class CallableAndCall {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		Callable x = new Callable() {
//			int a = 10;
//			public void call() { // �������ڸ��� ������ �ؼ� �ְڴ�.
//				System.out.println("���� ������ �ڵ�..");
//				this.a = 20;
//			}
//		}; // ***������***�� ���ؼ� ������ �� �� �ִ�.
		// �͸� ��ü  ������ �����ϴ�

// �ȵ�ε����ʿ����� ������ ����
		// ���ٽ�...
		Callable x = (a,str) -> { // �Ű�����
			System.out.println("���� ������ �ڵ�");
//			System.out.println(a);
			System.out.println(str);
		};
//		-> {} call()�� �������̵��� ����
		
		
		x.call(10,"aaaa");
		
		
		// ��ӹ޴� ��ü�� ����
		
		
		
//		x.call(); // Test3���� call�� �ƴ� Test3�� �������̵��� Callable�� ss�޼ҵ尡 ȣ��.
		
		
		
	}
	
	
}

interface Callable{
	public void call(int a, String str);
//	public void call(); // �ϳ��ۿ� ���� ��
//	public void call2();
}

// �ڹٴ� ��ü ���⿡ ����ȭ => class ������ ù �ܰ� => but �ϰ���� �ʴٸ�? => 
// class Test3 implements Callable{
// 	public void call() {
// 		System.out.println("���� ����~~~~ ������ �ڵ�");
// 	}
// }

// ���ٽ��� ������ �ƴϴ�.
// ���ž��µ� Ŭ������ �����ϱ� ���� �ڵ忡 ���
// �ȵ���̵忡�� ��ư�� Ŭ������ �� �ϳ��� ����� �߰��ϰ� ���� ��