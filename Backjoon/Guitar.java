package Backjoon;

import java.util.Scanner;

public class Guitar {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int price = 0;
		int fixedString = 0;
		int GuitarString = sc.nextInt();
		int NumberOfStore = sc.nextInt();
		System.out.println("���ľ� �� ŰŸ ���� ���� : " + GuitarString);
		System.out.println("������ ���� : " + NumberOfStore);
		int [][] Stores = new int[NumberOfStore][2];
		int j = 0;
		int i = 0;
		for(i = 0 ; i < NumberOfStore ; i++) {
			for(j = 0 ; j < 2 ; j++) {
				Stores[i][j] = sc.nextInt();
		System.out.println(i + "��° ������ " + j + "��° ��Ÿ���� ������ : " + Stores[i][j]);
			}
//		System.out.println("���ľ� �� ŰŸ ���� ���� : " + GuitarString);
//		System.out.println("������ ���� : " + NumberOfStore);
			
	}
	while(fixedString == GuitarString) {
		for(i = 0 ; i < NumberOfStore ; i++) {
			for(j = 0 ; j < 2 ; j++) {
			if(Stores[i][0] < Stores[i][1]*6 && GuitarString >= 6) {
					price += Stores[i][0];
					fixedString += 6;
			} else if(Stores[i][0] >= Stores[i][1]*6) {
					price += Stores[i][1]; 			
					fixedString += 1;
			}		
			}
		}
	}
		System.out.println("��Ÿ�� ��ġ�� �ּ� ���� : " + price);
		System.out.println("��ģ ��Ÿ�� : " + fixedString);
	}
}	


