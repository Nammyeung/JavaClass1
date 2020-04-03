package java20200318;

public class Class {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
// ************생성을 함과 동시에 세팅을 하는 경우***************
//		 Car c1 = new Car();
//		 c1.name = "아반떼";
//		 c1.speed = 100;
		
// ************생성자를 만들고 바로 세팅하는 경우***************		
		Car c1 = new Car(100, "아반테");
		//오버로딩을 하지 않고 생성하는 경우.
		c1.speedUp(30);
		c1.run();
		int speed = c1.getCurrentSpeed();
		System.out.println(speed);
	}

}

class SomeObject {
	//********************속성 ... 변수...*********************
	int v1;
	String v2;
	
	
	//***********************생성자....************************
	
	
	
	//***********************메소드....************************

}

class Car{
	//********************속성 ... 변수...*********************
	int speed;
	String name;
	// String studentName; // 클래스 내에 정확한 속성이 들어갈 수 있또록 해야함. (ex - Car 속성에 studentName이 적합한가)
	
	//***********************생성자....************************
	Car(int speed, String name){ // 변수명은 매우 중요하다.
		System.out.println(speed); // (매개변수 우선)
		this.speed = speed;
		this.name = name;
		// 파란색 : 멤버 변수
		// 멤버 변수에 자기 자신의 인스턴트 변수를 사용해야 한다.
	}
	//***********************메소드....************************
	// ***key : 메소드는 명확해야 한다.***
	
		void run() {
			System.out.println("자동차가 달립니다..");
			// 객체들의 행위
			// 없으면 static으로 만들어야
			// 메소드라는 의미에 맞는가?
		}
		
		void speedUp(int value) { // 내부에서 사용하지 않는 변수는 굳이 선언할 필요 x
			System.out.println(value + "만큼 속도가 올라갑니다.");
			this.speed += value;
		}
		
		int getCurrentSpeed() {
			System.out.println("현재 속도입니다.");
			return speed;
		}
		
}

