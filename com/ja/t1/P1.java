package com.ja.t1;
// ��Ű�� �� : �Ҽ��� ȸ���� ������ �ּҸ� �������� ����� => com.ȸ���(�� : samsung).Project��
public class P1 {
// Spring framework�� ���� �����ӿ�ũ(��� �����ӿ�ũ x)
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// ��� - ������ - �������̵� => �������̽�
		// �������̽� => ���
		// �������� ���̰� ���յ��� ���߱� ����....
		// ��Ӱ� �������� �������̵��� ������ �ǹ̸� ����
		
		// (1) �Ϲ����� ���
		B ref = new B();
		// (2) �������� ����� ���
		A ref1 = new B(); // ������
		//B���·� �޸𸮰� �����Ǿ����� A�� ���� => �ڵ� ����ȯ�� �Ͼ.
		ref1.v1 = 10;
	
		ref1.method3(); // A�� �޼ҵ带 ���������� �����ǵ� B�� method3()�� ȣ��
		}
	}


class A{
	public int v1;
	public void method1() {
		System.out.println("�ȳ��ϼ���");
	}	
	public void method3() {
		System.out.println("A�� �޼ҵ�...");
	}	
}
class B extends A{ // Ŭ���� B�� A�� ��ӹްڴ�.
	public int v2;
	public void method2() {
		System.out.println("�ݰ����ϴ�");
	}
	
	public void method3() { // �������̵�
		System.out.println("B�� �޼ҵ�....");
	}
	
}





