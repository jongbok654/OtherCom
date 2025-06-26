package test.main;

import javax.swing.JFrame;

//module-info.java를 삭제해야함!!!
//JAVA의 GUI ==> ex)자바로 집짓기
public class MainClass03 {
	public static void main(String[] args) {
		JFrame f = new JFrame("나의 창");
		f.setBounds(100, 100, 500, 500);
		f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		f.setVisible(true);

	}
}
