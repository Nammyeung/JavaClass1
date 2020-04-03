package java20200318;

public class Array {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// String [][] datas = new String[10][3]; // 논리적으로는 문제없으나....
		// 이중배열의 내부의 1중배열끼리의 비교, 가치가 ***배열***에서는 동일해야함.
		// 비트맵 파일 구조(가로,세로가 동일한 가치를 지니고 있음)
//		datas[0][0] = "트레이서";
//		datas[0][1] = "20";
//		datas[0][2] = "99";
//		
//		datas[0][0] = "한조";
//		datas[0][1] = "30";
//		datas[0][2] = "70";

//						VS
		
		// 가치 별로 구분하여 데이터(객체) 형성한 올바른 예
//		String [] names = new String[10];
//		String [] scores = new String[10];
//		String [] ages = new String[10];
	
		
		Student st1 = new Student(); // Team Memory에 이 형태의 메모리를 형성하겠다.
		// 기본 변수 아니므로 참조변수
//		st1.name = "트레이서";
		// .(like [i]) : 접근 연산자
//		st1.score = "70";
//		st1.age = "20";
		
//		st1 = new Student();
//		System.out.println(st1.name); // null : 초기값이 null이므로(값이 들어가있지 않은 상태)
	
	    Student [] studentList = new Student[10];
	    
	    for(int i = 0 ; i < studentList.length ; i++) {
	    	studentList[i] = new Student();
	    }
	    
	    studentList[0].name = "트레이서";
	    studentList[0].score = "70";
	    studentList[0].age = "20";
	    // 문법적으로는 문제가 없지만 ***코드의 흐름 상*** 문제가 있다.
	    
	    System.out.println(studentList[0].name);
	    // java.lang.NullPointerException
	    
//	    ** Student st1 = new Student();
	    Student st2 = st1;
	    st2.name = "트레이서";
	    System.out.println(st1.name);
	    //결과 출력됨(문제 x)
	    
	    st1 = new Student();
	    // new : 주소변경 / Student() : 객체 형성
	    
	    st2 = null;
	    st1 = new Student();
	    
	    Student[] list = new Student[10];
	    
	    // Student[10]과 student()의 차이
	
	
	}

}

class Student{
	String name;
	String score;
	String age;
}

