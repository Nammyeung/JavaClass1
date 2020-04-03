package LinkedListEx;
//****************LinkedList
// 모든 장점을 가진 자료구조는 없다, 어떤 자료구조 알고리즘이 맞을지 잘 선택해야 한다.
public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		int [] arr = new int[100];
//		arr[0] = 70;
//		arr[1] = 70;
//		arr[2] = 70;
//		*****************배열에 단점이 많으니 이를 보완할 수 있는 LinkedList를 만들겠다.
//	배열의 단점
//	1. 배열의 크기를 지정할 수 밖에 없는 경우 - 퍼포먼스에 문제(공간 부족) 
//		(학생관리 프로그램의 경우 new int[100]를 선언했는데 101번째 데이터를 넣어야 하는 경우) 
//	2. 메모리 공간의 낭비 (new int[5000];)
//	3. 값의 삽입 문제
//	4. 값의 삭제 문제
	
	MyLinkedList<Integer> list = 
			new MyLinkedList<Integer>();
//	MyLinkedList<String> list =
//			new MyLinkedList<String>();
	// <>안에는 참조타입만 넣을 수 있음, int 등은 안됨.
//	<Integer>,><Double>
	list.add(10);
	list.add(20);
	list.add(30);
	// list.add(3, 500)삽입
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
//	Node next; // 선언, 자기 자신을 받을 수 있는 참조주소를 만듬
////	숫자만 넣는 것이 아니라 문자나 데이터를 넣어야 하는 경우는????
//}
class STData{
	int v1;
	String v2;
	String v3;
}

class Node<T>{
	T value; // 어떤 데이터든지 넣을 수 있도록
	Node next;
}

class MyLinkedList<T> {
	
	Node<T> first = null;
//	first기준으로 연결
	// int형으로 특정 value가 날라왔다
	void add(T value) {
//	배열이 아닌 알고리즘적으로 저장
		Node<T> newNode = new Node<T>();
		newNode.value = value;
		
		if(first == null) { // first가 null이면
			first = newNode;
//			주소값을 넣어주겠다.
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
//		idea : 3번째를 지우겠다 => 2번째가 3번째를 가리키고 있는 것을 4번째로 옮긴다.
		if(index == 0) {
			first = first.next;
			return;
		}
		
		Node<T> temp = first;
		
		for(int i = 0 ; i < index-1 ; i++) {
			temp = temp.next;
			
		}
		// 2번째
		temp.next = temp.next.next;
		//2번째에 2번째(temp)의 다음 다음(4번째)의 값을 넣겠다.
		
		
		
	}
	
	void add(int index, T value) { // insert
		Node<T> newNode = new Node<T>(); // 추가할 노드를 생성
		newNode.value = value;
		
		Node<T> temp = first;
		for(int i = 0 ; i < index-1 ; i++) {
			temp = temp.next;
		}
		
		newNode.next = temp.next; // 예 - 3번째의 값을 3번째에 넣는다(3번째 - 삽입하려는 위치)
		temp.next = newNode;
	}
	
	T get(int index) { // return값을 int라고 함
		
		Node<T> temp = first;
		for(int i = 0 ; i < index ; i++) {
			temp = temp.next; // temp = first;
		}
		
		return temp.value;
		
		
		
	}
}

// 참조변수, Garbage Collector, Heap 메모리에 대한 이해가 필요.