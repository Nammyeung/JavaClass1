package Backjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Combination2 {
		
	static final int MOD = 10007;
	static int[][] dp = new int[1001][1001];
	
	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine()); // throws IOException �߰�
		
		int N = Integer.parseInt(st.nextToken());
		int R = Integer.parseInt(st.nextToken());
		
		System.out.println(solve(N, R));
	
	}
	
	static int solve(int N, int R) {
		
	//�� ���Ұ� ���� ���, ��� ���Ҹ� �� ���� ���
	if(R == 0 || N == R) return 1;
	
	if(dp[N][R] > 0) return dp[N][R];
	
	dp[N][R] = solve(N - 1, R - 1) + solve(N-1, R); // nCr = n-1Cr-1 + n-1Cr
	
	return dp[N][R] % MOD;
	}
	
// nCr ���� ��ȯ�ϴ� �޼���
	
	
}

// �ϴ� ��ū�� ���� �����ϰڽ��ϴ�.
//
// ��ū�̶�
//
// ���������� ���̻� ���� �� ���� ����� �̶�� �Ҹ��ϴ�. ���� ��� Ű���� , ������ , ������ �� ��ū�Դϴ�
//
// �ϳ� �� ���� ��� ���ڽ��ϴ�
//
// ���� �ֹε�Ϲ�ȣ�� 880111-1111111 �� �ִٰ� �����ϰڽ��ϴ� �׷� ���⼭ ��ū�� �����̳�
//
// �ٷ� 880111 , 1111111 �� ��ū�Դϴ� ���⼭ - �� �������̰� �����ڷ� ������ �͵� ���̻� ���� �� ���� �͵��� ��ū�Դϴ�
//
// ���������� �ϳ� �� ������ ����
//
// pm:05:12 �̶�� �ð��� ������ �ִٰ� �����غ��ڽ��ϴ�
//
// �׷� ���⼭ �����ڿ� ��ū�� �����ϱ��?
//
// �ٷ� �����ڴ� : ��ū�� pm 05 12 �� �ǰ���

// StringTokenizerŬ������ �޼ҵ尡 �����ϴµ� ���� ���̴� �޼ҵ带 �Ұ��ص帮�ڽ��ϴ�.
//
//
// public boolean hasMoreTokens() //��ȯ�� ��ū�� �����ִ°�
//
// public String nextToken() // ������ū�� ��ȯ
//
// �̸޼ҵ���� ���̾��Դϴ�
//
//
// �׸��� ��ū�� ��ȯ �������� �� hasMoreTokens�޼ҵ带 �Ἥ ��Ȱ�� ��ū�� �����ִ°��� üũ�� �ϰ� 
//
// nextToken�޼ҵ带 ����մϴ�.
//
// ��ȯ�� ��ū�� �����־�� ���� ��ū�� �޴°��� �ڵ��� �������� ������ ������.


