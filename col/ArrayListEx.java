package col;
//*********************ArrayList*******************************
import java.util.*;

public class ArrayListEx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		StudentData [] arr = new StudentData[100];
		ArrayList<StudentData> list =
				new ArrayList<StudentData>(100); // �ڵ����� �� ���� ũ�⸦ ���� �迭�� �����Ѵ�.
		
		StudentData st1 = new StudentData("����",10,70);
		
		list.add(st1); // StudentData �������� ���������� ���� �� ����.
		list.add(new StudentData("Ʈ��",10,100)); // 5��
		list.add(new StudentData("Ʈ��2",30,800)); // 1��
		list.add(new StudentData("Ʈ��3",20,700)); // 2��
		list.add(new StudentData("Ʈ��4",50,500)); // 3��
		list.add(new StudentData("Ʈ��5",70,300)); // 4��
		list.add(new StudentData("Ʈ��6",50,10)); // 6��
		
		list.add(3,new StudentData("Ʈ��7",20,100)); // API�� ������������ �߸� ����ϰ� �ִ�.
		// ArrayList�� �� �� �ش� ����� �ʿ��ϸ� �߸� ������ ��.
		list.remove(5); // 5��° ������ ����(�ε����� ����� ��)
		
		list.remove(st1); // ������ ����� ��, �� �ڿ��� st1�� �´��� ������ �� üũ.
		
		StudentData t = list.get(3); // �ε����� ���� ���� �ӵ�
		
		for(int i = 0 ; i < list.size() ; i++) { 
//			list.get(i); //list.name;
			StudentData ref = list.get(i);
			System.out.println("�̸� : " + ref.name);
			System.out.println("���� : " + ref.age);
			System.out.println("���� : " + ref.score);
		}
		
		
	}

}
//Comparable<StudentData> set�迭�� �� ���� ������ ��.
//����(Comparable<StudentData>�� �������̽��� ����
class StudentData implements Comparable<StudentData>{
	String name;
	int age;
	int score;
//	Comparable �������̽���?
//		Comparable �������̽��� ��ü���� �񱳸� �����ϰ� ���ִ� �������̽��̴�. 
//		�ش� �������̽��� ����(implements)�� Ŭ������ �ݵ�� compareTo(T o) �޼ҵ带 �����ؾ� �Ѵ�.	
	StudentData(String name, int age, int score){
		this.name = name;
		this.age = age;
		this.score = score;
	}

	@Override
	public int compareTo(StudentData o) {
		// TODO Auto-generated method stub
		if(this.score == o.score) {
			return 0;
		} else if(this.score > o.score) {
			return 1;
		} else {
			return -1;
		}
// ����
		
	}
	// add�� �� �� ȣ��.
}