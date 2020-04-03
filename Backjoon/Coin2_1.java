package Backjoon;

import java.util.Scanner;

public class Coin2_1 {
	
	static int coin[], sum[];
	static int N, K;
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		N = sc.nextInt(); // N가지 종류의 동전
		K = sc.nextInt(); // 동전의 합
	
		coin = new int[N+1];
		sum = new int[K+1];
		
		for(int i = 0 ; i < N ; i++) {
				coin[i] = sc.nextInt();
		}
		
		dp();
	}

	public static void dp() {
		
		for (int i = 0 ; i < N ; i++) {
			
			int cur = coin[i]; // 현재 동전
			System.out.printf("현재 동전 : %d\n",cur);
			for(int j = cur ; j <= K ; j++) {
				System.out.printf("현재 동전의 값 : %d\n",j);
				System.out.printf("현재 동전의 값 : %d\n",sum[j]);
				if (j == cur) {
					sum[j] = 1;
					continue;
				}
				System.out.printf("sum[%d] == %d || sum[%d] <= %d <= (sum[%d-%d] + 1) = %d && sum[%d-%d] != %d\n",j,sum[j],j,sum[j],j,cur,(sum[j-cur] + 1),j,cur,sum[j-cur]);
				System.out.printf("(sum[%d] = %d) = (sum[%d - %d] + 1) = %d\n",j,sum[j],j,cur,(sum[j-cur]+1));
				// 동전 조합
				if((sum[j] == 0 || sum[j] <= sum[j-cur] + 1) // 체크되지 않은 조합이거나 해당 조합이 최소값일 경우
						&& sum[j-cur] != 0)
				{
					sum[j] = sum[j-cur]+1;
				}	
		}
	}
	System.out.println(sum[K] == 0 ? -1 : sum[K]);
	}	

}