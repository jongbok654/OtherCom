package test.frame03;

import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;


//ActionLister를 상속받으면서 this를 활용해서 버튼을 만드는 방법
public class MyFrame extends JFrame implements ActionListener {

	/*
	 * Graphic User Interface를 만들 수 있는 JFrame 클래스 설계하기
	 * 
	 * 1.JFrame 클래스를 상속 받는다.
	 * 
	 * 2.생성자에서 필요한 초기화 작업을 한다
	 * 
	 * main() 메소드에서 이클랫로 매쳬를 생성하면 프레임(window)가 만들어 진다
	 */

	// 생성자 생성
	public MyFrame() {
		this.setTitle("삽입 프레임");// 제목 설정
		this.setBounds(100, 100, 500, 500);// 프레임의 위치와 크기 => x,y,width,height
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);// 종료(x)버튼을 눌렀을 때 프로세스(app)전체가 종료

		// 레이아웃 매니저 객체 생성
		FlowLayout layout = new FlowLayout(FlowLayout.CENTER);
		// 프레임의 레이아웃 매니저 설정
		setLayout(layout);
		// JButton 객체 생성
		JButton btn1 = new JButton("추가");
		JButton btn2 = new JButton("수정");
		JButton btn3 = new JButton("삭제");

		// 버튼에 ActionCommand 부여하기
		btn1.setActionCommand("insert");
		btn2.setActionCommand("update");
		btn3.setActionCommand("delete");

		// 프레임의 add() 메소드 호출하면서 JButton 객체의 레이아웃 참조값을 전달하면 프레임에 버튼이 배치된다

		add(btn1);
		add(btn2);
		add(btn3);

		// 하나의 액션 리스너를 여러개의 버튼에 등록하기
		btn1.addActionListener(this);
		btn2.addActionListener(this);
		btn3.addActionListener(this);

		// 화면상에 실체 보이도록 한다
		setVisible(true);

	}

	// main 메소드 만들기
	public static void main(String[] args) {

		new MyFrame();

	}

	// ActionListener 인퍼에시르르 구현했기 때문에 강제로 Override 된 메소드
	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub

		System.out.println("버튼 클릭됨");

		String cmd = e.getActionCommand();

		if (cmd.equals("insert")) {
			System.out.println("insert");

		} else if (cmd.equals("update")) {
			System.out.println("update");

		} else if (cmd.equals("delete")) {
			System.out.println("delete");

		}

	}

}
