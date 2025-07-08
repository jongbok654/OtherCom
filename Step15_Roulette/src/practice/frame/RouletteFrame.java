package practice.frame;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.JTextField;
import javax.swing.table.DefaultTableModel;

import practice.dao.RouletteDao;
import practice.dto.RouletteDto;

public class RouletteFrame extends JFrame {
	private JTable table;
	private DefaultTableModel model;
	private JLabel resultLabel;
	private JButton insertButton;
	private JButton sqlinsertBtn;
	// private Random random = new Random();
	private RouletteDto[] data = new RouletteDto[4];
	// private String[] addresses = new String[4]; // 이름과 같은 인덱스에 주소 저장
	private int currentIndex = 0;

	// 이름과 주소 입력 필드
	private JTextField nameField, addrField;

	public RouletteFrame() {

		setTitle("친구 주소 저장하기!");
		setSize(500, 300);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setLocationRelativeTo(null);
		setLayout(new BorderLayout());
		// 테이블 구성
		model = new DefaultTableModel(1, 4); // 6열 7행
		table = new JTable(model);
		table.setRowHeight(50);

		table.setFont(new Font("맑은 고딕", Font.BOLD, 16));
		table.setCellSelectionEnabled(true);

		JScrollPane scrollPane = new JScrollPane(table);

		// 입력 필드와 버튼
		JPanel inputPanel = new JPanel(new FlowLayout());
		nameField = new JTextField(10);
		addrField = new JTextField(15);
		insertButton = new JButton("삽입");
		sqlinsertBtn = new JButton("sql 삽입");

		inputPanel.add(new JLabel("이름:"));
		inputPanel.add(nameField);
		inputPanel.add(new JLabel("주소:"));
		inputPanel.add(addrField);
		inputPanel.add(insertButton);

		// 결과 라벨
		resultLabel = new JLabel("이름을 클릭하면 주소가 나옵니다.", JLabel.CENTER);
		resultLabel.setFont(new Font("맑은 고딕", Font.BOLD, 14));

		add(scrollPane, BorderLayout.CENTER);
		add(resultLabel, BorderLayout.SOUTH);
		JPanel panel = new JPanel();
		panel.add(inputPanel);
		panel.add(sqlinsertBtn);
		add(panel, BorderLayout.NORTH);
		panel.setBackground(Color.orange);

		insertButton.addActionListener(e -> {
			String name = nameField.getText();
			String addr = addrField.getText();

			RouletteDto dto = new RouletteDto();
			dto.setName(name);
			dto.setAddr(addr);
			// RouletteDao객체 이용해서 Db 저장하기
			RouletteDao dao = new RouletteDao();
			var isSuccess = dao.insert(dto);
			if (isSuccess) {
				// 여기서 this는 나의 참조값(나=> MemberFrame 객체 => Component type 임)
				JOptionPane.showMessageDialog(this, "추가했습니다");
				// OptionPane.showmessagedialog ==> 메시지창 출력함 ==> Component의 참조값을 띄움 => 여기서는
				// this,"추가했습니다".
			} else {
				JOptionPane.showMessageDialog(this, "실패함");
			}

			dto.setNum(currentIndex);
			dto.setAddr(addr);

			data[currentIndex] = dto;
			model.setValueAt(name, 0, currentIndex); // 테이블에는 이름만 표시

			currentIndex++;
			nameField.setText("");
			addrField.setText("");
		});

		// 이름 클릭 시 주소 출력
		table.addMouseListener(new MouseAdapter() {
			public void mouseClicked(MouseEvent e) {
				int col = table.getSelectedColumn();
				Object value = table.getValueAt(0, col);
				if (value != null) {
					resultLabel.setText("집 주소: " + data[col].getAddr());
				}
			}
		});

		setVisible(true);

	}

	public static void main(String[] args) {
		RouletteFrame R = new RouletteFrame();
		R.setTitle("친구 주소 저장하기!");
		R.setSize(500, 300);
		R.setDefaultCloseOperation(EXIT_ON_CLOSE);
		R.setLocationRelativeTo(null);
		R.setLayout(new BorderLayout());
	}
}
