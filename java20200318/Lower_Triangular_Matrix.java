package java20200318;

public class Lower_Triangular_Matrix {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int [][] arr = new int[5][5];
		
		//......풀이.....
		
		for(int i = 0 ; i < arr.length ; i++) {
			for(int j = 0 ; j < i+1 ; j++) {
				arr[i][j] = (int)(Math.random()*10);
			}
		}
		
		//결과 출력...
		for(int i = 0 ; i < arr.length ; i++) {
			for(int x = 0 ; x < arr[i].length ; x++) {
				System.out.print("[" + arr[i][x] + "]");
		}
		System.out.println();
		}
	}
}
	