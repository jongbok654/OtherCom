package test.frame02;

import java.awt.FlowLayout;

import javax.swing.JButton;
import javax.swing.JFrame;

public class MyFrame extends JFrame {

	// 생성자
	public MyFrame() {
		setTitle("스레드 테스트");
		setBounds(100, 100, 300, 300);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setLayout(new FlowLayout());

		JButton startBtn = new JButton("작업 시작");

		// 지역 변수일 경우에만 가능한 표현 방법
		/*
		 * type추론이 가능하면 지역변수의 type 선언 대신에 var 선언 할 수 있음
		 * 
		 * 인터페이스 type 추론 불가,null로 초기하 불가
		 * 
		 * 지역변수에만 가능.필드는 안됨
		 */
		var startBtn2 = new JButton("작업 시작2");

		add(startBtn);
		add(startBtn2);

		startBtn.addActionListener((e) -> {
			// 여기는 메인스레드가 실행해준다.(버튼을 누르면)
			try {
				Thread.sleep(10000);
			} catch (InterruptedException e1) {
				e1.printStackTrace();
			}
		});

		startBtn2.addActionListener((e) -> {

			// Thread 객체를 생성하면서 Runnable type을 전달하고 해당 객체의 start() 메소드를 호출하면
			// 새로운 작업단위가 시작된다.
			new Thread(new WorkRunnable()).start();
			
		});

		setVisible(true);
	}

	// 메인메소드
	public static void main(String[] args) {
		new MyFrame();
	}

}
