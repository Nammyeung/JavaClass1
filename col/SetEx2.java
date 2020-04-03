package col;

import java.util.*;

public class SetEx2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		TreeSet<StudentData> set = 
				new TreeSet<StudentData>();
		
		set.add(new StudentData("한조1", 1, 5));
		set.add(new StudentData("한조2", 2, 4));
		set.add(new StudentData("한조3", 3, 6));
		set.add(new StudentData("한조4", 4, 3));
		set.add(new StudentData("한조5", 5, 2));
		set.add(new StudentData("한조6", 6, 1));
				
		for(StudentData data : set) {
			System.out.println(data.name);
		}
		
	}

}

// Set - HashSet
//
// 자바 컬렉션에서 제공하는 Set 인터페이스는 순서를 유지하지 않는 데이터의 집합입니다.
// Map 구조와 달리 중복을 허용하지 않는다는 특징이 있습니다.
// HashSet은 내부적으로 해싱(Hashing)을 이용해서 구현한 컬렉션입니다.
// HashSet은 저장순서를 유지하지 않으므로 저장순서를 유지하려면 LinkedHashSet을 사용해야 합니다.
//
// 출처: https://swalloow.tistory.com/36?category=667489 [MyCloud]



// Set - TreeSet
//
// TreeSet은 이진탐색트리(BinarySearchTree)의 형태로 데이터를 저장하는 컬렉션입니다.
// 이진탐색트리 중에서도 성능을 향상시킨 '레드-블랙 트리(Red-Black Tree)로 구현되어 있습니다.
// 따라서 데이터의 추가, 삭제에는 시간이 걸리지만, 검색과 정렬이 뛰어나다는 장점이 있습니다.
// TreeSet은 마찬가지로 중복된 데이터의 저장을 허용하지 않으며 정렬된 위치에 저장하므로 
// 저장순서를 유지하지 않습니다.
//
// http://swalloow.tistory.com/35
//
// 출처: https://swalloow.tistory.com/36?category=667489 [MyCloud]

