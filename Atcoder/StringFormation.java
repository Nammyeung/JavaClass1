package Atcoder;

import java.util.Scanner;

public class StringFormation {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		String s = sc.nextLine();
		String sReverse = "";
		int sLength = s.length();
		int total = sc.nextInt();
		int k = 0;
		
		while(k == total) {
		int t = sc.nextInt();
		if(t == 1) {
			for(int i = sLength ; i > 0 ; i--) {
				sReverse += s.charAt(i);
			}
		} else if(t == 2) {
			int f = sc.nextInt();
			char add = sc.nextLine().charAt(0);
				if(f == 1) {
				sReverse = add + sReverse;
			} 	else if(f == 2) {
				sReverse = sReverse + add;
				}			
			}
			k++;
		}
		System.out.println(sReverse);
			
	}
}


