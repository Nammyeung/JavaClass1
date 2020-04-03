package Atcoder;

import java.util.Scanner;

public class Banned_K {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int[] A = new int[N];
		int[] B = new int[N];
		for(int i = 0 ; i < N ; i++) {
			A[i] = sc.nextInt();
		}
		for(int i = 0 ; i < N ; i++) {
			int count = 0;
			for(int j = 0 ; j < N ; j++) {
				if(A[i] == A[j]) {
					count++;
				}
			}
			B[i] = count-1;
		}
		for(int k = 0 ; k < N ; k++) {
			System.out.println(B[k]);
		}
	}
}
