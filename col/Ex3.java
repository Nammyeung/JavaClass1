package col;

import java.util.*;

// �������̽� : ���, ������, �������̵�
// �迭 ���� �������̽� ǥ���� �ִ�.
public class Ex3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		ArrayList<String> list = new ArrayList<String>();
//		List<String> list = new ArrayList<String>(); // => ������ ArrayList�� List�� ��� �޾Ҵ�.
		List<String> list = new LinkedList<String>();
//		�������̵���(LinkedList����) �޼ҵ�� ����� �� ����.
//		������ �ϴ��� ���յ��� �ִ��� ���߸� ������ �Ͼ ���ɼ��� �پ��.(���������� �ٽ� : �ּ����� �ڵ带 ���帮�� �ϴ� ��.)
//		���� ���� ����� ������ �ٸ������� ��� ��ü�� ������ �޶�����.
		
		new Test().method1(list);
	}
// �������̽� �ʿ伺 : �������� ����
//	ĸ��ȭ : ������ ����(public, private)

}

class Test{
	
	public void method1(List<String> list) {
		method2(list);
	}
	
	public void method2(List<String> list) {
		
	}
	
}
