package java20200324;

public class CurrentTimeMillisAndNanoTime {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		long time = System.currentTimeMillis();
		
		System.out.println(time); 
		// ���/12 ���/60 ����/60���� 1970�� 1�� 1�Ϻ��� �� �ʰ� �귶�°�
		
		long time2 = System.nanoTime();
		
		System.out.println(time2);
	}

}
