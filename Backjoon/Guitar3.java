package Backjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class Guitar3 {
	
	static BufferedReader br = new BufferedReader(new InputStreamReader(System.in)); //�Է°� �ް�
    static final int NUMBER_IN_SET = 6;

    public static void main(String[] args) throws IOException {
        String[] input = br.readLine().split(" "); // " "(����)�� �������� �ΰ��� input���� �޴´�.
        int needGuitarString = Integer.parseInt(input[0]); // �����Ϸ��� ��Ÿ���� ����
        int numberOfBrands = Integer.parseInt(input[1]); // �湮�� �� �ִ� ������ ��

        int[] minPrices = getMinPrices(numberOfBrands); // getMinPrices : �ּҰ����� �����ϴ� �޼ҵ忡 ������ ���� �Ķ���ͷ� �ִ´�.
//      (1) getMinPrices �޼ҵ� ��� (2) solve �޼ҵ� ���
        System.out.println(solve(minPrices, needGuitarString));
    }

    private static int solve(int[] minPrices, int needGuitarString) {
        int minSetPrice = minPrices[0]; // �ּ� 1����(6��) ����
        int minPiecePrice = minPrices[1]; // �ּ� ���� ����

        if (minSetPrice == 0 || minPiecePrice == 0) return 0;

        return min((needGuitarString / NUMBER_IN_SET) * minSetPrice, (needGuitarString - (needGuitarString % NUMBER_IN_SET)) * minPiecePrice)
                + min(minSetPrice, (needGuitarString % NUMBER_IN_SET) * minPiecePrice);
//	  min
//    (needGuitarString / NUMBER_IN_SET = 6) * minSetPrice => (�ʿ��� ��Ÿ���� �� / 1����(6��)) * n������ ��µ� �� ��� 
//    (needGuitarString - (needGuitarString % NUMBER_IN_SET = 6)) * minPiecePrice 
//    => (�ʿ��� ��Ÿ���� �� - (�ʿ��� ��Ÿ���� �� % 1����(6��)) * ������ ���� = n������ �� �� ���� ������ ��  * ������ ���� = ������ ��Ÿ�ٷ� n������ŭ�� ��Ÿ���� ��µ� �����ϴ� ���  
//    + min(minSetPrice, (needGuitarString % NUMBER_IN_SET = 6) * minPiecePrice)
        
//    main point : ���� �� ������ ��ǰ�� �ִµ� ���� ��� ��ǰ�� ã�� �ʿ䰡 ����.
//    �������� �Ǹ��ϴ� ������ �� ���� ���� ������ ���� ���� ��ǰ���� ��Ÿ���� ������ ������
//    ������ ����(6��)���� ���� ��Ÿ���� ���� ���� ������ �Ǹ��ϴ� �������� �����Ѵ�.
    }
    

    private static int[] getMinPrices(int numberOfBrands) throws IOException {
        int minSetPrice = Integer.MAX_VALUE; // int�ȿ� �ִ��� ���� ������ ������ ����
        int minPiecePrice = Integer.MAX_VALUE; // int�ȿ� �ִ��� ���� ������ ������ ����

        for (int i = 0; i < numberOfBrands; i++) {
            String[] priceInfo = br.readLine().split(" "); // " "(����)�� �������� �ΰ��� input���� �޴´�. 
            int setPrice = Integer.parseInt(priceInfo[0]); // ù��° �迭�� 1����(6��) ����
            int piecePrice = Integer.parseInt(priceInfo[1]); // �ι�° �迭�� ���� ����

            if (setPrice < minSetPrice) minSetPrice = setPrice; // �������� ����(numberOfBrands) �߿��� �������� �Ǹ��ϴ� ����(setPrice)�� ���� ���� ������ �Ǹ� ����(minSetPrice)�� ����
            if (piecePrice < minPiecePrice) minPiecePrice = piecePrice; // �������� ����(numberOfBrands) �߿��� ������ �Ǹ��ϴ� ������ ���� ���� ������ �Ǹ� ����(minPiecePrice)�� ����
        }
        System.out.println("������ �� �������� �Ǹ��ϴ� ��ǰ �� ���� ���� ���� : " + minSetPrice);
        System.out.println("������ �� ������ �Ǹ��ϴ� ��ǰ �� ���� ���� ���� : " + minPiecePrice);
        return new int[] {minSetPrice, minPiecePrice};
    }

    private static int min(int a, int b) {
        return a < b ? a : b; // a �� b���� ������ a, a�� b���� ũ�� b => ������ �̾Ƴ��� �޼ҵ�
    }
}

//http://plplim.tistory.com/31

//public class MyClass {
//    public static void main(String args[]) {
//        System.out.println( Integer.MAX_VALUE ); // 2147483647
//    }
//}


