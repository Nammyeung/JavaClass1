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
		// str의 문자화
		System.out.println("해당 숫자를 입력하시오 : " + str);
		
		strLen = str.length();
		System.out.printf("해당 문자의 길이는 : %s\n", strLen);
		
		numCountArr = new int[10];
		// 배열 10개짜리 객체 선언
		long total = 0;
		// 문자값을 집어넣기 위한 공간
		for(int i = 0 ; i < strLen ; i++) {
			int tNum = Integer.parseInt(str.substring(i, i+1));
			numCountArr[tNum] += 1;
			System.out.printf("%d부터 %d까지의 문자 길이 : %s , %s번째 상자에 담기\n",
			i, i+1, tNum, numCountArr[tNum]);
			total += tNum;
			System.out.println("합산 : " + total);
		}
		
		// 0이 존재하지 않으면  30배수 조차도 될 수 없다.
		// 각 자리수의 총합이 3의 배수가 아니면 종료해야 한다.
		if(!str.contains("0") || total % 3 != 0) {
			// 입력 받은 수에 0이 포함되어 있지 않으면 -1 출력, 3으로 나눴을 때 나머지가 존재하면 -1
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
