package Atcoder;

import java.util.Scanner;

public class SimpleStringQueries {
	static StringBuilder sb = new StringBuilder();
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		// ���� n�� �Է¹޴´�.
		setStr(1, 0, new int[n]);
		System.out.println(sb);
		// Output�� sb
	}
	
	static void setStr(int idx, int max, int[] arr) {
		if (idx == arr.length) { 
			for(int i = 0 ; i < arr.length ; i++) {
				sb.append((char)(arr[i] + 'a'));
				System.out.println(i + "�ε����� for�� ��µ� �� :" + sb);
			}
			sb.append("\n");
			System.out.println("for�� ��µ� �� :" + sb);
			return;
		}
		for(int i = 0 ; i <= max + 1 ; i++) {
			arr[idx] = i;
			System.out.println(idx + " �ε����� arr�� " + arr[idx] + " for���� ���� " + i);
			setStr(idx + 1, Math.max(max,  i), arr);
		}
	}
}


