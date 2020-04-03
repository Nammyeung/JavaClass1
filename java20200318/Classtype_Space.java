package java20200318;

public class Classtype_Space {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str1 = "안녕하세요";
		String str2 = new String("안녕하세요");
		
		System.out.println(str1);
		System.out.println(str2);
		
		if(str1 == str2) {
			System.out.println("같다..");
		}
	}

}
