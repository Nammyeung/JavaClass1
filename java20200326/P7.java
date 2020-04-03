package java20200326;

public class P7 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		new Thread7().start();
//		new Thread7().start();
//		new Thread7().start();
		// new를 했을 때 각각의 this의 v1으로 넘어감
		// 동기화를 걸면 성능이 떨어지고
		// 아니면 메모리의 공유 문제가 발생
		Thread7 th1 = new Thread7();
		th1.setName("1번 쓰레드...");
		// 테스트에 thread이름을 지을 수 있음.
		Thread7 th2 = new Thread7();
		th2.setName("2번 쓰레드...");
		Thread7 th3 = new Thread7();
		th3.setName("3번 쓰레드...");

		th1.start();
		th2.start();
		th3.start();
//		 스레드는 세개인데 실행되는 흐름이 한 개만 실행(메모리를 동시다발적으로 접속)
	}

}

class Thread7 extends Thread{
	
	int v1 = 0;
		
	public void run() {
//		v1++;
		for(int i = 0 ; i < 1000 ; i++) {
//		Data7.v1++; // 같은 메모리를 가지고 돈다.
		// 하나의 코드가 실행되고 있을 때 다른 코드가 접근하는것을
//		차단하고 싶을 때
		Data7.someMethod(this.getName());
//		System.out.println(Data7.v1);
		// 각각에 접근을 해서 동시에 돌리고 있는 상태
		}
	}
}

class SyncObject{
	static Object xxx = new Object(); // Object이고 static이기 때문에 딱 한개만 생성
}



class Data7{
	static int v1;
	// 스레드인 경우에 한해서 synchronized를 걸을 수 있음
	// synchronized걸린 메소드는 이전 것이 실행되기전에 lock이 걸림.
//	public static synchronized void someMethod() { // 메소드를 동기화 시킬 것임
//		Data7.v1++;
//		System.out.println(Data7.v1);
//	}
	public static void someMethod(String name) {
//	public static synchronized void someMethod(String name) { // 메소드를 동기화 시킬 것임
		
		System.out.println("실행 코드들...");
		System.out.println("실행 코드들...");
		// 주소값이 똑같은 경우에만 동기화가 됨
//		synchronized (name) {
		synchronized (SyncObject.xxx) {
		// 이 두개의 코드는 먼저 수행된 누군가가 끝나기 전까지는 대기 상태를 유지한다.
		Data7.v1++;
		System.out.println(name + Data7.v1);
		}
		System.out.println("실행 코드들...");
		System.out.println("실행 코드들...");
	}
}

// Dead lock 상태 