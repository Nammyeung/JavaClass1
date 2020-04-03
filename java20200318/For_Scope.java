package java20200318;

public class For_Scope {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int i = 0;
				
		for(i = 0 ; i < 10 ; i++) {
			if(i == 7) {
				break;
			}
		}
		
		System.out.println(i);
		
		for(int x = 0 ; i < 10 ; i++) {
		// for문 조건에 여러 변수 사용, 문법적으로는 상관없지만 논리적으로는 문제가 생길 여지가 있음	
		}
	}

}
