package test.frame;

import java.awt.BorderLayout;
import java.awt.Font;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

import javax.swing.JFileChooser;
import javax.swing.JFrame;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JOptionPane;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;

public class MemoFrame extends JFrame {
	// 필요한 필드 정의하기
	JTextArea ta = new JTextArea(); // 텍스트 입력 영역 생성

	// 현재 열린 파일 객체를 저장할 필드
	File openedFile;
	File openFile;

	// 생성자
	public MemoFrame(String title) {
		super(title);
		// 메뉴바
		JMenuBar mb = new JMenuBar();
		// 메뉴
		JMenu menu = new JMenu("File");

		// 메뉴 아이템
		JMenuItem newItem = new JMenuItem("New");
		JMenuItem openItem = new JMenuItem("Open");
		JMenuItem saveItem = new JMenuItem("Save");
		JMenuItem saveAsItem = new JMenuItem("Save AS");

		// 처음에 저장기능은 disable 로 들기
		saveItem.setEnabled(false);
		saveAsItem.setEnabled(false);

		// 메뉴에 메뉴 아이템을 순서대로 추가
		menu.add(newItem);
		menu.add(openItem);
		menu.add(saveItem);
		menu.add(saveAsItem);

		// 메뉴를 메뉴바에 추가
		mb.add(menu);

		// 프레임의 메소드를 이용해서 메뉴바를 추가하기
		setJMenuBar(mb); // JFrame의 메소드라 다 생략
		// 레이아웃 설정
		setLayout(new BorderLayout()); // JFrame의 메소드라 다 생략
		// 스크롤 설정
		JScrollPane scp = new JScrollPane(ta); // 텍스트 영역인 ta를 JScrollPane에 담음 ==> 스크롤 기능이 있는 텍스트 영역 생성
		// 프레임의 가운데에 JScrollPane을 배치하기
		add(scp, BorderLayout.CENTER);
		// JTextArea 의 글자크기 조정하기
		Font font = new Font("Serif", Font.PLAIN, 30);
		ta.setFont(font);
		ta.setVisible(false);

		// ------------------------------
		// 위에까지가 JFrame 뼈대 생성

		// New 버튼 눌렀을 때 실행할 함수 생성
		newItem.addActionListener((e) -> {

			ta.setVisible(true);
			setTitle("제목 없음");
			// saveAS를 활성화시키기
			saveAsItem.setEnabled(true);

		});

		// 중괄호 {} 안에 실행문이 한 줄이고, return도 필요 없으며,
		// **람다식의 본문이 "단순 표현식"**이라면,
		// 👉 **중괄호 {}와 세미콜론 ;를 생략할 수 있습니다!

		// 최대한 줄여보기 ==> newItem.addActionListener(e->ta.setVisible(true));

		saveAsItem.addActionListener((e) -> {
			// 파일 선택을 하게 해주는 객체 생성
			var fc = new JFileChooser();
			// 파일을 저장하기 위해 다이얼로그 띄우기
			int result = fc.showSaveDialog(this); // showSaveDialog는 int값을 전달하기 때문에 result라는 변수에 담음.
			if (result == JFileChooser.APPROVE_OPTION) {
				// 해당 File 객체를 얻어오기
				openedFile = fc.getSelectedFile();
				// 원래 File openedFile 이였지만, 위에 필드로 선언했기 때문에 지역변수 선언인 File을 지움..!!

				setTitle(openedFile.getName());
				// 실행하면 저장한 파일명이 TITLE로 출력됨

				// 실제로 해당 파일 만들기
				try {
					openedFile.createNewFile();

					// 위에서 액션 리스너의 매개변수로 e를 이미 선언했기때문에
					// e말고 다른 아무 변수인 e1 사용
				} catch (IOException e1) {
					e1.printStackTrace();
				}
				// 파일에 저장하는 메소드 호출
				saveToFile();// JFrame에 없는 메소드 이기 때문에 아래에 메소드 생성
			}
		});

		// Open 버튼 눌렀을 때 실행하는 함수 만들어보기
		openItem.addActionListener((j) -> {
			var fc2 = new JFileChooser();
			// 파일을 열기위해 위해 다이얼로그 띄어보기
			int select = fc2.showOpenDialog(this);
			
			//JFileChooser.APPROVE_OPTION 이 메소드가 하는 일은?
			//파일 선택 창(JFileChooser)에서 "사용자가 '확인' 또는 '열기' 버튼을 눌렀는지"를 나타내는 값입니다.
			if (select == JFileChooser.APPROVE_OPTION) {
				// 해당 file 객체를 얻어오기
				openFile = fc2.getSelectedFile();

				setTitle(openFile.getName());

				try {
					BufferedReader br = new BufferedReader(new FileReader(openFile));
					ta.setText("");
					String line;

					ta.setVisible(true);
					//자바의 연산자 순서 때문에 괄호안에 넣어서 (line = br.readLine()) 이 먼저 실행되게 해야함!!!
					while ((line = br.readLine()) != null) {
						ta.append(line + "\n");

					}
					br.close();

				} catch (Exception e2) {
					e2.printStackTrace();
				}
			}

		});
	}

	private void saveToFile() {

		// JTextArea에 입력한 문자열을 읽어와서
		String memo = ta.getText();

		// Filewriter 객체를 openedFile 객체에 문자열이 저장되도록 하기!
		try {
			var fw = new FileWriter(openedFile);

			fw.append(memo);
			fw.flush();
			JOptionPane.showMessageDialog(this, "저장했습니다");
		} catch (Exception e) {
			e.printStackTrace();
		}

	}

	public static void main(String[] args) {
		MemoFrame f = new MemoFrame("메모장");
		f.setBounds(100, 100, 500, 500);
		f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		f.setVisible(true);
	}
}
