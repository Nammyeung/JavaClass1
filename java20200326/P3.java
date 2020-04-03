package java20200326;
//************************************스레드를 생성하는 방법
//(1) 상속을 받아서 thread를 생성하는 방법
public class P3 {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		TestThread th1 = new TestThread();
//		th1.run(); // run을 오버라이딩하지만 run을 직접적으로 호출하지 않음.
		// run이 아닌 start로 실행
		th1.start(); // 결과가 어떻게 나올지 모른다?
		// 반갑습니다(아래 for문)가 먼저 나옴.
		// 반복횟수를 늘리면 상황에 따라 먼저 실행되는 명령문이 달라짐.(따로 실행)
		// =>  싱글코어 기준
		
		//************* run 모두 실행시키고 아래 for문 실행 => 하나의 스레드로 실행시킨 경우
		for(int i = 0 ; i < 100 ; i++) {
			System.out.println(i + "반갑습니다");
			Thread.sleep(100); // try catch문 생략
		}
		//************* 동시에 스레드를 실행시킨 경우
		
		
	}

}
//*******************Thread클래스를 상속받는 방법
class TestThread extends Thread{
	@Override
	public void run() {
		for(int i = 0 ; i < 100 ; i++) {
			System.out.println(i + "안녕하세요");
			try {
				                                                                                                                                                                                                                                                                                                                                                                                                                                   Thread.sleep(300); 
				// 최소 0.3초간 쉰다는 의미 => 타이머 용도로 못씀.(최악의 경우 0.3초 이후인 1분이 걸릴 수도 있기 때문에)
			} catch (Exception e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			} // 0.3초간 쉼.
		}
		
	}
	
	
}

// 여러 개의 코어가 있을 때 물리적으로 thread가 여러 개 돌 수 있음.
