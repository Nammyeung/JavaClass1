package Backjoon;

import java.util.Arrays;
import java.util.Scanner;

public class coin {

	public static void main(String[] args) {
		   Scanner sc = new Scanner(System.in);

	        int n = sc.nextInt();
	        int s = sc.nextInt();

	        int[] coin = new int[101];//�ε��� ��ȣ 1���� ���������� �����Ϸ��� +1�� �ؼ� �迭 ����
	        int[] dp = new int[10001];

	        for(int i = 1 ; i <= n ; i++) {
	            coin[i] = sc.nextInt();
	            System.out.printf("coin[%d] : %d\n", i, coin[i]);
	        }

	        //i�� x��°->coin[x��° ���� ����]�� ��츦 �ǹ�
	        //j�� i�� ���� ������ 1~s���� ä��� ����� ���� �ǹ�
	        dp[0] = 1; //���� ������
	        for(int i = 1 ; i <= n ; i++) {
	            for(int j = coin[i] ; j <= s ; j++) {
	                dp[j] += dp[j - coin[i]];
	                System.out.printf("dp[" + j + "]" + " += " + "dp[" + j + "- (coin[" + i + "] = " + coin[i] + ")]\n");
	                System.out.printf("dp[" + j + "] = " + dp[j] + "\tdp[" + j + " - coin[" + i + "]] = " +  dp[j - coin[i]] + "\n");
	                /*
	                 * ��������, 3��¥�� ������ ������ �ִٰ� �����մϴ�. 
	3��¥�� �������� 3���� 1�������� 6���� 2+2+2�� 3+3 2������ ��찡 �����մϴ�. 
	���⼭ ���� ���α׷����� ������ ���ɴϴ�. 
	������ ��츦 �����س���, ������ ���� ������ ��츦 ���� �����鼭 ����� ���� ����մϴ�.
	��, 6���� ����� ����� ���� ����� ��, 2��¥���� 6���� ���� �� �ִ� ����� ���� 3��¥���� 6���� ���� �� �ִ� ����� ���� ���ؾ� �Ѵٴ� �ǹ��Դϴ�. 
	                 */
	            }
	        }

	        System.out.println(dp[s]); 

	    }
	}