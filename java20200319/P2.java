package java20200319;
//*******************final�� ����(ip)****************************
public class P2 {
	// ������ ������ �ؼ� �ٲ�� �Ѵٸ�?
	final static String ip = "192.0.0.1";// 192.0.0.1 => 192.0.0.2 
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(ip); // �����ϱ� ���� ip�ڵ�
		
		ip = "192.0.0.3"; // ó�� �ڵ带 § ����� �ǵ��� ���� ���� ����� ���� �� �ִ� �ڵ�
		// final�� ��������ν� �̸� ����
		System.out.println(ip);
		
		
		System.out.println(ip);
		
				
		System.out.println(ip);
	}

}
