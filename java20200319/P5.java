package java20200319;

public class P5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Account a1 = new Account("한조",10000);
//		a1.name = "한조";
//		a1.balance = 10000;
// Private때문에 호출 x(변수 인식 못함)		
		
		a1.deposit(10000);
		a1.withdraw(1000000);
		
		System.out.println(a1.getCurrentBalance());
//		private때문에 접근을 못하지만 getter와 setter를 통해 접근이 가능
		// a1는 withdraw를 통해서 balance를 조정해 주기위해 withdraw()를 만듬. => 접근자로 접근을 못하도록 해야한다. => 접근자 사용
		a1.deposit(20000);
		a1.withdraw(5000);
		a1.withdraw(10000000);
		a1.withdraw(3000);
		
//		System.out.println(a1.balance);
//		balance호출 못함(Private)
		
		a1.setBalance(-100000);
		
	}

}

class Account{
	private String name;// API의 경우 멤버변수에 접근할 수 있는 경우가 거의 없음 => 함부로 수정할 수 없게끔 제한자(Private) 사용.
	private int balance;
//	캡슐화의 제 1원칙 : 정보의 은닉
	
	public Account(String name, int balance) {
		this.name = name;
		this.balance = balance;
	}
	// 생성자 호출, setting
	
	public void deposit(int value) {
		balance += value;
	}
	
	public void withdraw(int value) {
		
		if(balance < value) {
			System.out.println("예외 발생..출금 금액이 잔액보다 큽니다");
			return;
		}
		
		balance -= value;
	}
	
	public int getCurrentBalance() {
		
		return this.balance;
	}
	
	public void setBalance(int value) {
		this.balance = value;
	} // setter를 만들어서 다른 클래스에 전달하는 것은 조심해야한다.
	// 어떤 값이 setter로 들어와야 하는데 예외처리가 되어서 들어와야 함(들어온 데이터가 적합한지 '유효성 검사'를 수행하고 들어옴
	
}