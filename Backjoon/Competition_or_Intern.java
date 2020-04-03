package Backjoon;

import java.util.Scanner;

public class Competition_or_Intern {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	Scanner sc = new Scanner(System.in);
	int F = sc.nextInt(); // female
	int M = sc.nextInt(); // male
	int I = sc.nextInt();
	System.out.printf("여성 인원 : %d 남성 인원 : %d 인턴그룹 : %d\n",F,M,I);
	int team = 0;
	int k = I + 3;
	System.out.printf("인턴 그룹 + 3 : %d\n", I+3);	
	
	while(true) {
		if(F+M >= k && F>=2 && M>=1) {
			team++;
			F -= 2;
			M -= 1;
		}else {
			break;
		}
	System.out.printf("여성 인원 : %d 남성 인원 : %d 인턴그룹 : %d\n",F,M,team);
	}
	
	System.out.println(team);
	}
}
	
