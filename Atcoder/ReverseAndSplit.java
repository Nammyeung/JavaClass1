package Atcoder;

import java.util.ArrayList;

public class ReverseAndSplit {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// input "abc 123 apple"
		// output "cba 312 elppa"
		String input = "abc 123 apple";
		System.out.println(solution(input));
	}
	
	public static String solution(String input) {
		String[] splitedStr = split(input);
		
		StringBuffer strBuffer = new StringBuffer();
		for(String str : splitedStr) {
			strBuffer.append(reverse(str) + " ");
		}
		return strBuffer.toString();
	}
	
	//문자 나누기
	public static String[] split(String input) {
		ArrayList<String> strList = new ArrayList<>();
		
		StringBuffer strBuffer = new StringBuffer();
		for(int i = 0 ; i < input.length(); i++) {
			if(input.charAt(i) == ' ') {
				strList.add(strBuffer.toString());
				strBuffer = new StringBuffer();
			}	else {
				strBuffer.append(input.charAt(i));
			}
		}
		
		strList.add(strBuffer.toString());
		return strList.toArray(new String[strList.size()]);
	}
	
	// 거꾸 만들
	public static String reverse(String input) {
		StringBuffer strBuffer = new StringBuffer();
		
		for(int i = 0 ; i < input.length(); i++) {
			strBuffer.append(input.charAt(input.length() - i - 1));
		}
		
		return strBuffer.toString();
	}
}
