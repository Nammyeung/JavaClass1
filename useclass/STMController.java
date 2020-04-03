package useclass;

// 멤버로서 Controller가 Model을 포함하고 싶다. 
     
	public class STMController {
		
	private STMModel model;
		
	public STMController(STMModel model) {
//		model = new STMModel();
		this.model = model;
	}
		
	public void run() { // static을 넣으면 호출 못하는 이유
		
//		Scanner scn = new Scanner(System.in);
		
		greeting();
		
		while(true) {
			
			showMenu();
			
			String inputValue = STMUtil.SCANNER.nextLine();
			
			if(inputValue.equals("q")) {
				break;
			}
			// 소스량이 적을 때만 switch를 쓰는 것을 권장
			switch(inputValue) {
			case "1" :
				addData();
				// 처음 입사했을 때 핵심 코어코드를 확인 => 문제가 있어보이면 해당 클래스에 접근해본다.
//				IIlIIllII(); // 알아보지 못하게 하는 코드.
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
				System.out.println("다른 값 입력해...");
			}
			
		}
	}
	

private void greeting() {
	System.out.println("프로그램 반가워..");
	System.out.println("작성은 누구고...");
	}

private void showMenu() {
	System.out.println("1.입력");
	System.out.println("2.리스트 출력");
	System.out.println("3.검색");
	System.out.println("4.삭제");
	System.out.println("5.수정");
	System.out.println("입력>");
	}

private void addData() {
	System.out.print("이름을 입력>");
	String name = STMUtil.SCANNER.nextLine();
	System.out.println("나이를 입력>");
	int age = Integer.parseInt(STMUtil.SCANNER.nextLine());
	System.out.println("점수를 입력>");
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