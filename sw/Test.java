package sw;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*; // 윈도우 프로그램 만드는 라이브러리(자바용)

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new TestFrame();
	}

}

class TestFrame extends JFrame{
	
	public TestFrame() {
		this.setLayout(null);
		// 레이아웃을 없애겠다.
		this.setBounds(100, 100, 300, 300); // 프레임워크 형태 : 뼈대가 만들어져 있음.
		
		// **************버튼을 한개 만들어서 추가하겠다.***************
		JButton btn1 = new JButton("안녕하세요");
		btn1.setBounds(10, 10, 150, 40);
		
		ActionListener t = new TTTT();
		btn1.addActionListener(t);
		
		
		this.add(btn1);
		
		this.setVisible(true);
	}
	
}

// 이미 만들어진 클래스(인터페이스)를 상속받겠다. => implements.
class TTTT implements ActionListener{
	@Override
	public void actionPerformed(ActionEvent e) { // actionPerformed(대소문자 주의할 것!!)
		System.out.println("버튼 눌렀을 때 실행 될 코드...");
	
	}
}