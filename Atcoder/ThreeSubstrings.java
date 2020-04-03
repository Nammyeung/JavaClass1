package Atcoder;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class ThreeSubstrings {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int P = sc.nextInt();
		char[] S = sc.next().toCharArray();
		int[] digits = new int[N];
		for(int i = 0 ; i < N ; i++) digits[i] = S[i] - '0';
		// string으로 문자열을 받아서 각각의 문자열을 digits에 넣으면서 for문 동작
		
		long res = 0;
		if (P == 2 || P == 5) {
			for (int i = N - 1; i >= 0 ; i--) {
				if(digits[i] % P == 0) res += i + 1;
				
			}
		} else {
			Map<Long, Integer> freq = new HashMap<>();
			long num = 0;
			freq.put(0L,  1);
			for(int i = N - 1 ; i >= 0 ; i--) {
				num += modpow(10, N - i - 1, P) * digits[i] % P;
				num %= P;
				res += freq.getOrDefault(num, 0);
				freq.put(num,  freq.getOrDefault(num, 0) + 1);
			}
		}
		System.out.println(res);
	}
	
	private static long modpow(long a, long n , long mod) {
		long res = 1;
		while(n > 0) {
			if(n % 2 == 1) res = (res * a) % mod;
			a = (a * a) % mod;
			n >>= 1;
		}
		return res % mod;
	}	
}