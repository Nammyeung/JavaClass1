package col;

import java.util.*;


public class Ex1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		HashMap<String, ArrayList<StudentData>> classMap =
				new HashMap<String, ArrayList<StudentData>>();
		// HashMap �ȿ� ArrayList
		classMap.put("1��",  new ArrayList<StudentData>());
		classMap.put("2��",  new ArrayList<StudentData>());
		classMap.put("3��",  new ArrayList<StudentData>());
		
		
		classMap.get("1��").add(new StudentData("����", 19, 70));
		classMap.get("1��").add(new StudentData("����", 19, 70));
		classMap.get("1��").add(new StudentData("����", 19, 70));
		classMap.get("1��").add(new StudentData("����", 19, 70));
		classMap.get("1��").add(new StudentData("����", 19, 70));
		classMap.get("1��").add(new StudentData("����", 19, 70));
		classMap.get("1��").add(new StudentData("����", 19, 70));
		
		classMap.get("2��").add(new StudentData("����", 19, 70));
		classMap.get("2��").add(new StudentData("����", 19, 70));
		classMap.get("2��").add(new StudentData("����", 19, 70));
		classMap.get("2��").add(new StudentData("����", 19, 70));
		classMap.get("2��").add(new StudentData("����", 19, 70));
		classMap.get("2��").add(new StudentData("����", 19, 70));
	
		for(StudentData data : classMap.get("1��")) {
			System.out.println(data.name);
		}
		
	}

}
