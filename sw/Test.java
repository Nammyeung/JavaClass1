package sw;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*; // ������ ���α׷� ����� ���̺귯��(�ڹٿ�)

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new TestFrame();
	}

}

class TestFrame extends JFrame{
	
	public TestFrame() {
		this.setLayout(null);
		// ���̾ƿ��� ���ְڴ�.
		this.setBounds(100, 100, 300, 300); // �����ӿ�ũ ���� : ���밡 ������� ����.
		
		// **************��ư�� �Ѱ� ���� �߰��ϰڴ�.***************
		JButton btn1 = new JButton("�ȳ��ϼ���");
		btn1.setBounds(10, 10, 150, 40);
		
		ActionListener t = new TTTT();
		btn1.addActionListener(t);
		
		
		this.add(btn1);
		
		this.setVisible(true);
	}
	
}

// �̹� ������� Ŭ����(�������̽�)�� ��ӹްڴ�. => implements.
class TTTT implements ActionListener{
	@Override
	public void actionPerformed(ActionEvent e) { // actionPerformed(��ҹ��� ������ ��!!)
		System.out.println("��ư ������ �� ���� �� �ڵ�...");
	
	}
}