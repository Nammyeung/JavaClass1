package java20200318;

public class DataStruc_StackHeap {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int [] arr = new int[5]; // (4) �ƹ��� �ּҰ��� ������ ���� ������ garbage collector�� ���� ������ �Ҹ�
		// (1) new �����ڴ� �ʱⰪ�� dafault ��Ų��.
		arr[0] = 10;
		// (2) ���� ������
		arr[3] = 20;
		// (3)	Stack					Heap
		// arr[0xFF33] ------> OxFF33[30][0][0][0][0]
		arr = new int[3];
		arr = null;
		arr[0] = 30; // ������ ����(������ ����)�� ���� ���� 
		// But, java.lang.NullPointerException
		
		// **** int[] arr = {30, 10, 20};
		// **** arr = {40, 20};
		
		
		
		// **** int[][] arr;
		// **** arr = new int[3][4];
		//					RAM
		// (3)	Stack  ���� 1				Heap
		// arr[0xDD11] ------> OxDD11[0xFF11][0xFF12][0xFF13]
		//				0xFF11	|		0xFF12 |	 0xFF13|			(���� 2) if( | == x) => Garbage Collector�� ���� ����
		//				[0][0][0][0]	[0][0][0][0]	[0][0][0][0]
		
		// Garbage collector�� Stack���� ������ ������ �������� �۵�
		
		// ***** int [][]arr = new int[3][];
		    // [] => int�� �ƴ� 1�� �迭�� ���� �� �ִ� ��ü ����.
		// => 1�� �迭, 2�� �迭, 3�� �迭(3D�� ��쿡 ���)
	}

}
