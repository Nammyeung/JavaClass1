package Atcoder;

public class LineCodingTest2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
			String answer_sheet = "4132315142";
			String [] sheets = new String[]{"3241523133", "4121314445", "3243523133", "4433325251", "2412313253"};

			int answer = -1;
			int [] count = new int[answer_sheet.length()];
			int max = 0;
	        for(int i = 0 ; i < sheets.length ; i++) {
	        	System.out.println(i + "�� �л� ����");
	            for(int j = 1 ; j < sheets.length ; j++){
	            	System.out.println(i + "�� �л��� " + j + "�� �л��� ��\n");
	                    int negnum = 0;
	                    int negpos = 0;
	                    for(int k = 0 ; k < sheets.length ; k++){
	                    if((sheets[i].charAt(k) == sheets[j].charAt(k)) && (int)(sheets[i].charAt(k) - answer_sheet.charAt(k)) != 0){
	                    	System.out.printf("���������� �ǽɵǸ鼭 ������ Ʋ�� ���� => %d��° ���� %d�� �л� : %s, %d�� �л� : %s\n", k+1, i , sheets[i].charAt(k), j , sheets[j].charAt(k));
	                        for(int t = k+1 ; t < sheets.length ; t++){
	                         if((sheets[i].charAt(t) == sheets[j].charAt(t)) && (int)(sheets[i].charAt(t) - answer_sheet.charAt(t)) != 0){
	                        	 System.out.printf("���������� �ǽɵǸ鼭 ������ Ʋ�� ���� => %d��° ���� %d�� �л� : %s, %d�� �л� : %s\n", t+1 , i , sheets[i].charAt(t), j , sheets[j].charAt(t));
	                        	 negpos++; 
	                        	 System.out.printf("%s�� �л��� %s�� �л��� negpos ���� : %s\n",i, j, negpos);
	                         } else{
	                            break;
	                         }
	                        }
	                        negnum++;
	                        System.out.printf("%s�� �л��� %s�� �л��� negpos ���� : %s\n",i, j, negnum);
	                    }
	                    }
	            count[i] = negnum + (negpos*negpos);
	            System.out.printf("�������� ��ǥ ���� : %s\n",count[i]);
	            if(count[i] >= max) {
	            max = count[i];
	            }
	            System.out.printf("�ִ� �������� ��ǥ ���� : %s\n",max);
	            }
	        }
	        answer = max;
	        System.out.println("�������� ��ǥ�� �ִ밪 : \n" + answer);
		}
	}


