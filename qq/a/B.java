package qq.a;

public class B {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Call c = new Call();
		
		
		Mod m = new Mod();
		m.testMod(c);
	}
}

class Call implements CallBackFunc{
	public void call() {
		System.out.println("�ݰ�����....B�Դϴ�.");
	}
}