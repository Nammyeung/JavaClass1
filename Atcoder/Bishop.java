package Atcoder;

import java.util.Scanner;

public class Bishop {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int H = sc.nextInt();
		int W = sc.nextInt();
		int answer = 0;
		if(H == 1 || W == 1) {
			answer = H*W;
		} else if((H % 2 != 0) && (W % 2 != 0) ) {
			answer = (H*W/2)+1;
		} else {
			answer = (H*W/2);
		}
		System.out.println(answer);
	}
}
