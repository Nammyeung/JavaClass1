package java20200326;

public class P6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new Th1().start();
		new Th2().start();
	}

}
// *******************************����ȭ ������ �߻����� ���

class Data1{
	public static int count = 0; // static�̱� ������ ���α׷� ������ ���� ������ ���� ����.

}
class Th1 extends Thread{

	@Override
	public void run() {
		for(int i = 0 ; i < 100 ; i++) {
			Data1.count++;
			System.out.println(Data1.count);
		}
	}
}

class Th2 extends Thread{

	@Override
	public void run() {
		for(int i = 0 ; i < 100 ; i++) {
			Data1.count++;
			System.out.println(Data1.count);
		}
	}

}

// ���� : ������ �ڵ带 ��� ���� �׽�Ʈ �ؾ� �մϱ�?
// https://c10106.tistory.com/3956
// https://12bme.tistory.com/68
// �����带 ����ȭ�� �� ������� ���� �߻��� �� ����.