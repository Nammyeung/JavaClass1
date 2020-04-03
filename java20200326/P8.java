package java20200326;
// CPU*2 + 1
// 7개의 코어를 만든다?
public class P8 {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
//		int sum = 0;
//		for(int i = 0 ; i < 1000000 ; i++) {
//			sum += i;
////		백만바퀴 돔
//		}
//		
//		System.out.println(sum);
		
		SumThread th1 = new SumThread(1, 250000);
		SumThread th2 = new SumThread(250001, 500000);
		SumThread th3 = new SumThread(500001, 750000);
		SumThread th4 = new SumThread(750001, 1000000);
		// new 생성해서 각각의 메모리에 sum이 계산될 것임.
		
//		th1.start();
//		th2.start();
//		th3.start();
//		th4.start();
//		
//		int total = th1.sum +  th2.sum + th3.sum + th4.sum;
//		System.out.println("1~100만 까지의 합 : " + total);
		// total에서 1~100만까지의 합이 나오는가?
		// 실행시킬 때마다 결과가 다르게 나옴.
		
		// 다 끝난다음에 실행하도록 하는 메소드 : join()
		
		th1.start();
		th2.start();
		th3.start();
		th4.start();
		// thread를 던지고 메인 스레드에서 다른걸로 조인하겠다.
		th1.join();
		th2.join();
		th3.join();
		th4.join();
		
		int total = th1.sum +  th2.sum + th3.sum + th4.sum;
		System.out.println("1~100만 까지의 합 : " + total);
		
		
	}
}
// 특정한 시점부터 같이 합계가 되도록하는
// ****************메모리 구조 설계
class SumThread extends Thread{
	public int sum;
	private int start;
	private int end;
	// i는 start부터 end까지
	public SumThread(int start, int end) {
		this.start = start;
		this.end = end;
	}
		
	@Override
	public void run() {
		
		for(int i = start ; i <= end ; i++) {
			sum += i;
		}
		
	}
}

// 네트워크 프로그램에서 스레드를 사용
// 프로젝트 때 이메일 보내면서 사용.