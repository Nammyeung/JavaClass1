package col;

import java.util.*;


public class Ex1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		HashMap<String, ArrayList<StudentData>> classMap =
				new HashMap<String, ArrayList<StudentData>>();
		// HashMap 안에 ArrayList
		classMap.put("1반",  new ArrayList<StudentData>());
		classMap.put("2반",  new ArrayList<StudentData>());
		classMap.put("3반",  new ArrayList<StudentData>());
		
		
		classMap.get("1반").add(new StudentData("한조", 19, 70));
		classMap.get("1반").add(new StudentData("한조", 19, 70));
		classMap.get("1반").add(new StudentData("한조", 19, 70));
		classMap.get("1반").add(new StudentData("한조", 19, 70));
		classMap.get("1반").add(new StudentData("한조", 19, 70));
		classMap.get("1반").add(new StudentData("한조", 19, 70));
		classMap.get("1반").add(new StudentData("한조", 19, 70));
		
		classMap.get("2반").add(new StudentData("한조", 19, 70));
		classMap.get("2반").add(new StudentData("한조", 19, 70));
		classMap.get("2반").add(new StudentData("한조", 19, 70));
		classMap.get("2반").add(new StudentData("한조", 19, 70));
		classMap.get("2반").add(new StudentData("한조", 19, 70));
		classMap.get("2반").add(new StudentData("한조", 19, 70));
	
		for(StudentData data : classMap.get("1반")) {
			System.out.println(data.name);
		}
		
	}

}
