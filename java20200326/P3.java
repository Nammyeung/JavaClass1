package java20200326;
//************************************�����带 �����ϴ� ���
//(1) ����� �޾Ƽ� thread�� �����ϴ� ���
public class P3 {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		TestThread th1 = new TestThread();
//		th1.run(); // run�� �������̵������� run�� ���������� ȣ������ ����.
		// run�� �ƴ� start�� ����
		th1.start(); // ����� ��� ������ �𸥴�?
		// �ݰ����ϴ�(�Ʒ� for��)�� ���� ����.
		// �ݺ�Ƚ���� �ø��� ��Ȳ�� ���� ���� ����Ǵ� ��ɹ��� �޶���.(���� ����)
		// =>  �̱��ھ� ����
		
		//************* run ��� �����Ű�� �Ʒ� for�� ���� => �ϳ��� ������� �����Ų ���
		for(int i = 0 ; i < 100 ; i++) {
			System.out.println(i + "�ݰ����ϴ�");
			Thread.sleep(100); // try catch�� ����
		}
		//************* ���ÿ� �����带 �����Ų ���
		
		
	}

}
//*******************ThreadŬ������ ��ӹ޴� ���
class TestThread extends Thread{
	@Override
	public void run() {
		for(int i = 0 ; i < 100 ; i++) {
			System.out.println(i + "�ȳ��ϼ���");
			try {
				                                                                                                                                                                                                                                                                                                                                                                                                                                   Thread.sleep(300); 
				// �ּ� 0.3�ʰ� ���ٴ� �ǹ� => Ÿ�̸� �뵵�� ����.(�־��� ��� 0.3�� ������ 1���� �ɸ� ���� �ֱ� ������)
			} catch (Exception e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			} // 0.3�ʰ� ��.
		}
		
	}
	
	
}

// ���� ���� �ھ ���� �� ���������� thread�� ���� �� �� �� ����.
