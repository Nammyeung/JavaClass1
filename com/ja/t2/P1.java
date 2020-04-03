package com.ja.t2;

//**************************��Ÿũ����Ʈ : ����, ���� ����, �δ����� ���*************************
public class P1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		Marine m1 = new Marine();
//		Marine m2 = new Marine();
//		Marine m3 = new Marine();
//		
//		SCV s1 = new SCV();
//		SCV s2 = new SCV();
//		SCV s3 = new SCV();
//		
//		Tank t1 = new Tank();
//		Tank t2 = new Tank();
//		Tank t3 = new Tank();
//		Tank t4 = new Tank();
//		**********************������ ���ϴ� �� ����ŭ ����************************
		
//		Unit m1 = new Marine();
//		Unit m2 = new Marine();
//		Unit m3 = new Marine();
//		
//		Unit s1 = new SCV();
//		Unit s2 = new SCV();
//		Unit s3 = new SCV();
//		
//		Unit t1 = new Tank();
//		Unit t2 = new Tank();
//		Unit t3 = new Tank();
//		Unit t4 = new Tank();
//		*****************�������� ���ؼ� ���������� Unit���� �ٲ�********************
		
		Unit [] arr = new Unit[10]; // ���������� ���� �迭 ���� 
		arr[0] = new Tank();
		arr[1] = new Tank();
		arr[2] = new Tank();
		
		arr[3] = new SCV();
		arr[4] = new SCV();
		arr[5] = new SCV();
		
		arr[6] = new Marine();
		arr[7] = new Marine();
		arr[8] = new Marine();
		arr[9] = new Marine();
		
//		�������� �ǹ� : �θ��� ��ü�� �����ϸ� �ڽ��� ���� �� �ִ�? => �ڷ����� ������ ���̰�(Ȥ�� ���Ե� �� �ְų�)
		
//		*****************************�δ��̵�********************************
		for(int i = 0 ; i < arr.length ; i++) {
			arr[i].move();
		}
		
//		******************************�����*********************************
		for(int i = 0 ; i < arr.length ; i++) {
			arr[i].stop();
		}
//		�������� ������� �ʾұ� ������ �θ� �޼ҵ� ����.
		
//		*****************************������ ���********************************
		for(int i = 0 ; i < arr.length ; i++) {
//			(�ذ�å) - 4��°�� Tank�� ���µ� Marine���� ����ȯ�� �߱� ������ ������ ����.			
			if(arr[i] instanceof Marine) { 
//				���������� �����ϰ� �ִ� �ν��Ͻ��� ���� Ÿ���� �˾ƺ��� ���� instanceof �����ڸ� ����մϴ�. 
//				�ַ� ���ǹ��� ���Ǹ�, instanceof�� ���ʿ��� ���������� �����ʿ��� Ÿ��(Ŭ������)�� �ǿ����ڷ� ��ġ�մϴ�. 
//				�׸��� ������ ����� boolean���� true, false ���� �ϳ��� ��ȯ �մϴ�.
//				��ó: https://arabiannight.tistory.com/entry/301 [�ƶ��ȳ���Ʈ]
			
			Marine m = (Marine)arr[i]; // ���� ����ȯ ����, ���������δ� ���������� ����������� ������ ����.
//			���� ����ȯ�� �����ѵ� �ڵ� ����ȯ�� �ȵ�.
//			4��°�� Tank�� ���µ� Marine���� ����ȯ�� �߱� ������ ������ ����.
			m.useSteamPack();
			
			}			
		}
	}
}

abstract class Unit{ // �θ� => abstract�� Ŭ����(��ü ����) �뵵�� �ƴ� ��� �뵵�θ� ����.(�߻�ȭ : ��¥ Ŭ������ �ƴ� ����� ���� Ŭ������ �����Ѵ�) => ��ü�� ����� ���� ���Ѵ�?
	public int hp; // ���ָ��� ü���� �ٸ��Ƿ� �ʱⰪ�� �������� �ʴ´�.
	public int speed;
	public int ap;
//	*************************************************** Private�� �Ϸ��� getter & setter�� �־�� ��.
	public abstract void move(); // {} �κ� ��� ���� �Ұ�
//  Unit(�θ�Ŭ����)�� move()�޼ҵ�� ������ �ʿ䰡 �ִ°ɱ�? => �ƴϴ�(�������� ������ �ʿ��� �� ����) => Abstract ���
//	�������̵��� �Ѵ�. => ǥ���� �����.
// abstract Ŭ���� �ȿ��� ��� �� ���� abstract �޼ҵ带 �����ؾ���.(�ʼ��� �ƴ�)
	
	public void stop() {
		System.out.println("������ ����ϴ�.");
	}
	
	public void attack() { // ���� ���� ����� �ٸ��ٸ� �������̵�
		System.out.println("������" + ap + "�� �����մϴ�.");
	}
	
}

class SCV extends Unit{
	public SCV() {	// ������
		this.hp = 40;
		this.speed = 3;
		this.ap = 5;
	}
	@Override
	public void move() {
		System.out.println("SCV�� " + speed + "�� �����Դϴ�.");
	}
}

class Marine extends Unit{
	public Marine() {	// ������
		this.hp = 50;
		this.speed = 4;
		this.ap = 10;	
	}
	@Override
	public void move() {
		System.out.println("Marine�� " + speed + "�� �����Դϴ�.");
	}
	
	public void useSteamPack() {
		System.out.println("������ �������� ����մϴ�.");
		hp -= 10;
		ap += 20;
		speed += 3;
	}
}

class Tank extends Unit{
	public Tank() {	// ������
		this.hp = 200;
		this.speed = 10;
		this.ap = 20;
	}
	
	@Override
	public void move() {
		System.out.println("Tank�� " + speed + "�� �����Դϴ�.");
	}
}
// class SCV{
//	public int hp = 40; // ü��
//	public int speed = 3; // �̵��ӵ�
//	public int ap = 5; // attack point : ��������Ʈ
//	
////  ****************���*******************
//	public void move() { // �޼ҵ�� �׻� �ڱⰡ ���� �Ӽ��� ���� �۵��ؾ��Ѵ� => �̸��� �Ӽ��� �� ����� �Ѵ�.
//		System.out.println("SCV�� " + speed + "�� �����Դϴ�.");
//	}
//	
//	
//}
