package test.frame01;



import javax.swing.JFrame;

public class MyFrame extends JFrame {

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
		

		
		
		// 화면상에 실체 보이도록 한다
		setVisible(true);
	}
}

