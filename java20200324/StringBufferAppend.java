package java20200324;

public class StringBufferAppend {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*String str = "�ȳ��ϼ���";
		
		for(int i = 0 ; i < 5 ; i++) {
			str += i; // ���ڿ� ���� => ���ڿ� = ���ڿ� + ����
		}
		
		System.out.println(str);
	
*/
		
//		StringBuffer str = new StringBuffer("�ȳ��ϼ���");
		StringBuffer str = new StringBuffer(100);
		str.append("�ȳ��ϼ���");
		
		// �ȳ��ϼ��並 ���� �迭�� ����.
		// ����ӵ��� ������ ����
		for(int i = 0 ; i < 5 ; i++) {
			str.append(i);
		}
		// Buffer��� ǥ���� �ϸ� �Ҵ�� �޸��� �ӽð����� ����.
		
		System.out.println(str);
	}
}
