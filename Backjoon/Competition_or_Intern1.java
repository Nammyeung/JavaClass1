package Backjoon;

import java.util.Scanner;

public class Competition_or_Intern1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	Scanner sc = new Scanner(System.in);
	int n = sc.nextInt(); // female
	int m = sc.nextInt(); // male
	int k = sc.nextInt() + 3;
	int count = 0;
	for(int i = 0 ; i <= n+m-k ; i++) {
		n -= 2;
		m -= 1;
		System.out.printf("���� ������ �� : %d\n", n);
		System.out.printf("���� ������ �� : %d\n", m);
		count++;
		System.out.println(count);
		if((n <= 2 || m <= 1) || k - (count*3)+3 <= 0) {
			break;
		}
		System.out.printf("��ȸ ���� �ο� �� ���Ͻ� ���� �ο� ���� : %d\n", k - count*3);
	}
	System.out.println(count);
	}
}