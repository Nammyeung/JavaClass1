import java.util.Scanner;

public class SimpleStringQueries {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.print("���ڿ��� ���̸� �Է��Ͻÿ� : ");
		int n = sc.nextInt();
		
		StringBuffer strbuffer;
		int count = 0;
//		1�� ���
		while(true) {
					
			System.out.print("������ ����� ���ڿ��� �Է��Ͻÿ� : ");
			strbuffer = new StringBuffer(sc.next());
			if(strbuffer.length() == n) {
				strbuffer.append('0');
				
				break;
			}
		}
		System.out.print("������ ������ �Է��Ͻÿ� : ");
//		int q = sc.nextInt();
		
		System.out.print("query�� �Է��Ͻÿ� : ");
		String[] a = sc.next().split(",");
					
		if (Integer.parseInt(a[0]) == 1) {
			 strbuffer.insert(Integer.parseInt(a[1]), a[2]);
			 System.out.print("�ٲ� ���ڴ� : " + strbuffer);
			 System.out.println("\n");
			
		}else if (Integer.parseInt(a[0]) == 2) {
			for(int i = strbuffer.length()-1 ; i >= Integer.parseInt(a[1]) ; i-- ) {
				for(int j = strbuffer.length()-1 ; j >= Integer.parseInt(a[1]) ; j--) {
					if(strbuffer.charAt(i-1) != strbuffer.charAt(i) && strbuffer.charAt(i) == strbuffer.charAt(j)) {
							count++;
						
					}
			}
			}
			System.out.println(count);
		}
		
	}
//		2�� ���
//		3�� ���
//		4�� ���
}




