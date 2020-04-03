package Atcoder;

import java.util.Scanner;

public class StationAndBus {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		String str = sc.next();
		for (int i = 1; i < 3 ; i++) {
			if(str.charAt(0) != str.charAt(i)) {
				System.out.println("Yes");
				return;
			}
		}
		System.out.println("No");
	}
}
