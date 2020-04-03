package java20200318;

public class DataStruc_StackHeap {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int [] arr = new int[5]; // (4) 아무도 주소값을 가지고 있지 않으면 garbage collector에 의해 언젠가 소멸
		// (1) new 연산자는 초기값을 dafault 시킨다.
		arr[0] = 10;
		// (2) 접근 연산자
		arr[3] = 20;
		// (3)	Stack					Heap
		// arr[0xFF33] ------> OxFF33[30][0][0][0][0]
		arr = new int[3];
		arr = null;
		arr[0] = 30; // 컴파일 에러(문법적 오류)는 나지 않음 
		// But, java.lang.NullPointerException
		
		// **** int[] arr = {30, 10, 20};
		// **** arr = {40, 20};
		
		
		
		// **** int[][] arr;
		// **** arr = new int[3][4];
		//					RAM
		// (3)	Stack  접근 1				Heap
		// arr[0xDD11] ------> OxDD11[0xFF11][0xFF12][0xFF13]
		//				0xFF11	|		0xFF12 |	 0xFF13|			(접근 2) if( | == x) => Garbage Collector에 의해 삭제
		//				[0][0][0][0]	[0][0][0][0]	[0][0][0][0]
		
		// Garbage collector는 Stack부터 연결이 끊어진 시점부터 작동
		
		// ***** int [][]arr = new int[3][];
		    // [] => int가 아닌 1중 배열을 담을 수 있는 객체 선언.
		// => 1중 배열, 2중 배열, 3중 배열(3D인 경우에 사용)
	}

}
