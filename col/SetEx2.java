package col;

import java.util.*;

public class SetEx2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		TreeSet<StudentData> set = 
				new TreeSet<StudentData>();
		
		set.add(new StudentData("����1", 1, 5));
		set.add(new StudentData("����2", 2, 4));
		set.add(new StudentData("����3", 3, 6));
		set.add(new StudentData("����4", 4, 3));
		set.add(new StudentData("����5", 5, 2));
		set.add(new StudentData("����6", 6, 1));
				
		for(StudentData data : set) {
			System.out.println(data.name);
		}
		
	}

}

// Set - HashSet
//
// �ڹ� �÷��ǿ��� �����ϴ� Set �������̽��� ������ �������� �ʴ� �������� �����Դϴ�.
// Map ������ �޸� �ߺ��� ������� �ʴ´ٴ� Ư¡�� �ֽ��ϴ�.
// HashSet�� ���������� �ؽ�(Hashing)�� �̿��ؼ� ������ �÷����Դϴ�.
// HashSet�� ��������� �������� �����Ƿ� ��������� �����Ϸ��� LinkedHashSet�� ����ؾ� �մϴ�.
//
// ��ó: https://swalloow.tistory.com/36?category=667489 [MyCloud]



// Set - TreeSet
//
// TreeSet�� ����Ž��Ʈ��(BinarySearchTree)�� ���·� �����͸� �����ϴ� �÷����Դϴ�.
// ����Ž��Ʈ�� �߿����� ������ ����Ų '����-�� Ʈ��(Red-Black Tree)�� �����Ǿ� �ֽ��ϴ�.
// ���� �������� �߰�, �������� �ð��� �ɸ�����, �˻��� ������ �پ�ٴ� ������ �ֽ��ϴ�.
// TreeSet�� ���������� �ߺ��� �������� ������ ������� ������ ���ĵ� ��ġ�� �����ϹǷ� 
// ��������� �������� �ʽ��ϴ�.
//
// http://swalloow.tistory.com/35
//
// ��ó: https://swalloow.tistory.com/36?category=667489 [MyCloud]

