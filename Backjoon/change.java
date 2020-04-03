package Backjoon;

import java.util.Scanner;

public class change {
	public static int price;
	public static int count;	
	
	public static int[] coinArr = {500, 100, 50, 10, 5, 1};
	
	public static void main(String[] args) {
		System.out.print("����� �ݾ��� �ӷ��Ͻÿ�");
		Scanner sc = new Scanner(System.in);
		
		price = 1000 - sc.nextInt();
		
		System.out.println("���� �ݾ��� : " + price);
		
		for(int coin:coinArr) {
            getCount(coin);
        }
        
        System.out.println("����� ������ ���� : " + count);
    }
    
    public static void getCount(int coin) {
    	System.out.println(price + "/" + coin);
        count += (price / coin); // ����� ������ ������ ���� �� ����.
        System.out.println("����� ���� ���� : " + count);
        price = price - (coin * (price / coin));
        System.out.println("���� �ݾ��� : " + price);
    }


}

