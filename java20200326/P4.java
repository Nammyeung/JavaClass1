package java20200326;

public class P4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		TestThread2 th2 = new TestThread2();
		new Thread(th2).start();
		// ��ӹ޾Ƽ� start vs �������̽��� th2�� �����ؼ� thread�� �����ؼ� start
		
		for(int i = 0 ; i < 100 ; i++) {
			System.out.println(i + "��° �ȳ��ϼ���");
		}
		
	}

}
//***************************�������̽� Ȱ�� ������ ����
class TestThread2 implements Runnable{
	
	// ** ��� �ް� �������̵� �� ���
	@Override
	public void run() {
		for(int i = 0 ; i < 100 ; i++) {
			System.out.println(i + "��° �ݰ����ϴ�.");
		}
	}
}