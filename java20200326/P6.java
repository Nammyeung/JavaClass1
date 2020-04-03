package java20200326;

public class P6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new Th1().start();
		new Th2().start();
	}

}
// *******************************동기화 문제가 발생함을 고려

class Data1{
	public static int count = 0; // static이기 때문에 프로그램 내에서 언제 어디든지 접근 가능.

}
class Th1 extends Thread{

	@Override
	public void run() {
		for(int i = 0 ; i < 100 ; i++) {
			Data1.count++;
			System.out.println(Data1.count);
		}
	}
}

class Th2 extends Thread{

	@Override
	public void run() {
		for(int i = 0 ; i < 100 ; i++) {
			Data1.count++;
			System.out.println(Data1.count);
		}
	}

}

// 참조 : 스레드 코드를 어떻게 단위 테스트 해야 합니까?
// https://c10106.tistory.com/3956
// https://12bme.tistory.com/68
// 스레드를 동기화할 때 어려움이 많이 발생할 수 있음.