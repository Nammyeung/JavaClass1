package Atcoder;

public class LineCodingTest2_prac {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
			String answer_sheet = "4132315142";
			String [] sheets = new String[]{"3241523133", "4121314445", "3243523133", "4433325251", "2412313253"};
			char[] sheet = new char[answer_sheet.length()];
			int answer = -1;
			int negnum = 0;
			int negpos = 0;
			int nummax = 0;
			int posmax = 0;
			int count [] = new int[answer_sheet.length()];
			
			System.out.print("******* ���� ���� *******");
			System.out.print("\n");
			for(int i = 0 ; i < answer_sheet.length() ; i++) {
				System.out.print(answer_sheet.charAt(i) + "\t");
			}
			System.out.println("\n");
			for(int k = 0 ; k < sheets.length ; k++) {
				for(int j = 0 ; j < sheets[0].length() ; j++) {
				System.out.print(sheets[k].charAt(j) + "\t");
				}
				System.out.println("\n");		
			}
			
			for(int b = 0 ; b < sheets.length ; b++) {
				for(int c = b+1 ; c < sheets.length ; c++) {
					for(int k = 0 ; k < answer_sheet.length(); k++) {
						if(sheets[b].charAt(k) == sheets[c].charAt(k) && (int)(sheets[b].charAt(k) - answer_sheet.charAt(k)) != 0){
							System.out.printf("%s��° ���� ���� : %s \t %s�� �л� ���� : %s \t %s�� �л� ���� : %s\n",k+1 , 
									answer_sheet.charAt(k), b, sheets[b].charAt(k), c, sheets[c].charAt(k));
							System.out.printf("%s�� �л��� %s�� �л��� %s�� ������ ���� �������� �ǽ� ����\n",b,c,k);
							negnum++;
						}
						
						
					}
					System.out.printf("%s�� �л��� %s�� �л��� �������� ���� : %s\n",b,c,negnum);
					if(negnum >= nummax) {
						nummax = negnum;
					}
					negnum = 0;
				}
				System.out.printf("�������� ���� �ִ밪 : %s\n",nummax);
			}
			
			for(int b = 0 ; b < sheets.length ; b++) {
				for(int c = b+1 ; c < sheets.length ; c++) {
					for(int k = 0 ; k < answer_sheet.length(); k++) {
						if(sheets[b].charAt(k) == sheets[c].charAt(k) && (int)(sheets[b].charAt(k) - answer_sheet.charAt(k)) != 0){
							if(sheets[b].charAt(k+1) == sheets[c].charAt(k+1) && (int)(sheets[b].charAt(k+1) - answer_sheet.charAt(k+1)) != 0) {
								negpos++;
							}
						}
					}
					if(negnum >= nummax) {
						nummax = negnum;
					}
					negpos = 0;
				}
			}
			
		
			
			
}
}

