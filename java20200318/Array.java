package java20200318;

public class Array {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// String [][] datas = new String[10][3]; // �������δ� ����������....
		// ���߹迭�� ������ 1�߹迭������ ��, ��ġ�� ***�迭***������ �����ؾ���.
		// ��Ʈ�� ���� ����(����,���ΰ� ������ ��ġ�� ���ϰ� ����)
//		datas[0][0] = "Ʈ���̼�";
//		datas[0][1] = "20";
//		datas[0][2] = "99";
//		
//		datas[0][0] = "����";
//		datas[0][1] = "30";
//		datas[0][2] = "70";

//						VS
		
		// ��ġ ���� �����Ͽ� ������(��ü) ������ �ùٸ� ��
//		String [] names = new String[10];
//		String [] scores = new String[10];
//		String [] ages = new String[10];
	
		
		Student st1 = new Student(); // Team Memory�� �� ������ �޸𸮸� �����ϰڴ�.
		// �⺻ ���� �ƴϹǷ� ��������
//		st1.name = "Ʈ���̼�";
		// .(like [i]) : ���� ������
//		st1.score = "70";
//		st1.age = "20";
		
//		st1 = new Student();
//		System.out.println(st1.name); // null : �ʱⰪ�� null�̹Ƿ�(���� ������ ���� ����)
	
	    Student [] studentList = new Student[10];
	    
	    for(int i = 0 ; i < studentList.length ; i++) {
	    	studentList[i] = new Student();
	    }
	    
	    studentList[0].name = "Ʈ���̼�";
	    studentList[0].score = "70";
	    studentList[0].age = "20";
	    // ���������δ� ������ ������ ***�ڵ��� �帧 ��*** ������ �ִ�.
	    
	    System.out.println(studentList[0].name);
	    // java.lang.NullPointerException
	    
//	    ** Student st1 = new Student();
	    Student st2 = st1;
	    st2.name = "Ʈ���̼�";
	    System.out.println(st1.name);
	    //��� ��µ�(���� x)
	    
	    st1 = new Student();
	    // new : �ּҺ��� / Student() : ��ü ����
	    
	    st2 = null;
	    st1 = new Student();
	    
	    Student[] list = new Student[10];
	    
	    // Student[10]�� student()�� ����
	
	
	}

}

class Student{
	String name;
	String score;
	String age;
}

