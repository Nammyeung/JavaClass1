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
                // Math.max = 두 인자 중 큰 값 리턴
                max = Math.max(max, antMax);
                // Math.max = 두 인자 중 큰 값 리턴
            }	
            System.out.println(min + " " + max);
        	}
        
        	String str = "this is my string"; 
        	System.out.println(st.countTokens()); // 4 
        	while(st.hasMoreTokens()) { // 리턴할 다음 토큰이 있으면 true를, 다음 토큰이 없으면 false를 리턴한다.
        		System.out.println(st.nextToken()); // this, is, my, string
        		} 
        	System.out.println(st.countTokens()); // 0 
        

        	// 출처: https://arer.tistory.com/48 [J. deo의 그알정보]
    }
}