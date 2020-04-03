package java20200326;

public class P4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		TestThread2 th2 = new TestThread2();
		new Thread(th2).start();
		// 상속받아서 start vs 인터페이스로 th2를 연결해서 thread를 생성해서 start
		
		for(int i = 0 ; i < 100 ; i++) {
			System.out.println(i + "번째 안녕하세요");
		}
		
	}

}
//***************************인터페이스 활용 스레드 생성
class TestThread2 implements Runnable{
	
	// ** 상속 받고 오버라이딩 한 경우
	@Override
	public void run() {
		for(int i = 0 ; i < 100 ; i++) {
			System.out.println(i + "번째 반갑습니다.");
		}
	}
}