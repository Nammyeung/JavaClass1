package Atcoder;

import java.util.Scanner;

public class GoldenCoin {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		int N = input.nextInt();
		int answer = 0;
		answer+=(N/500)*1000; N%=500;
		answer+=(N/5)*5;
		System.out.println(answer);
	}
}
