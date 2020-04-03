package java20200324;

public class BoxingAndUnBoxing {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Integer a = 10;
		Integer b = new Integer(10);
		// Integer는 자료구조에 순간적으로 넣는 용도외에는 사용하지 말 것.
		
		int v1 = a;
		int v2 = b; // 언박싱을 한 다음에
		
		if(a == b) {
			System.out.println("같다");
		} else {
			System.out.println("다르다");
		}
	}

}

/*
 * 자바의 자료형은 크게 기본형과 참조형으로 나누어진다. 기본 타입은 byte, char, int, float, double, boolean
 * 등이 있고 참조 타입은 클래스, 인터페이스 등이 해당된다. 그러면 래퍼(Wrapper) 클래스는 무엇이고 사용하는 이유에 대해서 알아보도록
 * 하자.
 * 
 * 래퍼(Wrapper) 클래스 기본 자료형(int, double, boolean 등)의 데이터를 인스턴스(객체)로 만들기 위해 사용(포장)
 * 하는 클래스이다.
 * 
 * 사용 이유 기본 자료형의 값을 굳이 래퍼(wrapper) 클래스로 포장하는 이유는 제네릭, 자료구조, 매개변수 등 기본 자료형이 아닌
 * 레퍼런스 타입을 필요로 하는 경우가 많고 메서드를 갖고 있어 다양하게 활용이 가능하기 때문이다. 
 * 그리고 인스턴스를 생성(heap 메모리에 저장) 하여 상속 및 재사용이 가능하다. 
 * 또한 문자열(String)과 기본 자료형 간 형 변환하여 사용이 가능하다.(이것에 관한 내용은다음 포스팅에 다룰 예정이다. )
 * 
 * 래퍼(Wrapper) 클래스 종류 우리가 사용하는 기본 자료형의 모든 wrapper 클래스를 자바에서 기본적으로 제공하여 주며,
 * java.lang 패키지에 소속되어 있다. 대부분 기본 데이터 타입의 앞 글자를 대문자로 바까주면 된다. 종류는 아래와 같다.
 * 
 * 박싱(boxing), 언박싱(un-boxing) 박싱(boxing)은 기본 자료형의 데이터를 래퍼(wrapper) 클래스의 객체로 만드는
 * 과정을 의미하며, 언박싱(un boxing)은 래퍼(wrapper) 클래스의 데이터를 기본 자료형으로 얻어내는 과정을 말한다. (예 :
 * int → Integer 박싱(boxing) / Integer → int 언박싱(un boxing))
 * 
 * 박싱(boxing) 방법 박싱은 new 연산자를 이용하여 생성하는 방법과 valueOf() 메소드를 이용하는 방법이 있다. 우선 new
 * 연산자를 이용하는 방법부터 알아보자. 
 * wrapper 클래스의 api를 확인해 보면 해당되는 기본 데이터 타입 또는 문자열(String)을 매개변수로 하여 객체(인스턴스) 
 * 생성이 가능하다.
 * 
 * 기본 자료형에는 wrapper 클래스에 해당되는 기본 자료형의 데이터가 와야 된다. [출처] [JAVA/자바] 래퍼(Wrapper)
 * 클래스와 박싱(boxing), 언박싱(un-boxing)|작성자 JOKER
 */