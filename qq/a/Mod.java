package qq.a;

public class Mod {

	public void testMod(CallBackFunc x) {
		System.out.println("���� ���� �ڵ�...");
		System.out.println("���� ���� �ڵ�...");
		
		x.call();
		
		System.out.println("���� ���� �ڵ�...");
		System.out.println("���� ���� �ڵ�...");		
	}


}


interface CallBackFunc{
	public abstract void call();
}
