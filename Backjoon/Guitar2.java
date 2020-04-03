package Backjoon;

import java.util.Arrays;
import java.util.Scanner;

public class Guitar2 {

	public static void main(String[] args) throws Exception {
		
		Scanner sc = new Scanner(System.in);
				
		int GuitarString = sc.nextInt();
		int NumberOfStore = sc.nextInt();
		int Min = Integer.MAX_VALUE;
		
		int[] unit = new int[NumberOfStore];
		int[] pack = new int[NumberOfStore];
		for(int i = 0 ; i < NumberOfStore ; i++) {
			pack[i] = sc.nextInt();
			unit[i] = sc.nextInt();
		}
		Arrays.sort(unit);
		Arrays.sort(pack);
		
		//°¡Àå ½Ñ 6°³Â¥¸® ÆÑ ±¸¸Å vs °¡Àå ½Ñ ³¹°³ ±¸¸Å vs (°¡Àå ½Ñ 6°³Â¥¸® ÆÑ * ³¹°³)
		Min = Math.min((GuitarString/6)*pack[0], (GuitarString)*unit[0]);
		Min = Math.min(Min, ((GuitarString/6))*pack[0] * (GuitarString%6)*unit[0]);
		
		System.out.println(Min);
	}
}
