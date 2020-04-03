package Backjoon;

import java.util.Scanner;

public class change {
	public static int price;
	public static int count;	
	
	public static int[] coinArr = {500, 100, 50, 10, 5, 1};
	
	public static void main(String[] args) {
		System.out.print("사용한 금액을 임력하시오");
		Scanner sc = new Scanner(System.in);
		
		price = 1000 - sc.nextInt();
		
		System.out.println("남은 금액은 : " + price);
		
		for(int coin:coinArr) {
            getCount(coin);
        }
        
        System.out.println("사용한 동전의 갯수 : " + count);
    }
    
    public static void getCount(int coin) {
    	System.out.println(price + "/" + coin);
        count += (price / coin); // 사용한 동전의 갯수를 구할 수 있음.
        System.out.println("사용한 동전 갯수 : " + count);
        price = price - (coin * (price / coin));
        System.out.println("남은 금액은 : " + price);
    }


}

