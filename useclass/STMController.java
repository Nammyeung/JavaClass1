package useclass;

// ����μ� Controller�� Model�� �����ϰ� �ʹ�. 
     
	public class STMController {
		
	private STMModel model;
		
	public STMController(STMModel model) {
//		model = new STMModel();
		this.model = model;
	}
		
	public void run() { // static�� ������ ȣ�� ���ϴ� ����
		
//		Scanner scn = new Scanner(System.in);
		
		greeting();
		
		while(true) {
			
			showMenu();
			
			String inputValue = STMUtil.SCANNER.nextLine();
			
			if(inputValue.equals("q")) {
				break;
			}
			// �ҽ����� ���� ���� switch�� ���� ���� ����
			switch(inputValue) {
			case "1" :
				addData();
				// ó�� �Ի����� �� �ٽ� �ھ��ڵ带 Ȯ�� => ������ �־�̸� �ش� Ŭ������ �����غ���.
//				IIlIIllII(); // �˾ƺ��� ���ϰ� �ϴ� �ڵ�.
				break;
			case "2" :
				showList();
				break;
			case "3" :
				showList();
				break;
			case "4" :
				showList();
				break;
			case "5" :
				showList();
				break;
			default:
				System.out.println("�ٸ� �� �Է���...");
			}
			
		}
	}
	

private void greeting() {
	System.out.println("���α׷� �ݰ���..");
	System.out.println("�ۼ��� ������...");
	}

private void showMenu() {
	System.out.println("1.�Է�");
	System.out.println("2.����Ʈ ���");
	System.out.println("3.�˻�");
	System.out.println("4.����");
	System.out.println("5.����");
	System.out.println("�Է�>");
	}

private void addData() {
	System.out.print("�̸��� �Է�>");
	String name = STMUtil.SCANNER.nextLine();
	System.out.println("���̸� �Է�>");
	int age = Integer.parseInt(STMUtil.SCANNER.nextLine());
	System.out.println("������ �Է�>");
	int score = Integer.parseInt(STMUtil.SCANNER.nextLine());
	
	model.addStudentData(new STData(name, age, score));
	}

private void showList() {
	for(int i = 0 ; i < model.getCurrentStudentCount() ; i++) {
		STData st = model.getStudentData(i);
		System.out.println(st);
		}
	}
}