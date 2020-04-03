package for_statement;

public class test3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int i = 1, sum = 1;
		for(i = 1 ; i <= 10 ; i++) {
			sum += i;
			System.out.println(i + "번째 수열 = " + sum );
		}
		System.out.println("피보나치 수열의 10 번째 수 = " + sum );
	}

}
