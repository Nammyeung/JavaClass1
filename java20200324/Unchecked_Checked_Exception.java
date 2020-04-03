package java20200324;

import java.io.*; // io : INPUT/OUTPUT
import java.io.File;
import java.io.FileOutputStream;

public class Unchecked_Checked_Exception {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a = 10;
		int b = 0; //  java.lang.ArithmeticException: / by zero
		int result = a/b;
		
		System.out.println(result);
		
		
		File file = new File("C:\\aaa.txt"); //aaa.txt�� �� �� �ְ� ��.
//		FileOutputStream fos = new FileOutputStream(file); // try,catch���� �ۼ��� ���� ����.
	}

}

// Unchecked Exception (�� - 0���� ������ arithmetic exception)
// ������� ���� ó���� �������� �ʴ� Ư¡�� �ֱ� ������ Unchecked Exception�̶� �ϸ�, 
// catch�� ��ų� throw�� ȣ���� �޼���� ���ܸ� ������ �ʾƵ� ����� �����ϴ�.
//
// Checked Exception
// �ݵ�� ��������� ó���ؾ� �ϱ� ������ Checked Exception�̶�� �ϸ�, 
// try catch�� �ؼ� ������ ��� throws�� ���ؼ� ȣ���� �޼���� ���ܸ� ������ �մϴ�.

//				        |		Checked Exception    |	Unchecked Exception
//ó�� ����			    |		�ݵ�� ���� ó�� �ؾ���         |	���� ó�� ���� �ʾƵ���
//Ʈ����� Rollback ����       |			Rollback �ȵ�	     |		Rollback ����
//��ǥ Exception	        |IOException, SQLException   |	NullPointerException, IllegalArgumentException


//���� https://dololak.tistory.com/53