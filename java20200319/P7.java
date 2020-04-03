package java20200319;
//**************************디자인 패턴(NCS6~8)***************************
public class P7 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		StManager m = new StManager();
		System.out.println("접근하는 시점에서 생성됨");
		StManager m = StManager.getInstance();
		m.manage();
		
		StManager m1 = StManager.getInstance(); // 두번째 인스턴스 생성
		StManager m2 = StManager.getInstance();
		StManager m3 = StManager.getInstance();
	
		
	}

}
//*********************싱글톤...디자인 패턴...**************************** 
class StManager{ // 기능에 집약적인 클래스
// Student Managing을 하는 클래스
//	************************옛날 방식*************************
//	private static StManager instance = null; (instance 이미 생성)
//	public static StManager getInstance() {
//		if(instance == null) { (두 번째의 경우 instance가 null이 아니면 if문 그대로 넘어감)
//			instance = new StManager();
//		}
	
//		return instance;
//	}
	
//	private StManager() {
//		
//	}
	
	private static final StManager instance = new StManager(); // 멤버변수
	public static StManager getInstance() {
		
		return instance;
		
	}
	
	
	private StManager() { // Private로 생성자 막음 => 클래스 내부에서 생성하겠다.
//	.......... 1번 호출됨......
	System.out.println("생성자 호출됨....");	
		
	}
	//**************아래.. 데이터 형태..및 메소드...들....********************
	private int count; // private static int count도 가능	
	
	public void manage() { // public static void manage()도 가능
		count++;
		System.out.println(count + "학생 관리를 합니다.");
	}
}


class StData{
	public int score;
	public String name;	
}

//*********************싱글톤...디자인 패턴...**************************** 
// 결론 : 문법을 정확하게 하는데 도움이 되므로 이따금씩 살펴보자.
