package java20200324;

public class ClassDotForName {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
//			Class.forName("java.lang.String"); // String Ŭ������ �ε��ϰڴ�.
			Class.forName("oracle.jdbc.DBConnector"); 
			// ���� Ŭ������ ���ٰ� exception�� ǥ��
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		// Ŭ������ �̸��� ���� Ŭ����(reflection => �ܺ� ���̺귯���� ����� ��)
		// �ܺ� ���̺귯���� �������� ��Ʈ�� �� ���� ���� ��
	
	
		System.out.println("�ȳ��ϼ���"); // ǥ�� ���̺귯���� java.lang.String�� �����ϱ� ������ exception �߻����� ����.
	
	}

}
