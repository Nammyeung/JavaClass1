package java20200326;

public class P7 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		new Thread7().start();
//		new Thread7().start();
//		new Thread7().start();
		// new�� ���� �� ������ this�� v1���� �Ѿ
		// ����ȭ�� �ɸ� ������ ��������
		// �ƴϸ� �޸��� ���� ������ �߻�
		Thread7 th1 = new Thread7();
		th1.setName("1�� ������...");
		// �׽�Ʈ�� thread�̸��� ���� �� ����.
		Thread7 th2 = new Thread7();
		th2.setName("2�� ������...");
		Thread7 th3 = new Thread7();
		th3.setName("3�� ������...");

		th1.start();
		th2.start();
		th3.start();
//		 ������� �����ε� ����Ǵ� �帧�� �� ���� ����(�޸𸮸� ���ôٹ������� ����)
	}

}

class Thread7 extends Thread{
	
	int v1 = 0;
		
	public void run() {
//		v1++;
		for(int i = 0 ; i < 1000 ; i++) {
//		Data7.v1++; // ���� �޸𸮸� ������ ����.
		// �ϳ��� �ڵ尡 ����ǰ� ���� �� �ٸ� �ڵ尡 �����ϴ°���
//		�����ϰ� ���� ��
		Data7.someMethod(this.getName());
//		System.out.println(Data7.v1);
		// ������ ������ �ؼ� ���ÿ� ������ �ִ� ����
		}
	}
}

class SyncObject{
	static Object xxx = new Object(); // Object�̰� static�̱� ������ �� �Ѱ��� ����
}



class Data7{
	static int v1;
	// �������� ��쿡 ���ؼ� synchronized�� ���� �� ����
	// synchronized�ɸ� �޼ҵ�� ���� ���� ����Ǳ����� lock�� �ɸ�.
//	public static synchronized void someMethod() { // �޼ҵ带 ����ȭ ��ų ����
//		Data7.v1++;
//		System.out.println(Data7.v1);
//	}
	public static void someMethod(String name) {
//	public static synchronized void someMethod(String name) { // �޼ҵ带 ����ȭ ��ų ����
		
		System.out.println("���� �ڵ��...");
		System.out.println("���� �ڵ��...");
		// �ּҰ��� �Ȱ��� ��쿡�� ����ȭ�� ��
//		synchronized (name) {
		synchronized (SyncObject.xxx) {
		// �� �ΰ��� �ڵ�� ���� ����� �������� ������ �������� ��� ���¸� �����Ѵ�.
		Data7.v1++;
		System.out.println(name + Data7.v1);
		}
		System.out.println("���� �ڵ��...");
		System.out.println("���� �ڵ��...");
	}
}

// Dead lock ���� 