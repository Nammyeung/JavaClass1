package Atcoder;

import java.util.Scanner;

public class StringPalindrome {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		String s = sc.nextLine();
		int n = s.length();
		s.toLowerCase();
		
		System.out.println(s.substring(0, (n-1)/2));
		System.out.println(s.substring(((n+3)/2)-1,n));
		
		String firstsentence = s.substring(0, (n-1)/2);
		String secondsentence = s.substring(((n+3)/2)-1,n);
		if((s.length() % 2) == 0) {
			System.out.println("문자를 잘못 입력하셨습니다.");
		} else if(firstsentence.equals(secondsentence)) {
			System.out.println(s + " is palindrome");
		} else {
			System.out.println("no");
		}
	}

}
