package Atcoder;

import java.util.Scanner;

public class TheNumberOfEvenPairs {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int M = sc.nextInt();
		int answer = combination(N) + combination(M);
		System.out.println(answer);
		
	}
	
	public static int combination(int n) {
		
		int combination = n;
		combination = n*(n-1)/2;
		return combination;
	}
}	

