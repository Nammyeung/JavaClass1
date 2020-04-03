package Atcoder;

import java.util.Scanner;

public class KthTerm {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int [] A = new int[32];
		for(int i = 0 ; i < A.length ; i++) {
			A[i] = sc.nextInt();
		}
		while(true) {
		System.out.println("몇 번째 값을 출력할까요? : ");
		int input = Integer.parseInt(sc.nextLine());
		int answer = A[input-1];
		System.out.println(input + "번쨰 값은 : " + answer);
		if(input == -1) {
				System.out.println("종료되었습니다.");
				break;
		}
		}
	}
}
