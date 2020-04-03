package java20200324;

import java.util.ArrayList;

public class ObjectIsParentOfAll {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		Object ref = new AAA(); // ��� Ŭ������ Object�� ���� ����� �޾ұ� ������ ��� Ŭ������ Object�� ���Ե� �� �ִ�.
//		***������***
		AAA ref1 = new AAA();
		ref1.v1 = 10;
		ref1.v2 = 21;
		// ref1�� ref2�� ������??
		AAA ref2 = new AAA();
		ref2.v1 = 10;
		ref2.v2 = 20;
//		ref1.equals("aaaa"); // return Ÿ�� : true/false
		System.out.println(ref1); // �ٸ� �ּҰ��� ���� java20200324.AAA@15db9742
		System.out.println(ref2); // �ٸ� �ּҰ��� ���� java20200324.AAA@6d06d69c
		System.out.println(ref1.v1);
		System.out.println(ref2.v1);

		if(ref1.equals(ref2)) { // equals�� ���������� �ּҰ�(�ؽ̰�)�� ��
			System.out.println("����");
		} else {
			System.out.println("�ٸ���");
		}
		
		
		System.out.println(ref1); // ref1 : AAAŸ��
		String str = ref1.toString();
		System.out.println(str);
		
		int [] arr = {10, 20, 15, 30};
		// ������ ��������(Object�� ��� ����, �ڹ� ���ؿ����� class)
		
		System.out.println(arr);
		
		ArrayList<Integer> list = // import ArrayList (java.util) 
				new ArrayList<Integer>();
		
		list.add(10);
		list.add(20);
		list.add(40);
		list.add(30);
		
		System.out.println(list); // ���������� toString�� Overriding��.
		
//		if(ref1 == ref2) {
//			System.out.println("����");
//		}else {
//			System.out.println("�ٸ���");
//		}
	}

}

class AAA{
	int v1;
	int v2;
	@Override
	// �������̵��� ���� ���ٶ�� ��Ģ�� ���Ӱ� ����.
	public boolean equals(Object xx) {
		AAA temp = (AAA)xx;
		 // (AAA) : AAA Ÿ������ ������ Ÿ��ĳ����(type casting)
		
		if(this.v1 == temp.v1 && this.v2 == temp.v2) {
			return true;
		}
				
		return false; // ������ �ص� ���ٰ� ����.
	}
	
	@Override
	public String toString() {
		return "AAA [v1=" + v1 + ", v2=" + v2 + "]";
	}
}