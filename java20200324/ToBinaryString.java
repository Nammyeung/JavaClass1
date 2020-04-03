package java20200324;

public class ToBinaryString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a = Integer.parseInt("100");
		
		String str = "FFD177"; // 문자일수도
		// 16진수의 관점에서는 숫자일수도 있다.
		a = Integer.parseInt(str, 16);
		
		System.out.println(a);
		
		int v1 = 10;
		v1 = 1000;
		String bin = Integer.toBinaryString(1000);
		System.out.println(bin);
	
	
	
	
	}

}
