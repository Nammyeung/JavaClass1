package java20200326;
// CPU*2 + 1
// 7���� �ھ �����?
public class P8 {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
//		int sum = 0;
//		for(int i = 0 ; i < 1000000 ; i++) {
//			sum += i;
////		�鸸���� ��
//		}
//		
//		System.out.println(sum);
		
		SumThread th1 = new SumThread(1, 250000);
		SumThread th2 = new SumThread(250001, 500000);
		SumThread th3 = new SumThread(500001, 750000);
		SumThread th4 = new SumThread(750001, 1000000);
		// new �����ؼ� ������ �޸𸮿� sum�� ���� ����.
		
//		th1.start();
//		th2.start();
//		th3.start();
//		th4.start();
//		
//		int total = th1.sum +  th2.sum + th3.sum + th4.sum;
//		System.out.println("1~100�� ������ �� : " + total);
		// total���� 1~100�������� ���� �����°�?
		// �����ų ������ ����� �ٸ��� ����.
		
		// �� ���������� �����ϵ��� �ϴ� �޼ҵ� : join()
		
		th1.start();
		th2.start();
		th3.start();
		th4.start();
		// thread�� ������ ���� �����忡�� �ٸ��ɷ� �����ϰڴ�.
		th1.join();
		th2.join();
		th3.join();
		th4.join();
		
		int total = th1.sum +  th2.sum + th3.sum + th4.sum;
		System.out.println("1~100�� ������ �� : " + total);
		
		
	}
}
// Ư���� �������� ���� �հ谡 �ǵ����ϴ�
// ****************�޸� ���� ����
class SumThread extends Thread{
	public int sum;
	private int start;
	private int end;
	// i�� start���� end����
	public SumThread(int start, int end) {
		this.start = start;
		this.end = end;
	}
		
	@Override
	public void run() {
		
		for(int i = start ; i <= end ; i++) {
			sum += i;
		}
		
	}
}

// ��Ʈ��ũ ���α׷����� �����带 ���
// ������Ʈ �� �̸��� �����鼭 ���.