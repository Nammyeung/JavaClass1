package Backjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class Guitar3 {
	
	static BufferedReader br = new BufferedReader(new InputStreamReader(System.in)); //입력값 받고
    static final int NUMBER_IN_SET = 6;

    public static void main(String[] args) throws IOException {
        String[] input = br.readLine().split(" "); // " "(공백)을 구분으로 두개의 input값을 받는다.
        int needGuitarString = Integer.parseInt(input[0]); // 구매하려는 기타줄의 갯수
        int numberOfBrands = Integer.parseInt(input[1]); // 방문할 수 있는 가게의 수

        int[] minPrices = getMinPrices(numberOfBrands); // getMinPrices : 최소값으로 구매하는 메소드에 가게의 수를 파라미터로 넣는다.
//      (1) getMinPrices 메소드 사용 (2) solve 메소드 사용
        System.out.println(solve(minPrices, needGuitarString));
    }

    private static int solve(int[] minPrices, int needGuitarString) {
        int minSetPrice = minPrices[0]; // 최소 1묶음(6개) 가격
        int minPiecePrice = minPrices[1]; // 최소 낱개 가격

        if (minSetPrice == 0 || minPiecePrice == 0) return 0;

        return min((needGuitarString / NUMBER_IN_SET) * minSetPrice, (needGuitarString - (needGuitarString % NUMBER_IN_SET)) * minPiecePrice)
                + min(minSetPrice, (needGuitarString % NUMBER_IN_SET) * minPiecePrice);
//	  min
//    (needGuitarString / NUMBER_IN_SET = 6) * minSetPrice => (필요한 기타줄의 수 / 1묶음(6줄)) * n묶음을 사는데 든 비용 
//    (needGuitarString - (needGuitarString % NUMBER_IN_SET = 6)) * minPiecePrice 
//    => (필요한 기타줄의 수 - (필요한 기타줄의 수 % 1묶음(6줄)) * 낱개의 가격 = n묶음을 할 수 없는 낱개를 뺀  * 낱개의 가격 = 낱개의 기타줄로 n묶음만큼의 기타줄을 사는데 상응하는 비용  
//    + min(minSetPrice, (needGuitarString % NUMBER_IN_SET = 6) * minPiecePrice)
        
//    main point : 가장 싼 묶음의 상품이 있는데 굳이 비싼 상품을 찾을 필요가 없다.
//    묶음으로 판매하는 상점들 중 가장 낮은 가격을 가진 묶음 상품으로 기타줄을 구매한 다음에
//    묶음의 갯수(6개)보다 작은 기타줄을 가장 낮은 낱개를 판매하는 상점에서 구매한다.
    }
    

    private static int[] getMinPrices(int numberOfBrands) throws IOException {
        int minSetPrice = Integer.MAX_VALUE; // int안에 최대의 숫자 공간이 들어가도록 넓힘
        int minPiecePrice = Integer.MAX_VALUE; // int안에 최대의 숫자 공간이 들어가도록 넓힘

        for (int i = 0; i < numberOfBrands; i++) {
            String[] priceInfo = br.readLine().split(" "); // " "(공백)을 구분으로 두개의 input값을 받는다. 
            int setPrice = Integer.parseInt(priceInfo[0]); // 첫번째 배열이 1묶음(6개) 가격
            int piecePrice = Integer.parseInt(priceInfo[1]); // 두번째 배열이 낱개 가격

            if (setPrice < minSetPrice) minSetPrice = setPrice; // 여러개의 상점(numberOfBrands) 중에서 묶음으로 판매하는 가격(setPrice)이 가장 낮은 상점의 판매 가격(minSetPrice)을 구매
            if (piecePrice < minPiecePrice) minPiecePrice = piecePrice; // 여러개의 상점(numberOfBrands) 중에서 낱개로 판매하는 가격이 가장 낮은 상점의 판매 가격(minPiecePrice)을 구매
        }
        System.out.println("상점들 중 묶음으로 판매하는 상품 중 가장 낮은 가격 : " + minSetPrice);
        System.out.println("상점들 중 낱개로 판매하는 상품 중 가장 낮은 가격 : " + minPiecePrice);
        return new int[] {minSetPrice, minPiecePrice};
    }

    private static int min(int a, int b) {
        return a < b ? a : b; // a 가 b보다 작으면 a, a가 b보다 크면 b => 작은값 뽑아내는 메소드
    }
}

//http://plplim.tistory.com/31

//public class MyClass {
//    public static void main(String args[]) {
//        System.out.println( Integer.MAX_VALUE ); // 2147483647
//    }
//}


