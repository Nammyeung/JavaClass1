package java20200324;

public class HashCode {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		BBB b = new BBB();
		// ������ ����ȴ�.
		int value = b.hashCode();
		System.out.println(value); 
		// ��ü�� �ؽ��ڵ� ��.(�޸��� �ּҰ��� �������� �ؽ�)
		System.out.println(b); // 16����
		
		String str = "�ȳ��ϼ���";
		System.out.println(str.hashCode());
		// �޸��� �ּҰ��� �ؽ��ڵ��ϱ�
		String str2 = new String("�ȳ��ϼ���");
//		�ؽ��ڵ带 ����ϴ� toString�� �������̵� �Ǿ� �ְ� �̸� �ڸ��� �����ؼ� ~~~
//		.equals�� ���������� �ȳ��ϼ��並 ���ϴ°�?
//		=> ���������� ���ڿ� �ؽ��ڵ�� �ٷ� ���� ���̴�.
//		�޸� �ؽ��ڵ� != ���ڿ� �ؽ��ڵ�
//		
		System.out.println(str2.hashCode());
	}

}

class BBB{
	
}
// ��� Ŭ������ Object�� ��ӹ޾Ұ�
// Object���� api�� �ϳ��� HashCode()�� ȣ�� ����.