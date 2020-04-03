package java20200323;
//**************************************** 선언을 할 때 데이터 타입을 모르는 경우
public class P1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		SomeData<Integer, String> data = 
				new SomeData<Integer, String>(); // 어떤 메모리를 생성을 할 때 지정을 하겠다.
		
		
		SomeData<System, Math> data1 = // int, char 등의 기본 타입은 들어갈수 없음 => class 타입만.(or 인터페이스)
				new SomeData<System, Math>();
		
		
		
	}

}
// class SomeData<XX>
class SomeData<XX,DD> { // XX의 타입은 존재하지 않지만 정의를 할 수 있다.
	XX score;
	DD name;
	int age;
}

// class SomeData<V,E>{
//	V score;
//	E name;
// int age;
// 라이브러리 혹은 프레임워크를 만들 때 들어가야 하는 데이터의 타입은 지정하지 않고 넘겨줘야..
// Generic 프레임워크 => 자료구조를 위한 문법

/*
 * 제네릭(Generic)
 * 
 * 1.5버전부터 등장해서 사용하는 형식
 * 
 * 범용화 시킨다 (컬렉션 프레임웍 사용)
 * 
 * 호출하는 쪽에서 자료형을 정하겠다는 뜻
 * 
 * 
 * 
 * 제네릭
 * 
 * - 클래스나 메소드에서 사용하는 필드나 매개변수의 자료형을 호출하는 쪽에서 지정하는 기능이다
 * 
 * - 코드 중복의 방지와 프로그램 작성이 유연해진다.
 * 
 * - 컴파일 중에 타입 검증을 강화하여 프로그램의 안정성을 높이거나 불필요한 형변환을 제거하는 목적으로도 사용한다
 * 
 * 타입매개변수

	T : Type의 약자, 자료형이나 클래스형을 의미, 제네릭에서 기본 자료형을 
	타입으로 사용할 수 없어서 여기서 래퍼(Wrapper) 클래스를 의미 

	E : Element의 약자, 컬렉션 프레임워크를 사용할 때 각 객체를 지칭하는 의미 

	K : Key의 약자, 키와 값이라는 쌍으로 이루어진 형태로 키를 의미 

	V : Value의 약자, 키와 값이라는 쌍으로 이루어진 형태로 값을 의미

	N : Number의 약자, 수치 계열의 의미로 사용, 여러 개를 사용할 때 각 타입 매개
	
	변수 위에 2,3,4 등의 숫자를 붙여 사용 
 * 
 */