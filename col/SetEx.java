package col;
import java.util.*;
public class SetEx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		TreeSet<Integer> set = new TreeSet<Integer>();
		
		set.add(5);
		set.add(3);
		set.add(7);
		set.add(6);
		set.add(5);
		set.add(9);
		set.add(1);
		// 더 효율적.
		
		System.out.println(set.headSet(3)); // 지정된 객체보다 작은 값의 객체들을 반환
		System.out.println(set.subSet(3,6)); // 범위검색의 결과를 반환합니다.
		System.out.println(set.tailSet(2)); // 지정된 객체보다 큰 값의 객체들을 반환
//		TreeSet은 문자열 검색, 자동완성 등과 같은 곳에서 활용할 수 있습니다.
//		이진탐색트리의 경우 데이터 정렬이 가능(Comparator)
		for(Integer data : set) {
			System.out.println(data);
		}
		set.contains(1);
		
	}

}

/*	트리의 표현
 * 
 * 트리를 표현하는 방법
 * 1. 배열 표현법 : 각 노드에 인덱스를 부여하여 배열에 저장하는 방법 
 * 2. 링크 표현법 : 다음 노드를 가리키는 포인터 변수를 이용하여 부모노드가 자식노드를 가리키는 방법
 * 
 * 			[1]
 * 		[2]		[3]
 * 	  [4] [5] [6]
 * 
 * [][1][2][3][4][5][6]
 * 0  1  2  3  4  5  6
 * 
 * 위의 그림은 이진트리를 배열 표현법으로 나타낸 것입니다.
 * 트리의 순서가 배열의 인덱스가 되어 1번부터 차례로 값이 들어가게 됩니다.
 * 배열 표기법은 트리 노드의 삽입 또는 삭제에 따라 배열의 크기를 동적으로 변경할 수 없다는 단점이 있습니다.
 * 그리고 링크 표현법에 비해 트리의 구조를 한눈에 알아보기가 힘듭니다.
 * 
 * 			[][1][]
 * 	  [][2][]	 [][3][]
 * []4[]  [][5][] [][6][]
 * 
 * 위의 그림은 이진트리를 링크 표현법으로 나타낸 것입니다.
 * 각 노드는 왼쪽 자식을 가리키는 포인터, 오른쪽 자식을 가리키는 포인터, 데이터 영역을 가지게 됩니다.
 * 만일 자식이 없다면 NULL로 표현됩니다.
 * 링크 표현법은 트리 노드의 삽입 또는 삭제에 따라 크기를 동적으로 변경할 수 있지만
 * 배열 표현법보다 코드가 복잡하다는 단점이 있습니다.
 * 
 * 
 * 
 * 
 */

