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
		StringTokenizer st = new StringTokenizer(br.readLine()); // throws IOException 추가
		
		int N = Integer.parseInt(st.nextToken());
		int R = Integer.parseInt(st.nextToken());
		
		System.out.println(solve(N, R));
	
	}
	
	static int solve(int N, int R) {
		
	//고를 원소가 없는 경우, 모든 원소를 다 고르는 경우
	if(R == 0 || N == R) return 1;
	
	if(dp[N][R] > 0) return dp[N][R];
	
	dp[N][R] = solve(N - 1, R - 1) + solve(N-1, R); // nCr = n-1Cr-1 + n-1Cr
	
	return dp[N][R] % MOD;
	}
	
// nCr 값을 반환하는 메서드
	
	
}

// 일단 토큰에 대해 설명하겠습니다.
//
// 토큰이란
//
// 문법적으로 더이상 나눌 수 없는 언어요소 이라고 불립니다. 예를 들어 키워드 , 연산자 , 구두점 이 토큰입니다
//
// 하나 더 예를 들어 보겠습니다
//
// 만약 주민등록번호가 880111-1111111 이 있다고 가정하겠습니다 그럼 여기서 토큰은 무엇이냐
//
// 바로 880111 , 1111111 이 토큰입니다 여기서 - 은 구분자이고 구분자로 나눠진 것들 더이상 나눌 수 없는 것들이 토큰입니다
//
// 마지막으로 하나 더 예제를 들어보면
//
// pm:05:12 이라는 시간적 예제가 있다고 가정해보겠습니다
//
// 그럼 여기서 구분자와 토큰은 무엇일까요?
//
// 바로 구분자는 : 토큰은 pm 05 12 가 되겠죠

// StringTokenizer클래스에 메소드가 존재하는데 많이 쓰이는 메소드를 소개해드리겠습니다.
//
//
// public boolean hasMoreTokens() //반환할 토큰이 남아있는가
//
// public String nextToken() // 다음토큰을 반환
//
// 이메소드들이 많이쓰입니다
//
//
// 그리고 토큰은 반환 받을때는 꼭 hasMoreTokens메소드를 써서 반활할 토큰이 남아있는가를 체크를 하고 
//
// nextToken메소드를 써야합니다.
//
// 반환할 토큰이 남아있어야 다음 토큰을 받는것이 코드의 안정성을 높히는 것이죠.


