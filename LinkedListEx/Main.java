package LinkedListEx;
//****************LinkedList
// ��� ������ ���� �ڷᱸ���� ����, � �ڷᱸ�� �˰����� ������ �� �����ؾ� �Ѵ�.
public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		int [] arr = new int[100];
//		arr[0] = 70;
//		arr[1] = 70;
//		arr[2] = 70;
//		*****************�迭�� ������ ������ �̸� ������ �� �ִ� LinkedList�� ����ڴ�.
//	�迭�� ����
//	1. �迭�� ũ�⸦ ������ �� �ۿ� ���� ��� - �����ս��� ����(���� ����) 
//		(�л����� ���α׷��� ��� new int[100]�� �����ߴµ� 101��° �����͸� �־�� �ϴ� ���) 
//	2. �޸� ������ ���� (new int[5000];)
//	3. ���� ���� ����
//	4. ���� ���� ����
	
	MyLinkedList<Integer> list = 
			new MyLinkedList<Integer>();
//	MyLinkedList<String> list =
//			new MyLinkedList<String>();
	// <>�ȿ��� ����Ÿ�Ը� ���� �� ����, int ���� �ȵ�.
//	<Integer>,><Double>
	list.add(10);
	list.add(20);
	list.add(30);
	// list.add(3, 500)����
	list.add(40);
	list.add(50);
	list.add(60);
	list.add(70);
	list.add(80);
	list.add(90);
	list.add(100);
	
	list.add(3, 500);
	
	list.remove(5);
	
	
	for(int i = 0 ; i < 10 ; i++) {
		int value = list.get(i);
		System.out.println(value);
	}
	
	MyLinkedList stList = new MyLinkedList();
//	MyLinkedList<STData> stList = 
//			new MyLinkedList<STData>();
	
	stList.add(new STData());
	
	}
}

//class Node{
//	int value;
//	Node next; // ����, �ڱ� �ڽ��� ���� �� �ִ� �����ּҸ� ����
////	���ڸ� �ִ� ���� �ƴ϶� ���ڳ� �����͸� �־�� �ϴ� ����????
//}
class STData{
	int v1;
	String v2;
	String v3;
}

class Node<T>{
	T value; // � �����͵��� ���� �� �ֵ���
	Node next;
}

class MyLinkedList<T> {
	
	Node<T> first = null;
//	first�������� ����
	// int������ Ư�� value�� ����Դ�
	void add(T value) {
//	�迭�� �ƴ� �˰��������� ����
		Node<T> newNode = new Node<T>();
		newNode.value = value;
		
		if(first == null) { // first�� null�̸�
			first = newNode;
//			�ּҰ��� �־��ְڴ�.
			return;
		}
		
		Node<T> temp = first;
		
		while(true) {
			
			if(temp.next == null) {
				temp.next = newNode;
				break;
			}
			
			temp = temp.next;
			
		}
	}
	void remove(int index) {
//		idea : 3��°�� ����ڴ� => 2��°�� 3��°�� ����Ű�� �ִ� ���� 4��°�� �ű��.
		if(index == 0) {
			first = first.next;
			return;
		}
		
		Node<T> temp = first;
		
		for(int i = 0 ; i < index-1 ; i++) {
			temp = temp.next;
			
		}
		// 2��°
		temp.next = temp.next.next;
		//2��°�� 2��°(temp)�� ���� ����(4��°)�� ���� �ְڴ�.
		
		
		
	}
	
	void add(int index, T value) { // insert
		Node<T> newNode = new Node<T>(); // �߰��� ��带 ����
		newNode.value = value;
		
		Node<T> temp = first;
		for(int i = 0 ; i < index-1 ; i++) {
			temp = temp.next;
		}
		
		newNode.next = temp.next; // �� - 3��°�� ���� 3��°�� �ִ´�(3��° - �����Ϸ��� ��ġ)
		temp.next = newNode;
	}
	
	T get(int index) { // return���� int��� ��
		
		Node<T> temp = first;
		for(int i = 0 ; i < index ; i++) {
			temp = temp.next; // temp = first;
		}
		
		return temp.value;
		
		
		
	}
}

// ��������, Garbage Collector, Heap �޸𸮿� ���� ���ذ� �ʿ�.