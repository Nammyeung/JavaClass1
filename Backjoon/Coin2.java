package Backjoon;

import java.util.Arrays;
import java.util.Scanner;

public class Coin2 {

	private void solve() {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt(); // n : ������ ����
		int k = sc.nextInt(); // k : ���ϴ� ������ �հ�
		
		int[] coin = new int[n]; // s : ������ ��� ����?
		int[] dp = new int[k + 1]; // s : ������ �հ踦 ��� ����?
		
		for (int i = 0 ; i < n ; i++) {
			coin[i] = sc.nextInt(); // ������ �Է��ϱ� ���� ���� ����.
		}
		
		Arrays.fill(dp,  10001); // dp �迭�� ���� 10001�� ä���ִ´�.
		dp[0] = 0; // �׸��� dp[0]�� 0���� ���� �ִ´�.
		
		for (int i = 0 ; i < n ; i++) {
			// ���ο� ��� ������ ������������ ���ʴ�� �ִµ� ������ ���ϴ� ������ �հ�� �Ѵ�(k)
			for ( int j = coin[i] ; j <= k ; j++) {
				dp[j] = Math.min(dp[j], dp[j - coin[i]] + 1);
			}
		}
		System.out.println(dp[k] == 10001 ? -1 : dp[k]);
		}
//		dp[j] => ������ ����(i-1)�� �������� ������Ų ����� ��
//		dp[j - coin[i]] => ���� ����(i)�� ����Ͽ� ���� �� �ִ� ����� ��
//
//		��ó: https://mygumi.tistory.com/129 [���̱����� HelloWorld]
	
	
	public static void main(String[] args) {
//		sc.init();

		new Coin2().solve();
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int i, j, n = sc.nextInt(); // n : ������ ����
		int k = sc.nextInt(); // k : ���� ��ġ�� �ջ�
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

