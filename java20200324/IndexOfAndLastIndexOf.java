package java20200324;

public class IndexOfAndLastIndexOf {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		String str = "�ȳ��ϼ���,�ݰ����ϴ�,�ߺ�Ź�帳�ϴ�.";
		String str = "aaeess.eee.txt"; // ���� ���ε��� ����� ���ϸ�
		// Ȯ���ڸ��� �̾Ƴ��� �ʹ�.
//		int commaIndex = str.indexOf("."); // 9
		int commaIndex = str.lastIndexOf("."); // 9
//		.�̶�� ������ �ε����� ã�ڴ�.
		String ext = str.substring(commaIndex); // 9���� �߶��
		// returnŸ���� ������ ���� ���� �߸����� ����.
		
		System.out.println(ext);
		System.out.println(str);
	}
}

