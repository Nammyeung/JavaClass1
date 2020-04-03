package java20200318;

public class Var_Memory {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		{
		int a = 10;
		a = 20;
		// int가 메모리를 형성하는 것이므로 int를 중복으로 넣으면 공간을 중복으로 선언하는 것이라 실행이 안됨.
		System.out.println(a);
		}
		int a = 49;
//		{중괄호를 열고 닫으면 x표시가 없어짐. => 흰 메모리의 생성과 소멸과 연관
		System.out.println(a);
		System.out.println("무언가의 코드....");
	}

}
