package Backjoon;

import java.util.Scanner;

public class Combination {
		
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		System.out.print("n�� �Է��Ͻÿ� :");
		int n = sc.nextInt();
		System.out.print("r�� �Է��Ͻÿ� :");
		int r = sc.nextInt();
		int answer = combination(n)/(combination(r)*(combination(n-r))); // (n! / r!*(n-r)!)
		System.out.println(answer);
		}
	public static int combination(int n) {
		int factorial = 1;
		for(int i = 1 ; i <= n ; i++) {
			factorial *= i; // ���丮�� ����
		}
		return factorial;
	}
// nCr ���� ��ȯ�ϴ� �޼���
	
	
}

