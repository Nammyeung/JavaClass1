package java20200324;

public class ThrowsMyException {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
			new Test2().method1(10);
		}catch(MyException e) {
			e.method1();
		}
	}

}

class Test2{
	
	
	void method1(int value) throws MyException{ // �޼ҵ� �󿡼� throw
		System.out.println("method1..�ڵ��...");
		System.out.println("method1..�ڵ��...");
		if(value < 0) {
		throw new MyException("0���� ���� ���� ���Խ��ϴ�."); // ������ throw�� ��.
		// *********************�ڵ忡�� ���� �߻���Ű�� ���(�ڵ� �󿡼� ���ܸ� throw)
		}
		
		System.out.println("method1..�ڵ��...");
		System.out.println("method1..�ڵ��...");
	}
	
	
	
}

class MyException extends Exception{
	
	public MyException(String message) {
		super(message); // ������ ȣ��(Exception�� �ִ� �����ڸ� ȣ���ϰڴ�)
	}
	
	public void method1() {
		System.out.println("�ȳ��ϼ���");
	}
}