package java20200318;

public class Classtype_Space {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str1 = "�ȳ��ϼ���";
		String str2 = new String("�ȳ��ϼ���");
		
		System.out.println(str1);
		System.out.println(str2);
		
		if(str1 == str2) {
			System.out.println("����..");
		}
	}

}
