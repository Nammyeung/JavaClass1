package java20200323;

import java.util.*;

public class LinkedListEx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		LinkedList<StudentData> list =
				new LinkedList<StudentData>();
		
		StudentData st1 = new StudentData("����",10,100);
		
		list.add(st1);
		list.add(new StudentData("Ʈ��1",20,70));
		list.add(new StudentData("Ʈ��2",30,70));
		list.add(new StudentData("Ʈ��3",40,70));
		list.add(new StudentData("Ʈ��4",50,70));
		list.add(new StudentData("Ʈ��5",60,70));
		list.add(new StudentData("Ʈ��6",70,70));
		// ��� ����, ���̰�, ����, ���̰�, ����, ���̰�
		
		list.add(3, new StudentData("Ʈ��7", 20, 70));
		list.remove(5);
		list.remove(st1);
		
		
		StudentData t = list.get(4); // ���ΰ� �ݺ����� ���ؼ� 5���� ����.
		// *******************�߸��� ����...
//		for(int i = 0 ; i < list.size(); i++) {
//			StudentData ref = list.get(i);
//			System.out.println(ref.name);
//		}
		// ���������� ������ ����? �ƹ��� �̷��� ���� �ʴ´�.(���� ���)
		Iterator<StudentData> iter = list.iterator(); // �ݺ������� ���� ���θ� Ž���ϴ� ��ü�� �����ϰ� ����.
		while(iter.hasNext()) {
			StudentData ref = iter.next();			
			System.out.println(ref.name);
		}
		// ������������ �ٸ��� ������ �ݺ��ϴ� ����� �ٸ��� ������ ������ �´� ����� ����Ѵ�.
	
		for(StudentData data : list) {
			System.out.println(data.name);
		}
	
//		for(int a : st1) {
//			
//		}
		
	}

}

// �������� ������ ����.(����???)