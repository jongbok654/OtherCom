package test.frame04;

import java.awt.Component;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;

public class MyFrame extends JFrame {
	// 버튼을 누른 횟수를 저장할 필드
	int count = 0;
	// 생성자
	public MyFrame() {
		setTitle("나의 프레임");
		setBounds(100, 100, 300, 300);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		// 레이아웃 메니저 객체 생성
		FlowLayout layout = new FlowLayout(FlowLayout.CENTER);
		// 프레임의 레이아웃 메니저 설정
		setLayout(layout);
		// 생성한 버튼의 참조값을 필드에 저장하면 객체안에서 어디서든지 활용가능!

		JButton countBtn = new JButton("0");
		add(countBtn);
		
		//아래는 람다식을 이용하지 않은 방법

		/*
		 * ActionListener listener = new ActionListener() {
		 * 
		 * @Override public void actionPerformed(ActionEvent e) {
		 * 
		 *  count++; 
		 *  
		 *  String s=Integer.toString(count); countBtn.setText(s);}};
		 * 
		 * 
		 * 
		 */
		// 람다식
		countBtn.addActionListener(e -> {
			count++;
			countBtn.setText(Integer.toString(count));
		});
		setVisible(true);
	}

	public static void main(String[] args) {
		new MyFrame();
	}

}
