package java20200324;

public class CurrentTimeMillisAndNanoTime {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		long time = System.currentTimeMillis();
		
		System.out.println(time); 
		// 몇년/12 몇분/60 몇초/60으로 1970년 1월 1일부터 몇 초가 흘렀는가
		
		long time2 = System.nanoTime();
		
		System.out.println(time2);
	}

}
