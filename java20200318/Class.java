package java20200318;

public class Class {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
// ************������ �԰� ���ÿ� ������ �ϴ� ���***************
//		 Car c1 = new Car();
//		 c1.name = "�ƹݶ�";
//		 c1.speed = 100;
		
// ************�����ڸ� ����� �ٷ� �����ϴ� ���***************		
		Car c1 = new Car(100, "�ƹ���");
		//�����ε��� ���� �ʰ� �����ϴ� ���.
		c1.speedUp(30);
		c1.run();
		int speed = c1.getCurrentSpeed();
		System.out.println(speed);
	}

}

class SomeObject {
	//********************�Ӽ� ... ����...*********************
	int v1;
	String v2;
	
	
	//***********************������....************************
	
	
	
	//***********************�޼ҵ�....************************

}

class Car{
	//********************�Ӽ� ... ����...*********************
	int speed;
	String name;
	// String studentName; // Ŭ���� ���� ��Ȯ�� �Ӽ��� �� �� �ֶǷ� �ؾ���. (ex - Car �Ӽ��� studentName�� �����Ѱ�)
	
	//***********************������....************************
	Car(int speed, String name){ // �������� �ſ� �߿��ϴ�.
		System.out.println(speed); // (�Ű����� �켱)
		this.speed = speed;
		this.name = name;
		// �Ķ��� : ��� ����
		// ��� ������ �ڱ� �ڽ��� �ν���Ʈ ������ ����ؾ� �Ѵ�.
	}
	//***********************�޼ҵ�....************************
	// ***key : �޼ҵ�� ��Ȯ�ؾ� �Ѵ�.***
	
		void run() {
			System.out.println("�ڵ����� �޸��ϴ�..");
			// ��ü���� ����
			// ������ static���� ������
			// �޼ҵ��� �ǹ̿� �´°�?
		}
		
		void speedUp(int value) { // ���ο��� ������� �ʴ� ������ ���� ������ �ʿ� x
			System.out.println(value + "��ŭ �ӵ��� �ö󰩴ϴ�.");
			this.speed += value;
		}
		
		int getCurrentSpeed() {
			System.out.println("���� �ӵ��Դϴ�.");
			return speed;
		}
		
}

