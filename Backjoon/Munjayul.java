package Backjoon;

import java.util.Scanner;

public class Munjayul {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		String a = sc.next();
		String b = sc.next();
		int ans = a.length();
		
		for(int i = 0 ; i <= b.length()-a.length();i++) {
			System.out.println(b.length()-a.length() + "��ŭ ��ȯ");
			System.out.println(i + "��° ����");
			// (1) A�� ���̴� B�� ���̺��� �۰ų� ������ (2) A�� ���̰� B�� ���̿� ������ ������ ������ �Ѵ�.
			int cnt = 0;
			for(int j = 0 ; j < a.length() ; j++) {
				System.out.println(a.charAt(j));
				System.out.println(b.charAt(i+j));
				if(a.charAt(j) != b.charAt(i+j))
					cnt++; 
			// (1) i=0�� �� a�� b�� ������ ���ڿ��� ������ �� ���� ���� ���ڿ��� ������ �߰��� �ȴ�.
			// (2) a�� i ���ڿ��� b�� ���ڿ� i+j��° ���ڿ��� ���ʷ� ���Ѵ�.
			System.out.printf("���ڿ� %d��° ���� : %s\n",j,a.charAt(j));
			System.out.printf("���ڿ� %d��° ���� : %s\n",i+j,b.charAt(i+j));
			System.out.println("cnt�� : " + cnt);
			System.out.println("ans�� : " + ans);
			}
			System.out.println("���ڿ� a�� : " + a);
			System.out.println("���ڿ� b�� : " + b);
			ans = Math.min(cnt, ans);
		}
		System.out.println(ans);
		}
	}

// Output : A�� B�� ���̰� �����鼭 , A�� B�� ���̸� �ּҰ� �ǵ��� ���� ��, �� ���̸� ����Ͻÿ�.
