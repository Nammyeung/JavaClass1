import java.util.Scanner;

public class SimpleStringQueries {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.print("문자열의 길이를 입력하시오 : ");
		int n = sc.nextInt();
		
		StringBuffer strbuffer;
		int count = 0;
//		1번 방법
		while(true) {
					
			System.out.print("문제에 사용할 문자열을 입력하시오 : ");
			strbuffer = new StringBuffer(sc.next());
			if(strbuffer.length() == n) {
				strbuffer.append('0');
				
				break;
			}
		}
		System.out.print("문제의 갯수를 입력하시오 : ");
//		int q = sc.nextInt();
		
		System.out.print("query를 입력하시오 : ");
		String[] a = sc.next().split(",");
					
		if (Integer.parseInt(a[0]) == 1) {
			 strbuffer.insert(Integer.parseInt(a[1]), a[2]);
			 System.out.print("바뀐 문자는 : " + strbuffer);
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
//		2번 방법
//		3번 방법
//		4번 방법
}




