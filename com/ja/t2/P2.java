package com.ja.t2;

public class P2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		Xxx ref = new Xxx(); => interface�� abstract�� ���� ��ü ������ �Ұ���
//		Xxx ref = new AA();
		AA ref = new AA();
		ref.method();
		
	}

}


interface Xxx{ // �Ȱ��� ��� �޴� �뵵? => ���������� ����(abstract�� �ٸ���)
//	public abstract void method();
	void method(); // �̸�ŭ�� �ᵵ public abstract�� �ڵ����� ��.(private �ȵ�)
//	public void method(); , �����ϴ� �޼ҵ尡 �ƴ� �����ϴ� �޼ҵ��̴�.
		
}

class AA implements Xxx{ // Xxx�� ��ӹްڴ�.
	
	public void method() {
		System.out.println("�ȳ��ϼ���");
	}
// interface�� ���� ��� �޾Ұ�, AA�ȿ��� �ݵ�� �޼ҵ�(method())��	Overriding�Ǿ����.
}

//*************�������̽� ��� ����******************************
//(1) ǥ���� �����Ѵ�.