package test.frame;

import java.awt.BorderLayout;
import java.awt.Color;

import javax.swing.BorderFactory;
import javax.swing.BoxLayout;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTable;
import javax.swing.JTextField;

public class MemberFrame11 extends JFrame {

	// 필요한 필드 정의
	JTextField inputName, inputAddr;

	public MemberFrame11() {
		// 레이아웃 설정
		setLayout(new BorderLayout());

		JPanel panels = new JPanel();//패널들을 담을 패널!
		panels.setLayout(new BoxLayout(panels, BoxLayout.Y_AXIS));//수직정렬

		for (int i = 0; i < 5; i++) {
			// JLable 2개
			JLabel label1 = new JLabel("이름");
			JLabel label2 = new JLabel("주소");

			// JTextField 1개
			inputName = new JTextField(10);
			inputAddr = new JTextField(10);

			// JButton
			JButton insertBtn = new JButton("저장");
			// 패널에 UI 배치

			JPanel panel = new JPanel();
			panel.add(label1);
			panel.add(inputName);
			panel.add(label2);
			panel.add(inputAddr);
			panel.add(insertBtn);
			// 패널의 배경색 설정
			panel.setBackground(Color.orange);
			panels.add(panel);
			
			
	

			panels.add(panel);
		}
		// 패널을 프레임의 중앙에 배치
		add(panels, BorderLayout.CENTER);

	}

	public static void main(String[] args) {

		MemberFrame11 f = new MemberFrame11();
		f.setTitle("회원 정보");
		f.setBounds(100, 100, 800, 500);
		f.setDefaultCloseOperation(EXIT_ON_CLOSE);// 닫기 옵션
		f.setVisible(true);
	}

}
