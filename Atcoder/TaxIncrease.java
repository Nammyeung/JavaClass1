package Atcoder;

import java.util.Scanner;

public class TaxIncrease {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int x = sc.nextInt();
		int y = sc.nextInt();
		for(int i = 0 ; i < 2000 ; i++) {
			System.out.println(i);
			if((int)(i*0.08) == x && (int)(i * 0.1) == y) {
			// if((int)Math.floor(i * 0.08) == a && (int)Math.floor(i * 0.1) == b){
				System.out.println(i);
				return;
			}
		}
		System.out.println(-1);
	}
}

// Math.floor() : 내림
// Math.ceil() : 올림