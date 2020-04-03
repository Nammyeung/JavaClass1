package Backjoon;

import java.util.Scanner;

public class Munjayul {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		String a = sc.next();
		String b = sc.next();
		int ans = a.length();
		
		for(int i = 0 ; i <= b.length()-a.length();i++) {
			System.out.println(b.length()-a.length() + "만큼 순환");
			System.out.println(i + "번째 시작");
			// (1) A의 길이는 B의 길이보다 작거나 같으며 (2) A의 길이가 B의 길이와 같아질 때까지 연산을 한다.
			int cnt = 0;
			for(int j = 0 ; j < a.length() ; j++) {
				System.out.println(a.charAt(j));
				System.out.println(b.charAt(i+j));
				if(a.charAt(j) != b.charAt(i+j))
					cnt++; 
			// (1) i=0일 때 a와 b의 각각의 문자열을 비교했을 때 같지 않은 문자열이 있으면 추가가 된다.
			// (2) a의 i 문자열과 b의 문자열 i+j번째 문자열을 차례로 비교한다.
			System.out.printf("문자열 %d번째 값은 : %s\n",j,a.charAt(j));
			System.out.printf("문자열 %d번째 값은 : %s\n",i+j,b.charAt(i+j));
			System.out.println("cnt는 : " + cnt);
			System.out.println("ans는 : " + ans);
			}
			System.out.println("문자열 a는 : " + a);
			System.out.println("문자열 b는 : " + b);
			ans = Math.min(cnt, ans);
		}
		System.out.println(ans);
		}
	}

// Output : A와 B의 길이가 같으면서 , A와 B의 차이를 최소가 되도록 했을 때, 그 차이를 출력하시오.
