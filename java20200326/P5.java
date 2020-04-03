package java20200326;
// *******************************************************Java의 스레드 스케쥴링
public class P5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		TestThread5 th5 = new TestThread5();
		th5.start();
		TestThread55 th55 = new TestThread55();
		th55.start();
	}

}

class TestThread5 extends Thread{
	@Override
	public void run() {	
		
		this.setPriority(1); // 1로 준다는 얘기는 우선순위가 가장 낮다.
//		this.setPriority(newPriority);
		
		for(int i = 0 ; i < 100 ; i++) {
			System.out.println("안녕하세요");
		}
	}
}
// thread 클래스를 2개 정의함 => 실행
class TestThread55 extends Thread{
	@Override
	public void run() {
		this.setPriority(10); // TestThread5의 run()보다 최대한 많이 실행시키려고 노력함 => 만능이 아님
		
		for(int i = 0 ; i < 100 ; i++) {
			System.out.println(i + "반갑습니다.");
		}
	}
}