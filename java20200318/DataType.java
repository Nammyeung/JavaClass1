package java20200318;

public class DataType {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		byte v1 = 10;
		short v2 = 20;
		int v3 = 30;
		long v4 = 50;
		
		v3 = (int)v1; // intŸ�� = byteŸ�� => �ڵ� ����ȯ ��
		v1 = (byte)v3; // byte => int
		
		double v5 = 3.333;
		int v6 = (int)v5; // double -> int (x) => ��������ȯ �ʿ�(�������� �޸��� �ս��� �߻��ϴ� ���)
		
		int v7 = 5;
		double v8 = v7;
		// �ڵ� �� ��ȯ(���� �ִ� �޸� ������ ����� �� ����ȯ ���� ���� �Ǵ� ���) vs ���� �� ��ȯ(�޸𸮰� �� ���� ������ ���� ���� ����ȯ�� �ʿ��� ���)	
				
	}

}
