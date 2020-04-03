package Backjoon;

public class pibonachi {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] component = new int[10];
		int sum = 1;
		component[0] = 1;
		for(int i = 2 ; i < 10 ; i++) {
			component[i] = component[i-1] + component[i-2];
			sum += component[i];
			System.out.println(i + "항의 피보나치 수열의 항은 : " + sum);
		}
	}

}
