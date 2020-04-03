package useclass;

public class STData {
	private String name;
	private int age;
	private int score;
	// 너무나도 중요한 데이터이기 때문에 쉽게 변경하면 안된다 - Private
	
	public STData(String name, int age, int score) {
		this.name = name;
		this.age = age;
		this.score = score;
	}
		
	public void setScore(int score) {
		this.score = score;
		// 예외적인 값은 수신하지 않겠다.(setter의 목적)
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
