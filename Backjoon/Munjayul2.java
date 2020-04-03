package Backjoon;

import java.util.Scanner;

public class Munjayul2 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		StringBuffer str = new StringBuffer();
		String X = sc.nextLine();
		String Y = sc.nextLine();
		System.out.println((int)'A');
		System.out.println((int)'Z');
		String total = "";
		for(int i = 0 ; i <= 5 ; i++) {
			char plus = (char)(Math.random()*26 + 97);
			str.append(plus);
//			System.out.println((char)(Math.random()*26 + 97)); 
			// (소문자)a부터 z까지 구하는 식
		total = X + plus;
		System.out.println(total);
		}
		System.out.println(total);
		
		// StringBuffer str = new StringBuffer(100);
		// str.append("안녕하세요");
		//
		//// 안녕하세요를 담을 배열을 만듬.
		//// 연산속도가 월등히 빠름
		// for(int i = 0 ; i < 5 ; i++) {
//			str.append(i);
		//}
		//// Buffer라는 표현을 하면 할당된 메모리의 임시공간이 있음.
		//
		// System.out.println(str);
		
	}
}