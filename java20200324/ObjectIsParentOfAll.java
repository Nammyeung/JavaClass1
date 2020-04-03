package java20200324;

import java.util.ArrayList;

public class ObjectIsParentOfAll {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		Object ref = new AAA(); // 모든 클래스는 Object에 의해 상속을 받았기 때문에 모든 클래스는 Object에 포함될 수 있다.
//		***다형성***
		AAA ref1 = new AAA();
		ref1.v1 = 10;
		ref1.v2 = 21;
		// ref1과 ref2가 같은가??
		AAA ref2 = new AAA();
		ref2.v1 = 10;
		ref2.v2 = 20;
//		ref1.equals("aaaa"); // return 타입 : true/false
		System.out.println(ref1); // 다른 주소값을 가짐 java20200324.AAA@15db9742
		System.out.println(ref2); // 다른 주소값을 가짐 java20200324.AAA@6d06d69c
		System.out.println(ref1.v1);
		System.out.println(ref2.v1);

		if(ref1.equals(ref2)) { // equals는 내부적으로 주소값(해싱값)을 비교
			System.out.println("같다");
		} else {
			System.out.println("다르다");
		}
		
		
		System.out.println(ref1); // ref1 : AAA타입
		String str = ref1.toString();
		System.out.println(str);
		
		int [] arr = {10, 20, 15, 30};
		// 뭔가의 참조변수(Object를 상속 받음, 자바 기준에서는 class)
		
		System.out.println(arr);
		
		ArrayList<Integer> list = // import ArrayList (java.util) 
				new ArrayList<Integer>();
		
		list.add(10);
		list.add(20);
		list.add(40);
		list.add(30);
		
		System.out.println(list); // 내부적으로 toString이 Overriding됨.
		
//		if(ref1 == ref2) {
//			System.out.println("같다");
//		}else {
//			System.out.println("다르다");
//		}
	}

}

class AAA{
	int v1;
	int v2;
	@Override
	// 오버라이딩을 통해 같다라는 원칙을 새롭게 규정.
	public boolean equals(Object xx) {
		AAA temp = (AAA)xx;
		 // (AAA) : AAA 타입으로 강제로 타입캐스팅(type casting)
		
		if(this.v1 == temp.v1 && this.v2 == temp.v2) {
			return true;
		}
				
		return false; // 뭔짓을 해도 같다고 나옴.
	}
	
	@Override
	public String toString() {
		return "AAA [v1=" + v1 + ", v2=" + v2 + "]";
	}
}