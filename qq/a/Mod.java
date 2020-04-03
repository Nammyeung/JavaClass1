package qq.a;

public class Mod {

	public void testMod(CallBackFunc x) {
		System.out.println("무언가 실행 코드...");
		System.out.println("무언가 실행 코드...");
		
		x.call();
		
		System.out.println("무언가 실행 코드...");
		System.out.println("무언가 실행 코드...");		
	}


}


interface CallBackFunc{
	public abstract void call();
}
