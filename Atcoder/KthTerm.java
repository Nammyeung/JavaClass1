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
		System.out.println("�� ��° ���� ����ұ��? : ");
		int input = Integer.parseInt(sc.nextLine());
		int answer = A[input-1];
		System.out.println(input + "���� ���� : " + answer);
		if(input == -1) {
				System.out.println("����Ǿ����ϴ�.");
				break;
		}
		}
	}
}
