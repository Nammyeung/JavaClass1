package java20200318;

public class Scope {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a = 10;
		
		if(a > 5) { // {} : ������
			int b = 30;
			System.out.println(b);
			
		}
		int b = 40;
		
		for(int i = 0 ; i < 10 ; i++) {
			
			for(int x = 0 ; i < 20 ; i++) {
			// i�� ���� for���� ������ �ȿ� �ֱ� ������ Ȱ�밡��	
			}
		}
		
		for(int i = 0 ; i < 10 ; i++) {
			
			int sum = 0;
			
		}
	}

}
