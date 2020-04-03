package java20200318;

public class Scope {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a = 10;
		
		if(a > 5) { // {} : 스코프
			int b = 30;
			System.out.println(b);
			
		}
		int b = 40;
		
		for(int i = 0 ; i < 10 ; i++) {
			
			for(int x = 0 ; i < 20 ; i++) {
			// i가 상위 for문의 스코프 안에 있기 때문에 활용가능	
			}
		}
		
		for(int i = 0 ; i < 10 ; i++) {
			
			int sum = 0;
			
		}
	}

}
