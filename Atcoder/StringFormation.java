package Atcoder;

import java.util.Scanner;

public class StringFormation {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		StringBuffer pre = new StringBuffer();
		StringBuffer post = new StringBuffer();
		System.out.print("���ڸ� �Է��Ͻÿ� : ");
		String input = sc.nextLine();
		StringBuffer ans = new StringBuffer(input);
		System.out.print("���� Ƚ���� �Է��Ͻÿ� :");
		int total = sc.nextInt();
		int count = 0;
		while(true) {
		System.out.print("T�� �Է��Ͻÿ� : ");
		int T = sc.nextInt();
		if(T == 1) {
			input = reverse(input);
			System.out.println(input);
		} else if(T == 2) {
			System.out.print("F�� �Է��Ͻÿ� : ");
			int F = sc.nextInt();
			if(F == 1) {
				System.out.print("�߰� �� ���ڸ� �Է��Ͻÿ� : ");
				ans.insert(input.length(),sc.nextLine());
				System.out.println(ans);
			} else if(F == 2) {
				System.out.print("�߰� �� ���ڸ� �Է��Ͻÿ� : ");
				ans.insert(0,sc.nextLine());
				System.out.println(ans);
			}
		}
			count++;
			if(count == total) {
				input = ans.toString();
				System.out.println(input);
				break;
			}
		}
		}
// T1 = 1 : reverse the string S.
		public static String reverse(String input) {
			StringBuffer strBuffer = new StringBuffer();
			
			for(int i = 0 ; i < input.length(); i++) {
				strBuffer.append(input.charAt(input.length() - i - 1));
			}
//			https://stackoverflow.com/questions/26965931/how-to-take-input-for-a-stringbuffer-object-in-java/26966089
			return strBuffer.toString();
		}
}
	


