package Backjoon;

import java.util.Scanner;

public class number30 {
	public static final int Max = 100000;
	
	public static String str;
	public static int[] numCountArr;
	public static long strLen;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		str = sc.nextLine();
		// str�� ����ȭ
		System.out.println("�ش� ���ڸ� �Է��Ͻÿ� : " + str);
		
		strLen = str.length();
		System.out.printf("�ش� ������ ���̴� : %s\n", strLen);
		
		numCountArr = new int[10];
		// �迭 10��¥�� ��ü ����
		long total = 0;
		// ���ڰ��� ����ֱ� ���� ����
		for(int i = 0 ; i < strLen ; i++) {
			int tNum = Integer.parseInt(str.substring(i, i+1));
			numCountArr[tNum] += 1;
			System.out.printf("%d���� %d������ ���� ���� : %s , %s��° ���ڿ� ���\n",
			i, i+1, tNum, numCountArr[tNum]);
			total += tNum;
			System.out.println("�ջ� : " + total);
		}
		
		// 0�� �������� ������  30��� ������ �� �� ����.
		// �� �ڸ����� ������ 3�� ����� �ƴϸ� �����ؾ� �Ѵ�.
		if(!str.contains("0") || total % 3 != 0) {
			// �Է� ���� ���� 0�� ���ԵǾ� ���� ������ -1 ���, 3���� ������ �� �������� �����ϸ� -1
			System.out.println("-1");
			return;
		}
		
		StringBuilder sb = new StringBuilder();
		for(int i = 9 ; i >= 0 ; i--) {
			while(numCountArr[i] > 0) {
				sb.append(i);
				numCountArr[i]--;
			}
		}
		System.out.println(sb.toString());
	}

}
