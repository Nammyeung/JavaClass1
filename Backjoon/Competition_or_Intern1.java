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
		System.out.printf("남은 여성의 수 : %d\n", n);
		System.out.printf("남은 남성의 수 : %d\n", m);
		count++;
		System.out.println(count);
		if((n <= 2 || m <= 1) || k - (count*3)+3 <= 0) {
			break;
		}
		System.out.printf("대회 참가 인원 중 인턴쉽 참가 인원 제외 : %d\n", k - count*3);
	}
	System.out.println(count);
	}
}