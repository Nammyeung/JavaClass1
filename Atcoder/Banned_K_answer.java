package Atcoder;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Banned_K_answer {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt(); // �� ���� ��
		int[] ar = new int[N]; // ���� ���� �迭 ���� 
		Map<Integer,Integer> map = new HashMap<>(); // �ؽ��� ����
		for(int i = 0 ; i < N ; i++) {
			ar[i] = sc.nextInt(); // �迭�� ���� �� �Է�, 1
			System.out.println("(1) �迭�� ��� ����? : " + ar[i]); // 1
			map.put(ar[i],map.getOrDefault(ar[i],0)+1); // map.put(1,1)
			// getOrDefault() : ã�� Ű�� �����ϸ� �ش� Ű�� ���� ��ȯ�ϰ�, ������ �⺻���� ��ȯ��
			// freq.put(A[i], freq.getOrDefault(A[i], 0L) + 1);
			System.out.println("(2)" + ar[i]);
			System.out.println("(3)" + map.getOrDefault(ar[i],0)+1);
			System.out.println("(4)" + map.values());
		}
		//******************Map, map.put, 
		long sumAll = 0;
		for(Map.Entry<Integer, Integer> e : map.entrySet()) { // entrySet() : map�� ���ǵ� key���� value���� �� �̾ƿ´�
			long value = (long)e.getValue();
			System.out.println("(5) value�� ���� : " + value);
			sumAll += (value*(value-1))/2; // �� ���� ���� ���� Ȯ���� �� ����
			System.out.println("(6) sumAll�� ����? : " + sumAll);
		}
		// ������ ���� ������ ã�Ƽ� map�� ��� ������ �� �߿��� 2���� ���� ����� ���� ����.
		for(int i = 0 ; i < N ; i++) {
			long sol = 0;
			long v = map.get(ar[i]); // map.get(Ű ��)
			System.out.println("(7) v�� ���� : " + v);
			long t = (v*(v-1))/2;
			System.out.println("(8) t�� ���� : " + t);
			long p = ((v-1)*(v-2))/2; // �ڱ� �ڽ��� �����ϰ� �� ���� ������ ���� ���� ����� ��
			System.out.println("(9) p�� ���� : " + p);
			sol = sumAll - t + p; // ������ ���� �����ؼ� �� ���� ���� ���� Ȯ���� �� - 
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