package com.ja.t2;

//**************************스타크래프트 : 마린, 여러 유닛, 부대지정 등등*************************
public class P1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		Marine m1 = new Marine();
//		Marine m2 = new Marine();
//		Marine m3 = new Marine();
//		
//		SCV s1 = new SCV();
//		SCV s2 = new SCV();
//		SCV s3 = new SCV();
//		
//		Tank t1 = new Tank();
//		Tank t2 = new Tank();
//		Tank t3 = new Tank();
//		Tank t4 = new Tank();
//		**********************유닛을 원하는 갯 수만큼 생성************************
		
//		Unit m1 = new Marine();
//		Unit m2 = new Marine();
//		Unit m3 = new Marine();
//		
//		Unit s1 = new SCV();
//		Unit s2 = new SCV();
//		Unit s3 = new SCV();
//		
//		Unit t1 = new Tank();
//		Unit t2 = new Tank();
//		Unit t3 = new Tank();
//		Unit t4 = new Tank();
//		*****************다형성에 의해서 참조변수를 Unit으로 바꿈********************
		
		Unit [] arr = new Unit[10]; // 참조변수를 담을 배열 생성 
		arr[0] = new Tank();
		arr[1] = new Tank();
		arr[2] = new Tank();
		
		arr[3] = new SCV();
		arr[4] = new SCV();
		arr[5] = new SCV();
		
		arr[6] = new Marine();
		arr[7] = new Marine();
		arr[8] = new Marine();
		arr[9] = new Marine();
		
//		다형성의 의미 : 부모의 객체를 생성하면 자식을 담을 수 있다? => 자료형이 동일할 것이고(혹은 포함될 수 있거나)
		
//		*****************************부대이동********************************
		for(int i = 0 ; i < arr.length ; i++) {
			arr[i].move();
		}
		
//		******************************멈춘다*********************************
		for(int i = 0 ; i < arr.length ; i++) {
			arr[i].stop();
		}
//		다형성이 적용되지 않았기 때문에 부모 메소드 적용.
		
//		*****************************스팀팩 사용********************************
		for(int i = 0 ; i < arr.length ; i++) {
//			(해결책) - 4번째에 Tank가 들어갔는데 Marine으로 형변환을 했기 때문에 문제가 생김.			
			if(arr[i] instanceof Marine) { 
//				참조변수가 참조하고 있는 인스턴스의 실제 타입을 알아보기 위해 instanceof 연산자를 사용합니다. 
//				주로 조건문에 사용되며, instanceof의 왼쪽에는 참조변수를 오른쪽에는 타입(클래스명)이 피연산자로 위치합니다. 
//				그리고 연산의 결과로 boolean값인 true, false 중의 하나를 반환 합니다.
//				출처: https://arabiannight.tistory.com/entry/301 [아라비안나이트]
			
			Marine m = (Marine)arr[i]; // 강제 형변환 가능, 문법적으로는 가능하지만 실행과정에서 문제가 생김.
//			강제 형변환은 가능한데 자동 형변환은 안됨.
//			4번째에 Tank가 들어갔는데 Marine으로 형변환을 했기 때문에 문제가 생김.
			m.useSteamPack();
			
			}			
		}
	}
}

abstract class Unit{ // 부모 => abstract는 클래스(객체 생성) 용도가 아닌 상속 용도로만 쓰임.(추상화 : 진짜 클래스가 아닌 상속을 위한 클래스를 생성한다) => 객체의 기능을 하지 못한다?
	public int hp; // 유닛마다 체력이 다르므로 초기값을 설정하지 않는다.
	public int speed;
	public int ap;
//	*************************************************** Private로 하려면 getter & setter가 있어야 함.
	public abstract void move(); // {} 부분 모두 구현 불가
//  Unit(부모클래스)의 move()메소드는 구현될 필요가 있는걸까? => 아니다(개념적인 선언은 필요할 수 있음) => Abstract 사용
//	오버라이딩을 한다. => 표준을 맞춘다.
// abstract 클래스 안에는 적어도 한 개의 abstract 메소드를 구현해야함.(필수는 아님)
	
	public void stop() {
		System.out.println("유닛이 멈춥니다.");
	}
	
	public void attack() { // 각각 공격 방법이 다르다면 오버라이딩
		System.out.println("유닛이" + ap + "로 공격합니다.");
	}
	
}

class SCV extends Unit{
	public SCV() {	// 생성자
		this.hp = 40;
		this.speed = 3;
		this.ap = 5;
	}
	@Override
	public void move() {
		System.out.println("SCV가 " + speed + "로 움직입니다.");
	}
}

class Marine extends Unit{
	public Marine() {	// 생성자
		this.hp = 50;
		this.speed = 4;
		this.ap = 10;	
	}
	@Override
	public void move() {
		System.out.println("Marine이 " + speed + "로 움직입니다.");
	}
	
	public void useSteamPack() {
		System.out.println("마린이 스팀팩을 사용합니다.");
		hp -= 10;
		ap += 20;
		speed += 3;
	}
}

class Tank extends Unit{
	public Tank() {	// 생성자
		this.hp = 200;
		this.speed = 10;
		this.ap = 20;
	}
	
	@Override
	public void move() {
		System.out.println("Tank가 " + speed + "로 움직입니다.");
	}
}
// class SCV{
//	public int hp = 40; // 체력
//	public int speed = 3; // 이동속도
//	public int ap = 5; // attack point : 공격포인트
//	
////  ****************기능*******************
//	public void move() { // 메소드는 항상 자기가 가진 속성에 따라 작동해야한다 => 이름과 속성을 잘 지어야 한다.
//		System.out.println("SCV가 " + speed + "로 움직입니다.");
//	}
//	
//	
//}
