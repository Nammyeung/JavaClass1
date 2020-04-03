package Backjoon;

import java.util.Arrays;
import java.util.Scanner;

public class Coin2 {

	private void solve() {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt(); // n : 코인의 갯수
		int k = sc.nextInt(); // k : 원하는 코인의 합계
		
		int[] coin = new int[n]; // s : 코인을 담는 공간?
		int[] dp = new int[k + 1]; // s : 코인의 합계를 담는 공간?
		
		for (int i = 0 ; i < n ; i++) {
			coin[i] = sc.nextInt(); // 코인을 입력하기 위해 값을 받음.
		}
		
		Arrays.fill(dp,  10001); // dp 배열의 값을 10001로 채워넣는다.
		dp[0] = 0; // 그리고 dp[0]만 0으로 값을 넣는다.
		
		for (int i = 0 ; i < n ; i++) {
			// 코인에 담긴 값들을 오름차순으로 차례대로 넣는데 범위를 원하는 코인의 합계로 한다(k)
			for ( int j = coin[i] ; j <= k ; j++) {
				dp[j] = Math.min(dp[j], dp[j - coin[i]] + 1);
			}
		}
		System.out.println(dp[k] == 10001 ? -1 : dp[k]);
		}
//		dp[j] => 이전의 동전(i-1)을 기준으로 누적시킨 경우의 수
//		dp[j - coin[i]] => 현재 동전(i)을 사용하여 만들 수 있는 경우의 수
//
//		출처: https://mygumi.tistory.com/129 [마이구미의 HelloWorld]
	
	
	public static void main(String[] args) {
//		sc.init();

		new Coin2().solve();
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int i, j, n = sc.nextInt(); // n : 동전의 갯수
		int k = sc.nextInt(); // k : 동전 가치의 합산
		int a[] = new int [n+1], d[] = new int[k+1];
		
		for(i = 1 ; i <= k ; i++) 
		d[i] = 100001;
		d[0] = 0;
		
		for(i = 1 ; i <= n ; i++) a[i] = sc.nextInt();
		
		for(i = 1 ; i <= n ; i++)
			for(j = a[i] ; j <= k ; j++)
				d[j] = Math.min(d[j],  d[j-a[i]] + 1);
		
		if(d[k]==100001) d[k] = -1;
		System.out.println(d[k]);
		
		sc.close();
		
	}
}

