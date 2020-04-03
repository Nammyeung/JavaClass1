package java20200327;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;

import javax.swing.*;

public class P1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		FrameManager.mainFrame = new MainFrame(); // ���� ��𼭵��� ���ٰ����� ���� ����
		// MainFrame���ο��� Thread�� ���� ����.
	}

}

//*********************�ǹ����� ���� API�� �ƴ�
//********************�������� �����ӿ�ũ�� ���α׷����� �Ѵٴ� �ǹ�


class FrameManager {
	static MainFrame mainFrame; // ��������
	static SubFrame subFrame;
	static ArrayList<STData> list = new ArrayList<STData>();
}


class MainFrame extends JFrame{
	JTextArea ja; // �Ʒ���(���� ������ ������ ��Ʈ���ؾ���) ������������ ����� ����ϴ� ���� �´�.
		
	
	MainFrame(){
		this.setTitle("�л� ���� ���α׷�"); // JFrame ������ �޼ҵ�, �������� ����
		this.setLayout(null);
		this.setDefaultCloseOperation(DISPOSE_ON_CLOSE); // DISPOSE_ON_CLOSE = <terminated> OR DOSPOSE_ON_HIDE
		// close�� ������ �� � Operation�� �����ų�
		
		
		// ���� ���̾ƿ��� �������.
		this.setBounds(100,100,400,300);
		// ����ȭ�鿡���� ��ġ��
		
		ja = new JTextArea(); // Text�� �� �� �ִ� �簢���� ū �ڽ�
		ja.setBounds(10, 10, 380, 200);
		ja.setEditable(false);
		this.add(ja);
		
		JButton btnAdd = new JButton("Ȯ�� �Է�");
		btnAdd.setBounds(10, 220, 100, 30);
		this.add(btnAdd);
		btnAdd.addActionListener(e->{
			FrameManager.subFrame = new SubFrame(); // �л� �Է�â�� ���� �� ����
		});
		
		JButton btnClose = new JButton("����");
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
		this.setTitle("�л� ���� �Է�");
		this.setBounds(200, 200, 350, 300);
		this.setLayout(null);
		this.setDefaultCloseOperation(DISPOSE_ON_CLOSE);
		
		JLabel lName = new JLabel("�̸�");
		lName.setBounds(10, 10, 40, 30);
		this.add(lName);
		
		tfName = new JTextField();
		tfName.setBounds(90, 10, 200, 30);
		this.add(tfName);
		
		JLabel lAge = new JLabel("����");
		lName.setBounds(10, 110, 40, 30);
		this.add(lAge);
		
		tfAge = new JTextField();
		tfAge.setBounds(90, 110, 200, 30);
		this.add(tfAge);
		
		JButton btnConfirm = new JButton("Ȯ��");
		btnConfirm.setBounds(10, 210, 280, 60);
		this.add(btnConfirm);
//		JSP���� ���� : API(�����ӿ�ũ) ��ģ���� Ȱ���ؼ� ������ ����
		btnConfirm.addActionListener(new AddStudentInfoAction()); // �ݹ�Ǽ� ȣ��
		
		
		
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
		
		JOptionPane.showMessageDialog(null,  "������ �ԷµǾ����ϴ�.");
		
		FrameManager.mainFrame.ja.setText(""); // �ʱ�ȭ ��Ű�� ��.
		
		String str = "";
		// for each��
		for(STData data : FrameManager.list) {
			str += data.name + " : " + data.age;
			str += "\n";
		}
		
		FrameManager.mainFrame.ja.setText(str);
		
		FrameManager.subFrame.dispose();
	}		
}

class STData{ // new�ؼ� ������ ������ ArrayList�� ���� ��.
	String name;
	String age;
	
	STData(String name, String age) {
		this.name = name;
		this.age = age;
	}
}

// ��ǻ� ���α׷� api�� ��� �����ؼ� �̰ɷ� ����