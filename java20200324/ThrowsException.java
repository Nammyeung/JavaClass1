package java20200324;

public class ThrowsException {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
		new Test().method1(); // TestŬ������ method1����
		// try/catch���� ���ִ� ������ ������ �����.
		}catch(Exception e) {
			
		}
		System.out.println("���� ������ �ڵ��...");
	}

}

class Test{
	
	void method1() throws Exception{ 
		// ���α׷��� ���Ḧ �����ʰ� ���α׷��� ȣ���ϴ� ������ exception�� ó���� ������ �ְڴ�.
		// throws Exception�� �߰��ϴ� ���� �޼ҵ忡�� compile������ ��. (Unhandled exception type Exception)
		String str = null; // null str�� ����Ű�� �ּҰ��� ����.
		System.out.println(str.charAt(0)); // NullPointer Exception�߻�
	}
}
