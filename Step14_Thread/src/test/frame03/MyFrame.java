package test.frame03;

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
		JButton startBtn3 = new JButton("작업 시작3");

		add(startBtn);
		add(startBtn2);
		add(startBtn3);

		startBtn.addActionListener((e) -> {
			// 여기는 메인스레드가 실행해준다.(버튼을 누르면)
			try {
				Thread.sleep(10000);
			} catch (InterruptedException e1) {
				e1.printStackTrace();
			}
		});

		startBtn2.addActionListener((e) -> {

			// Runnable은 run()메소드 하나만 있기 때문에 아래처럼 표시 가능

			/*
			 * 아래의 코드는 평범한 예시 Runnable r1 = () -> { }; new Thread(r1).start();
			 */

			// 위의 코드를 최대로 간략화 한 것+실행할 함수 코딩
			new Thread(() -> {
				System.out.println("10초 걸리는 작업 실행");
				try {
					Thread.sleep(10000);
				} catch (InterruptedException e1) {
					e1.printStackTrace();
				}
				System.out.println("작업이 종료됨");
			}).start();

		});
		startBtn3.addActionListener((e) -> {

			new Thread(() -> {
				System.out.println("버튼3 눌림");
				try {
					Thread.sleep(1000 * 2);

				} catch (InterruptedException e1) {

					e1.printStackTrace();
				}
				System.out.println("2초끗");

			}).start();

		});

		setVisible(true);
	}

	// 메인메소드
	public static void main(String[] args) {
		new MyFrame();
	}

}
