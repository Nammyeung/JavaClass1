package java20200326;
// *******************************************************Java�� ������ �����층
public class P5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		TestThread5 th5 = new TestThread5();
		th5.start();
		TestThread55 th55 = new TestThread55();
		th55.start();
	}

}

class TestThread5 extends Thread{
	@Override
	public void run() {	
		
		this.setPriority(1); // 1�� �شٴ� ���� �켱������ ���� ����.
//		this.setPriority(newPriority);
		
		for(int i = 0 ; i < 100 ; i++) {
			System.out.println("�ȳ��ϼ���");
		}
	}
}
// thread Ŭ������ 2�� ������ => ����
class TestThread55 extends Thread{
	@Override
	public void run() {
		this.setPriority(10); // TestThread5�� run()���� �ִ��� ���� �����Ű���� ����� => ������ �ƴ�
		
		for(int i = 0 ; i < 100 ; i++) {
			System.out.println(i + "�ݰ����ϴ�.");
		}
	}
}