package Backjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;
 
public class ant {
 
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        System.out.println(st);
        int testCnt = Integer.parseInt(st.nextToken());
        System.out.println(testCnt);
        for(int i=0; i < testCnt; i++) {
            st = new StringTokenizer(br.readLine());
            System.out.println(st);
            int length = Integer.parseInt(st.nextToken());
            System.out.println(st);
            int antCnt = Integer.parseInt(st.nextToken());
            System.out.println(st);
            int ants[] = new int[antCnt];
            for(int j=0 ; j < ants.length ; j++)
            	System.out.print(ants[j]);
            
            int min = Integer.MIN_VALUE;
            System.out.println(min);
            int max = Integer.MIN_VALUE;
            System.out.println(max);
            
            for(int j=0; j < antCnt; j++) {
                st = new StringTokenizer(br.readLine());
                int ant = Integer.parseInt(st.nextToken());
                
                int antMin = Math.min(ant, length-ant);
                System.out.println(antMin);
                int antMax = Math.max(ant, length-ant);
                System.out.println(antMax);
                
                min = Math.max(min, antMin);
                // Math.max = �� ���� �� ū �� ����
                max = Math.max(max, antMax);
                // Math.max = �� ���� �� ū �� ����
            }	
            System.out.println(min + " " + max);
        	}
        
        	String str = "this is my string"; 
        	System.out.println(st.countTokens()); // 4 
        	while(st.hasMoreTokens()) { // ������ ���� ��ū�� ������ true��, ���� ��ū�� ������ false�� �����Ѵ�.
        		System.out.println(st.nextToken()); // this, is, my, string
        		} 
        	System.out.println(st.countTokens()); // 0 
        

        	// ��ó: https://arer.tistory.com/48 [J. deo�� �׾�����]
    }
}