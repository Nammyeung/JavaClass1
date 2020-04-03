package java20200327;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;

import javax.swing.*;

public class P1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		FrameManager.mainFrame = new MainFrame(); // 언제 어디서든지 접근가능한 전역 변수
		// MainFrame내부에는 Thread가 돌고 있음.
	}

}

//*********************실무에서 쓰는 API는 아님
//********************윈도우즈 프레임워크로 프로그래밍을 한다는 의미


class FrameManager {
	static MainFrame mainFrame; // 전역변수
	static SubFrame subFrame;
	static ArrayList<STData> list = new ArrayList<STData>();
}


class MainFrame extends JFrame{
	JTextArea ja; // 아래의(메인 프레임 내부의 컨트롤해야할) 참조변수들은 멤버로 등록하는 것이 맞다.
		
	
	MainFrame(){
		this.setTitle("학생 관리 프로그램"); // JFrame 안쪽의 메소드, 변수들이 생성
		this.setLayout(null);
		this.setDefaultCloseOperation(DISPOSE_ON_CLOSE); // DISPOSE_ON_CLOSE = <terminated> OR DOSPOSE_ON_HIDE
		// close를 눌렀을 때 어떤 Operation을 돌릴거냐
		
		
		// 꽉찬 레이아웃이 만들어짐.
		this.setBounds(100,100,400,300);
		// 바탕화면에서의 위치값
		
		ja = new JTextArea(); // Text를 쓸 수 있는 사각형의 큰 박스
		ja.setBounds(10, 10, 380, 200);
		ja.setEditable(false);
		this.add(ja);
		
		JButton btnAdd = new JButton("확생 입력");
		btnAdd.setBounds(10, 220, 100, 30);
		this.add(btnAdd);
		btnAdd.addActionListener(e->{
			FrameManager.subFrame = new SubFrame(); // 학생 입력창이 따로 더 생김
		});
		
		JButton btnClose = new JButton("종료");
		btnClose.setBounds(160, 220, 100, 30);
		this.add(btnClose);
		btnClose.addActionListener((e)->{
			FrameManager.mainFrame.dispose();
		});
		
		this.setVisible(true);
		
		
		
	}
}

class SubFrame extends JFrame{
	
	JTextField tfName;
	JTextField tfAge;
	
	SubFrame(){
		this.setTitle("학생 정보 입력");
		this.setBounds(200, 200, 350, 300);
		this.setLayout(null);
		this.setDefaultCloseOperation(DISPOSE_ON_CLOSE);
		
		JLabel lName = new JLabel("이름");
		lName.setBounds(10, 10, 40, 30);
		this.add(lName);
		
		tfName = new JTextField();
		tfName.setBounds(90, 10, 200, 30);
		this.add(tfName);
		
		JLabel lAge = new JLabel("나이");
		lName.setBounds(10, 110, 40, 30);
		this.add(lAge);
		
		tfAge = new JTextField();
		tfAge.setBounds(90, 110, 200, 30);
		this.add(tfAge);
		
		JButton btnConfirm = new JButton("확인");
		btnConfirm.setBounds(10, 210, 280, 60);
		this.add(btnConfirm);
//		JSP들어가면 할일 : API(프레임워크) 미친들이 활용해서 디자인 설정
		btnConfirm.addActionListener(new AddStudentInfoAction()); // 콜백되서 호출
		
		
		
		this.setVisible(true);
	}
}

class AddStudentInfoAction implements ActionListener{

	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		String name = FrameManager.subFrame.tfName.getText();
		String age = FrameManager.subFrame.tfAge.getText();
		
		FrameManager.list.add(new STData(name, age));
		
		JOptionPane.showMessageDialog(null,  "정보가 입력되었습니다.");
		
		FrameManager.mainFrame.ja.setText(""); // 초기화 시키고 들어감.
		
		String str = "";
		// for each문
		for(STData data : FrameManager.list) {
			str += data.name + " : " + data.age;
			str += "\n";
		}
		
		FrameManager.mainFrame.ja.setText(str);
		
		FrameManager.subFrame.dispose();
	}		
}

class STData{ // new해서 세팅한 다음에 ArrayList에 담을 것.
	String name;
	String age;
	
	STData(String name, String age) {
		this.name = name;
		this.age = age;
	}
}

// 사실상 프로그램 api는 모두 동일해서 이걸로 연습