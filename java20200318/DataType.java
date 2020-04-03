package java20200318;

public class DataType {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		byte v1 = 10;
		short v2 = 20;
		int v3 = 30;
		long v4 = 50;
		
		v3 = (int)v1; // int타입 = byte타입 => 자동 형변환 됨
		v1 = (byte)v3; // byte => int
		
		double v5 = 3.333;
		int v6 = (int)v5; // double -> int (x) => 강제형변환 필요(논리적으로 메모리의 손실이 발생하는 경우)
		
		int v7 = 5;
		double v8 = v7;
		// 자동 형 변환(본래 있던 메모리 공간이 충분할 때 형변환 없이 들어가도 되는 경우) vs 강제 형 변환(메모리가 더 작은 곳으로 들어가서 강제 형변환이 필요한 경우)	
				
	}

}
