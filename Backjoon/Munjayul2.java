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
			// (�ҹ���)a���� z���� ���ϴ� ��
		total = X + plus;
		System.out.println(total);
		}
		System.out.println(total);
		
		// StringBuffer str = new StringBuffer(100);
		// str.append("�ȳ��ϼ���");
		//
		//// �ȳ��ϼ��並 ���� �迭�� ����.
		//// ����ӵ��� ������ ����
		// for(int i = 0 ; i < 5 ; i++) {
//			str.append(i);
		//}
		//// Buffer��� ǥ���� �ϸ� �Ҵ�� �޸��� �ӽð����� ����.
		//
		// System.out.println(str);
		
	}
}