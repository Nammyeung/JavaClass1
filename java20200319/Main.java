package java20200319;

import java.util.*; // �ʼ������� ���� ��.(�ʹ��� �߿��� API�� ����)
// ���踦 �Ϸ��� ������ �־�� �Ѵ�.

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scn = new Scanner(System.in);
		
		
//		System.out.println("���� �Է��ϼ���>");
////		String value = scn.nextLine(); // nextInt() �ʿ����(parseInt�� �����Ƿ�)
//		System.out.println(value + "�� �ԷµǾ����ϴ�.");
		while(true) {
		System.out.println("====�޴�====");
		System.out.println("1.�Է�");
		System.out.println("2.���");
		System.out.println("3.����");
		System.out.println("Q.����");
		System.out.println("�Է�>");
		String value = scn.nextLine(); // nextInt() �ʿ����(parseInt�� �����Ƿ�)
		
		if(value.equals("Q")) {
		// String�� Ŭ���� => �ּҰ��� ���� => ���ڰ��� Ȯ���Ϸ��� => equals	
			break;
			}
		if(value.equals("1")) {
			
		}else if(value.equals("2")) {
			
		}else if(value.equals("3")) {
			
		}else {
			System.out.println("�������� ���� �Է����ּ���.");
		}
		// Command UI
		}
		System.out.println("�̿����ּż� �����մϴ�.");
		
	
	}

}
