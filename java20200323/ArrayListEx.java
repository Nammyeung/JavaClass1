package java20200323;

import java.util.*;

public class ArrayListEx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		StudentData [] arr = new StudentData[100];
		ArrayList<StudentData> list =
				new ArrayList<StudentData>(100); // �ڵ����� �� ���� ũ�⸦ ���� �迭�� �����Ѵ�.
		
		StudentData st1 = new StudentData("����",10,70);
		
		list.add(st1); // StudentData �������� ���������� ���� �� ����.
		list.add(new StudentData("Ʈ��",20,100));
		list.add(new StudentData("Ʈ��2",20,100));
		list.add(new StudentData("Ʈ��3",20,100));
		list.add(new StudentData("Ʈ��4",20,100));
		list.add(new StudentData("Ʈ��5",20,100));
		list.add(new StudentData("Ʈ��6",20,100));
		
		list.add(3,new StudentData("Ʈ��7",20,100)); // API�� ������������ �߸� ����ϰ� �ִ�.
		// ArrayList�� �� �� �ش� ����� �ʿ��ϸ� �߸� ������ ��.
		list.remove(5); // 5��° ������ ����(�ε����� ����� ��)
		
		list.remove(st1); // ������ ����� ��, �� �ڿ��� st1�� �´��� ������ �� üũ.
		
		StudentData t = list.get(3); // �ε����� ���� ���� �ӵ�
		
		for(int i = 0 ; i < list.size() ; i++) { 
//			list.get(i); //list.name;
			StudentData ref = list.get(i);
			System.out.println(ref.name);			
		}
		
	}

}

class StudentData{
	String name;
	int age;
	int score;
	
	StudentData(String name, int age, int score){
		this.name = name;
		this.age = age;
		this.score = score;
		
	}
}