package useclass;

public class STData {
	private String name;
	private int age;
	private int score;
	// �ʹ����� �߿��� �������̱� ������ ���� �����ϸ� �ȵȴ� - Private
	
	public STData(String name, int age, int score) {
		this.name = name;
		this.age = age;
		this.score = score;
	}
		
	public void setScore(int score) {
		this.score = score;
		// �������� ���� �������� �ʰڴ�.(setter�� ����)
	}
	
	public String getName() {
		return this.name;
	}
	
	public int getAge() {
		return this.age;
	}
	
	public int getScore() {
		return this.score;
	}
	
	
}
