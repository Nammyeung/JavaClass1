package java20200318;

public class DataType_Space {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		byte v1 = 10; // 1바이트
		// int v2 = 10; 4바이트
		byte v2 = 20;
		
		// byte result = v1 + v2; => int를 써야 하는 이유
		int result = (byte)(v1 + v2);
		
		int v3 = 10;
		int v4 = 20;
		int v5 = v3 + v4; 
	
	}

}
