package java20200319;

public class P4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		A2 ref = new A2();
		ref.v1 = 10;
//		ref.v4 = 20;
//		클래스의 객체 생성은 가능, 
//		.(호출)을 했을 때 : private 호출 안됨.
		String name1 = "한조";
		int balance1 = 10000;
		
		balance1 += 20000;
		
		System.out.println(balance1);
		
		balance1 -= 10000;
		
		System.out.println(balance1);
	}

}

class A2{
	// public과 private을 중점적으로 고려(99%사용), 다른 것들(1%)
	public int v1;
	protected int v2;
	int v3;
	private int v4;	
}
