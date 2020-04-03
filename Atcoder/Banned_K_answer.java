package Atcoder;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Banned_K_answer {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt(); // 총 공의 수
		int[] ar = new int[N]; // 공을 담을 배열 생성 
		Map<Integer,Integer> map = new HashMap<>(); // 해쉬맵 생성
		for(int i = 0 ; i < N ; i++) {
			ar[i] = sc.nextInt(); // 배열에 담을 값 입력, 1
			System.out.println("(1) 배열에 담길 값은? : " + ar[i]); // 1
			map.put(ar[i],map.getOrDefault(ar[i],0)+1); // map.put(1,1)
			// getOrDefault() : 찾는 키가 존재하면 해당 키의 값을 반환하고, 없으면 기본값을 반환함
			// freq.put(A[i], freq.getOrDefault(A[i], 0L) + 1);
			System.out.println("(2)" + ar[i]);
			System.out.println("(3)" + map.getOrDefault(ar[i],0)+1);
			System.out.println("(4)" + map.values());
		}
		//******************Map, map.put, 
		long sumAll = 0;
		for(Map.Entry<Integer, Integer> e : map.entrySet()) { // entrySet() : map에 정의된 key값과 value값을 다 뽑아온다
			long value = (long)e.getValue();
			System.out.println("(5) value의 값은 : " + value);
			sumAll += (value*(value-1))/2; // 두 개의 공을 뽑을 확률을 다 더함
			System.out.println("(6) sumAll의 값은? : " + sumAll);
		}
		// 동일한 공의 갯수를 찾아서 map에 담고 동일한 공 중에서 2개를 뽑을 경우의 수를 구함.
		for(int i = 0 ; i < N ; i++) {
			long sol = 0;
			long v = map.get(ar[i]); // map.get(키 값)
			System.out.println("(7) v의 값은 : " + v);
			long t = (v*(v-1))/2;
			System.out.println("(8) t의 값은 : " + t);
			long p = ((v-1)*(v-2))/2; // 자기 자신을 제외하고 두 개의 동일한 공을 뽑을 경우의 수
			System.out.println("(9) p의 값은 : " + p);
			sol = sumAll - t + p; // 동일한 공을 선택해서 두 개의 공을 뽑을 확률의 합 - 
			System.out.println(sol);
		}
//      for (int i = 0; i < n; i++) {
//      long sol = 0;
//      for(Map.Entry<Integer,Integer> e : map.entrySet()){
//          long x = e.getValue();
//          if(ar[i] == e.getKey()){
//              sol+=((x-1) * (x-2))/2;
//          }else{
//              sol+=(x*(x-1))/2;
//          }
//      }
//      System.out.println(sol);		
	}
}