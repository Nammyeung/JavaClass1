package Atcoder;

import java.util.Scanner;

public class SqrtInequality {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		int b = sc.nextInt();
		int c = sc.nextInt();
		if(Inequality(a,b,c) > 0) {
			System.out.println("Yes");
		} else {
			System.out.println("No");
		}
		
	}
	
	public static int Inequality(int a, int b, int c) {
		 return multiply(a)+multiply(b)+multiply(c)-(2*a*b)-(2*b*c)-(2*a*c);
	}
	public static int multiply(int a) {
		return a*a;
	}
}
