package test.frame;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Font;
import java.util.List;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.JTextField;
import javax.swing.table.DefaultTableModel;

import test.dao.MemberDao;
import test.dto.MemberDto;

public class MemberFrame extends JFrame {

	// 필요한 필드 정의
	JTextField inputName, inputAddr;

	// 표형식으로 정보를 출력할 UI 테이블
	JTable table;
	// JTable 에 출력할 data 를 공급해줄 모델 객체
	DefaultTableModel model;

	// MemberDao를 자주 사용할 ㅇ예정이기 떄문에 미리 필드에 참조값 넣어두기
	MemberDao dao = new MemberDao();

	public MemberFrame() {
		// 레이아웃 설정
		setLayout(new BorderLayout());

		// JLable 2개
		JLabel label1 = new JLabel("이름");
		JLabel label2 = new JLabel("주소");

		// JTextField 1개
		inputName = new JTextField(10);
		inputAddr = new JTextField(10);

		// JButton
		JButton insertBtn = new JButton("저장");
		JButton deleteBtn = new JButton("삭제");
		JButton updateBtn = new JButton("수정");

		// 버튼의 동작
		insertBtn.addActionListener((e) -> {
			// 입력한 이름과 주소를 읽어와서
			var name = inputName.getText();
			var addr = inputAddr.getText();

			// MemberDTO 객체에 이름과 주소 담기

			MemberDto dto = new MemberDto();
			dto.setName(name);
			dto.setAddr(addr);
			// MemberDao 객체를 이용해서 DB에 저장하기
			MemberDao dao = new MemberDao();
			var isSuccess = dao.insert(dto);
			if (isSuccess) {
				// 여기서 this는 나의 참조값(나=> MemberFrame 객체 => Component type 임)
				JOptionPane.showMessageDialog(this, "추가했습니다");
				// OptionPane.showmessagedialog ==> 메시지창 출력함 ==> Component의 참조값을 띄움 => 여기서는
				// this,"추가했습니다".
			} else {
				JOptionPane.showMessageDialog(this, "실패함");
			}

		});

		// 삭제 버튼 눌렀을 때 실행할 함수 등록
		deleteBtn.addActionListener((e) -> {
			// 테이블의 row를 눌러서 선택하는 변수
			int selectedRow = table.getSelectedRow();
			// 만일 선택된 row가 없다면
			if (selectedRow == -1) {
				JOptionPane.showMessageDialog(this, "삭제할 row를 선택해주세요");
				return; // 메소드를 여기서 끝내기(리턴하기)
			}

			// 삭제할 회원의 primary key 값(번호)를 읽어오기

			int num = (Integer) model.getValueAt(selectedRow, 0);

			// DB에서 삭제하기
			dao.deleteByNum(num);
			// 기존에 출력된 내용을 모두 삭제하고 싶을 때 이용하는 것

			printMember();
		});

		updateBtn.addActionListener((e) -> {

			// 테이블의 row를 눌러서 선택하는 변수
			int selectedRow = table.getSelectedRow();
			// 만일 선택된 row가 없다면
			if (selectedRow == -1) {
				JOptionPane.showMessageDialog(this, "수정할 row를 선택해주세요");
				return; // 메소드를 여기서 끝내기(리턴하기)
			}
			int num = (Integer) model.getValueAt(selectedRow, 0);
			// 입력한 이름과 주소를 읽어와서
			var name = inputName.getText();
			var addr = inputAddr.getText();

			// MemberDTO 객체에 이름과 주소 담기

			// 삭제할 회원의 primary key 값(번호)를 읽어오기

			MemberDto dto = new MemberDto();
			dto.setName(name);
			dto.setAddr(addr);
			dto.setNum(num);
			var isSuccess = dao.update(dto);

			if (isSuccess) {
				// 여기서 this는 나의 참조값(나=> MemberFrame 객체 => Component type 임)
				JOptionPane.showMessageDialog(this, "수정 했습니다.");
				// OptionPane.showmessagedialog ==> 메시지창 출력함 ==> Component의 참조값을 띄움 => 여기서는
				// this,"추가했습니다".
			} else {
				JOptionPane.showMessageDialog(this, "실패함");
			}

			// 기존에 출력된 내용을 모두 삭제하고 싶을 때 이용하는 것

			printMember();
		});

		// 패널에 UI 배치

		JPanel panel = new JPanel();
		panel.add(label1);
		panel.add(inputName);
		panel.add(label2);
		panel.add(inputAddr);
		panel.add(insertBtn);
		panel.add(deleteBtn);
		panel.add(updateBtn);
		// 패널의 배경색 설정
		panel.setBackground(Color.orange);

		// 패널을 프레임의 위쪽 배치
		add(panel, BorderLayout.NORTH);

		// 회원목록을 출력할 테이블
		table = new JTable();
		// 테이블의 칼럼명을 배열로 미리 준비한다
		String[] colName = { "번호", "이름", "주소" };
		// 테이블에 연결할 모델 객체
		model = new DefaultTableModel();
		// 모델에 칼럼멸을 전달한다
		model.setColumnIdentifiers(colName);

		// model을 테이블에 연결
		table.setModel(model);

		// table의 폰트
		table.getTableHeader().setFont(new Font("Sans-serif", Font.BOLD, 18));
		table.setFont(new Font("Sans-serif", Font.PLAIN, 16)); // 데이터 글자 크기 14
		table.setRowHeight(25); // 각 행의 높이를 조정

		// row 가 많은 경우 스크롤이 가능하도록 테이블에 scroll 기능 추가하기
		JScrollPane scroll = new JScrollPane(table);
		// 테이블을 품고 있는 JScrollPane을 프레임의 가운데에 배치하기
		add(scroll, BorderLayout.CENTER);

		// sample data를 table 에 출력하기
		// Object[] row1 = { 0, "sample name", "sample addr" };
		// model.addRow(row1);
		printMember();

	}

	// 회원 목록을 출력하는 메소드
	public void printMember() {
		model.setRowCount(0);
		// MemberDao 객체를 이용해서 회원목록을 얻어온 다음 실제 화면 목록을 table에 반복문 돌면서 출력해보세요.
		List<MemberDto> list = dao.selectAll();
		for (MemberDto tmp : list) {
			Object[] row = { tmp.getNum(), tmp.getName(), tmp.getAddr() };
			model.addRow(row);
		}

	}

	public static void main(String[] args) {

		MemberFrame f = new MemberFrame();
		f.setTitle("회원 정보");
		f.setBounds(100, 100, 800, 500);
		f.setDefaultCloseOperation(EXIT_ON_CLOSE);// 닫기 옵션
		f.setVisible(true);
	}

}
