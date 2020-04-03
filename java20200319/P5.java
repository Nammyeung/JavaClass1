package java20200319;

public class P5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Account a1 = new Account("����",10000);
//		a1.name = "����";
//		a1.balance = 10000;
// Private������ ȣ�� x(���� �ν� ����)		
		
		a1.deposit(10000);
		a1.withdraw(1000000);
		
		System.out.println(a1.getCurrentBalance());
//		private������ ������ �������� getter�� setter�� ���� ������ ����
		// a1�� withdraw�� ���ؼ� balance�� ������ �ֱ����� withdraw()�� ����. => �����ڷ� ������ ���ϵ��� �ؾ��Ѵ�. => ������ ���
		a1.deposit(20000);
		a1.withdraw(5000);
		a1.withdraw(10000000);
		a1.withdraw(3000);
		
//		System.out.println(a1.balance);
//		balanceȣ�� ����(Private)
		
		a1.setBalance(-100000);
		
	}

}

class Account{
	private String name;// API�� ��� ��������� ������ �� �ִ� ��찡 ���� ���� => �Ժη� ������ �� ���Բ� ������(Private) ���.
	private int balance;
//	ĸ��ȭ�� �� 1��Ģ : ������ ����
	
	public Account(String name, int balance) {
		this.name = name;
		this.balance = balance;
	}
	// ������ ȣ��, setting
	
	public void deposit(int value) {
		balance += value;
	}
	
	public void withdraw(int value) {
		
		if(balance < value) {
			System.out.println("���� �߻�..��� �ݾ��� �ܾ׺��� Ů�ϴ�");
			return;
		}
		
		balance -= value;
	}
	
	public int getCurrentBalance() {
		
		return this.balance;
	}
	
	public void setBalance(int value) {
		this.balance = value;
	} // setter�� ���� �ٸ� Ŭ������ �����ϴ� ���� �����ؾ��Ѵ�.
	// � ���� setter�� ���;� �ϴµ� ����ó���� �Ǿ ���;� ��(���� �����Ͱ� �������� '��ȿ�� �˻�'�� �����ϰ� ����
	
}