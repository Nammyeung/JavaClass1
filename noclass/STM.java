package noclass;

import java.util.*;

public class STM {

	public static void main(String[] args) {
		//*************���α׷��� ���������� ������ �����ֱ� ���� ��ġ�� �ֻ�ܿ� ��ġ
		STData [] stList = new STData[100];
		int stCount = 0;
		
		
		// TODO Auto-generated method stub
		Scanner scn = new Scanner(System.in);
		// ������ ������ �����ǰ� �Ҹ�ǰ� �ݺ�.
//		System.out.println("aaaa");
				
		System.out.println("***�л��������α׷��� ���Ű� ȯ���մϴ�***");
				
		while(true) {
		System.out.println("===�޴�===");
		System.out.println("1.�л� ���� �Է�");
		System.out.println("2.�л� ����Ʈ ���");
		System.out.println("3.�л� ���� �˻�");
		System.out.println("4.�л� ���� ����");
		System.out.println("5.�л� ���� ����");
		System.out.print("�Է� q=����>"); // println���� �Է��� �޾ұ� ������ inputValue�� ������ ��������.
		String inputValue = scn.nextLine();
		
//		String aa = "�ȳ��ϼ���";
//		"��������".charAt(9); // "oooo" : ���������� ���� ���� �ּҰ��̴�.
		
//		if(inputValue=="q") { // inputValue =='q' => �޸��ּҰ� �� == 'q'(x)
		if(inputValue.equals("q")) {
				break;
		}
		if(inputValue.equals("1")) {
			//�л� ���� �Է� �ڵ�...
			System.out.println("======�л� ���� �Է� ����======");
			System.out.println("�л� �̸��� �Է��� �ּ���");
			System.out.print("�Է�>");
			String name = scn.nextLine();
			
			System.out.println("���̸� �Է��� �ּ���");
			System.out.print("�Է�>");
			String temp = scn.nextLine();
			int age = Integer.parseInt(temp); // Integer Ŭ������ parseInt �޼ҵ�(API ���)
			
			System.out.println("������ �Է��� �ּ���");
			System.out.print("�Է�>");
			int score = Integer.parseInt(scn.nextLine()); // parseInt(String type��);
			// ������ �޸� ������ ȿ���� �ִ�.
//			String temp = scn.nextLine();
//			int age = Integer.parseInt(temp);
			
			STData stData = new STData(name,age,score); // heap �޸� ����
			
			stList[stCount] = stData; // 3���� �Ű������� �޾Ƽ� �Ѳ����� �迭�� ���� ����?
			stCount++;
			
			System.out.println("======�л� ���� �Է� ��======");
			System.out.print("��� �Ͻ÷��� Enter�� �Է����ּ���.");
			scn.nextLine();
			
		} else if(inputValue.equals("2")) {
			//�л� ����Ʈ ���....
			System.out.println("======�л� ����Ʈ ����======");
			
			for(int i = 0 ; i < stCount ; i++) {
				System.out.println(stList[i].name);
			}
			
			System.out.println("======�л� ����Ʈ ��======");
			System.out.print("��� ... Enter...");
			scn.nextLine();
			
		} else if(inputValue.equals("3")) {			
			//�˻�...
			System.out.println("======�˻� ����======");
			
			System.out.println("�˻��� �л��� �̸��� �Է����ּ���");
			System.out.print("�Է�");
			String searchingName = scn.nextLine();
			
			int searchingCount = 0;			
			
			for(int i = 0 ; i < stCount ; i++) {
				
				if(stList[i].name.contains(searchingName)) {
					String print = ""; // ������ + ����
					print += "�̸� : "; // ���� ������ ������
					print += stList[i].name;
					print += ", ���� : ";
					print += stList[i].age;
					print += ", ���� : ";
					print += stList[i].score;
					
					System.out.println(print);
					
					searchingCount++;
				}
				
			}
			
			System.out.println(searchingCount + "���� �˻��Ǿ����ϴ�.");
			
			System.out.println("======�˻� ��======");
			System.out.println("��� ....Enter....");
			scn.nextLine();
			
		} else if(inputValue.equals("4")) {
			//����...
			System.out.println("======�л� ���� ����======");
			System.out.println("���� �� �л��� �̸��� �Է��� �ּ���");
			System.out.print("�Է�>");
			String deletingName = scn.nextLine();
			int count = 0;
			for(int i = 0 ; i < stCount ; i++) {
				if(stList[i].name.equals(deletingName)) {
									
					for(int x = i ; x < stCount ; i++) { // i��° ���� ����� �� ���� ���� �о�־�� ��.
						stList[x] = stList[x+1]; 
						// ������ ��ġ�� �迭 �κ� outofbound exception�� ����µ� collection framework�� ���߿� �ذ� ����
//						0    1   <-  2    3 4 5
//						[][Ʈ���̼�][Ʈ���̼�][][][]
//						   delete
						System.out.println(stList[i]);
					i--; // ������ �ش� �ν��Ͻ��� ���� �ٽ� Ȯ���ϰ� �ϴ� ������, ���߿� ���� �����غ���(��)
					System.out.println(i);
				//------------------------------------------����� ����
					stCount--;
					count++;
					System.out.println(stCount);
			    //------------------------------------------������Ű�� ����
					}
				}
			
			}			
			// �迭 [][null][][][][][][][][][][]
			//			|
			//		---------
			//		|		 |
			//		----------
			// delete�� �ϸ� null�� ����� ��ü �迭�� ȣ���� �� nullpointexception�� �߻��� �� ����.
			// �߰��� �����ִ� ��(x - ����), �ڿ����� �ٽ� ����
			System.out.println(count + "���� �����Ǿ����ϴ�.");
			
			
			System.out.println("======�л� ���� ��======");
			System.out.println("���...Enter...");
			scn.nextLine();
		} else if(inputValue.equals("5")) {
			//���� ����...
			
		} else {
			//���� ��Ȳ.
			System.out.println("�߸� �Է��ϼ̽��ϴ�.");
		}
		
	}
		
	System.out.println("�̿��� �ּż� �����մϴ�.");
		
}

}

class STData{
	public String name;
	public int age;
	public int score;
	
	public STData(String name, int age, int score) {
		this.name = name;
		this.age = age;
		this.score = score;
	}
}

/*
 * Ram �����ȣ�� ���� �۵�, �����찡 ����Ǹ� �޸𸮸� ȸ���ذ� => 
 * ���������� ����Ǵ� ���� �ƴ�.
 */