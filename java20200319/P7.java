package java20200319;
//**************************������ ����(NCS6~8)***************************
public class P7 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		StManager m = new StManager();
		System.out.println("�����ϴ� �������� ������");
		StManager m = StManager.getInstance();
		m.manage();
		
		StManager m1 = StManager.getInstance(); // �ι�° �ν��Ͻ� ����
		StManager m2 = StManager.getInstance();
		StManager m3 = StManager.getInstance();
	
		
	}

}
//*********************�̱���...������ ����...**************************** 
class StManager{ // ��ɿ� �������� Ŭ����
// Student Managing�� �ϴ� Ŭ����
//	************************���� ���*************************
//	private static StManager instance = null; (instance �̹� ����)
//	public static StManager getInstance() {
//		if(instance == null) { (�� ��°�� ��� instance�� null�� �ƴϸ� if�� �״�� �Ѿ)
//			instance = new StManager();
//		}
	
//		return instance;
//	}
	
//	private StManager() {
//		
//	}
	
	private static final StManager instance = new StManager(); // �������
	public static StManager getInstance() {
		
		return instance;
		
	}
	
	
	private StManager() { // Private�� ������ ���� => Ŭ���� ���ο��� �����ϰڴ�.
//	.......... 1�� ȣ���......
	System.out.println("������ ȣ���....");	
		
	}
	//**************�Ʒ�.. ������ ����..�� �޼ҵ�...��....********************
	private int count; // private static int count�� ����	
	
	public void manage() { // public static void manage()�� ����
		count++;
		System.out.println(count + "�л� ������ �մϴ�.");
	}
}


class StData{
	public int score;
	public String name;	
}

//*********************�̱���...������ ����...**************************** 
// ��� : ������ ��Ȯ�ϰ� �ϴµ� ������ �ǹǷ� �̵��ݾ� ���캸��.
