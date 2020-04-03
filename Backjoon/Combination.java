package Backjoon;

import java.util.Scanner;

public class Combination {
		
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		System.out.print("n을 입력하시오 :");
		int n = sc.nextInt();
		System.out.print("r을 입력하시오 :");
		int r = sc.nextInt();
		int answer = combination(n)/(combination(r)*(combination(n-r))); // (n! / r!*(n-r)!)
		System.out.println(answer);
		}
	public static int combination(int n) {
		int factorial = 1;
		for(int i = 1 ; i <= n ; i++) {
			factorial *= i; // 팩토리얼 구현
		}
		return factorial;
	}
// nCr 값을 반환하는 메서드
	
	
}

