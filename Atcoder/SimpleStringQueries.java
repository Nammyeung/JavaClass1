package Atcoder;

import java.util.Scanner;

public class SimpleStringQueries {
	static StringBuilder sb = new StringBuilder();
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		// 정수 n을 입력받는다.
		setStr(1, 0, new int[n]);
		System.out.println(sb);
		// Output은 sb
	}
	
	static void setStr(int idx, int max, int[] arr) {
		if (idx == arr.length) { 
			for(int i = 0 ; i < arr.length ; i++) {
				sb.append((char)(arr[i] + 'a'));
				System.out.println(i + "인덱스의 for문 출력된 값 :" + sb);
			}
			sb.append("\n");
			System.out.println("for문 출력된 값 :" + sb);
			return;
		}
		for(int i = 0 ; i <= max + 1 ; i++) {
			arr[idx] = i;
			System.out.println(idx + " 인덱스의 arr는 " + arr[idx] + " for문의 값은 " + i);
			setStr(idx + 1, Math.max(max,  i), arr);
		}
	}
}


