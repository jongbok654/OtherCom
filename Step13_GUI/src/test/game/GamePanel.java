package test.game;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.Image;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseMotionAdapter;
import java.net.URL;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;

import javax.swing.ImageIcon;
import javax.swing.JPanel;
import javax.swing.Timer;

public class GamePanel extends JPanel {
	// 필요한 필드 정의
	Image backImage, missImage, juck1Image;// unitImage

	// 드래곤 Image 객체를 저장할 방 2개짜리 배열 객체 미리 준비
	Image[] unitImgs = new Image[2];

	// 드래곤이미지 인덱스
	int unitIndex;

	// 메소드 호출횟수를 누적할 필드
	int count;

	// 드래곤의 좌표
	int unitX = 0;
	int unitY = 0;

	// 적의 좌표
	int juck1X = 0;
	int juck1Y = 0;

	// 배경1의 y좌표
	int back1Y = 0;
	int back2Y = -800;

	int frameCount = 0; // 클래스 필드에 추가

	// Missile 객체를 누적시킬 ArrayList 객체
	List<Missile> missList = new ArrayList<>();
	private boolean juck1GoingRight;
	Random ran = new Random();

	// 생성자
	public GamePanel() {
		// 무언가 준비 작업 ...

		// Panel 의 크기 설정 width:500, height:800
		setPreferredSize(new Dimension(500, 800));

		// src/images/unit1.png 파일의 위치를 URL 객체로 얻어내기
		URL url = getClass().getResource("/images/images/unit1.png");

		// src/images/unit1.png 파일을 로딩해서 Image 객체로 만들기
		// unitImage = new ImageIcon(url).getImage();

		unitImgs[0] = new ImageIcon(getClass().getResource("/images/images/unit1.png")).getImage();
		unitImgs[1] = new ImageIcon(getClass().getResource("/images/images/unit2.png")).getImage();

		// 지역변수 만들 필요 없이 한번에 만들기
		backImage = new ImageIcon(getClass().getResource("/images/images/backbg.png")).getImage();

		// 미사일 이미지
		missImage = new ImageIcon(getClass().getResource("/images/images/mi2.png")).getImage();

		// 적 이미지(연습용)
		juck1Image = new ImageIcon(getClass().getResource("/images/images/juck1.png")).getImage();

		// Panel 이 포커스를 받을 수 있도록(key event 처리를 위해)
		setFocusable(true);
		requestFocusInWindow();

		// 키보드 입력 처리
		addKeyListener(new KeyAdapter() {
			@Override
			public void keyPressed(KeyEvent e) {
				// 스페이스바의 키 코드가 32이기 때문에 스페이스바를 누를 때만 실행함!
				if (e.getKeyCode() == 32) {
					// Missile 객체를 생성해서 현재 unit의 좌표를 담은 다음 list에 누적시키기
					Missile m = new Missile(unitX, unitY);
					missList.add(m);

				}
			}
		});
		MouseMotionAdapter adapter = new MouseMotionAdapter() {
			@Override
			public void mouseMoved(MouseEvent e) {
				// 마우수의 좌표
				int x = e.getX();
				int y = e.getY();
				// 테스트로 출력해보기
				// System.out.println(x + "||" + y);

				// 마우스의 좌표를 unit의 좌표에 반영하기
				unitX = x;
				unitY = y;

			}
		};
		// 마우스 움직임을 처리 하기 위한 code
		addMouseMotionListener(adapter);
		// Panel 이 10/1000 초 마다 다시 그려지게 하기위한 타이머 설정
		// 기본적으로 ActionListener는 1000분의 1로 되어있음
		// 따라서 10,람다식은 10/1000초인 것임.
		Timer timer = new Timer(10, (e) -> {
			// ActionListener는 함수 형태(람다식)으로 쓸 수 있음.

			repaint();
		});

		timer.start();
	}

	// Panel 에 무언가를 그릴때 호출되는 메소드
	// Panel 이 초기화 될때 한번 호출되고 그다음에는 repaint() 라는 메소드가 호출될때 마다 다시 호출된다.
	@Override
	protected void paintComponent(Graphics g) {
		super.paintComponent(g);
		// 메소드의 매개변수에 전달되는 Graphics 객체를 Panel 에 그림을 그릴수 있는 도구이다.

		
		count++;
		
		
		// 배경
		g.drawImage(backImage, 0, back1Y, 500, 800, this);
		g.drawImage(backImage, 0, back2Y, 500, 800, this);
		// g.drawImage(backImage, 0, back1Y-800, 500, 800, this); ==> 하나로만 하기

		// 반복문 돌면서 미사일 이미지 모두 그리기
		for (int i = 0; i < missList.size(); i++) {
			// i번 째 미사일 객체
			
			Missile tmp = missList.get(i);
			g.drawImage(missImage, tmp.getX() - 15, tmp.getY() - 20, 30, 40, this);

		}

		// 메소드의 매개변수에 전달되는 Graphics 객체를 Panel에 그림을 그릴 수 있는 도구이다.
		g.drawImage(unitImgs[unitIndex], unitX - 50, unitY - 50, 100, 100, this);

		g.drawImage(juck1Image, juck1X, juck1Y, 100, 100, this);

		// 테스트로 미사일의 갯수 표시
		g.setColor(Color.yellow);
		g.setFont(new Font("Arial", Font.BOLD, 20));
		g.drawString("Missile:" + count, 10, 20);

		
		//프레임
		
		if (count % 50 == 0) {

			// 드래곤 unitIdex 1 증가
			unitIndex++;
			if (unitIndex == 2) {
				unitIndex = 0;
			}
			
		}


		// -50 씩 함으로써 마우스의 정중앙에 오게 됨

		back1Y += 2;
		back2Y += 2;

		// 적의 좌우 왕복 이동
		if (juck1GoingRight) {
			juck1X += 1;
			if (juck1X >= 400) {
				juck1GoingRight = false; // 방향 반전
			}
		} else {
			juck1X -= 1;
			if (juck1X <= 0) {
				juck1GoingRight = true; // 다시 오른쪽으로
			}
		}

		// 프레임 카운트 증가
		frameCount++;

		// 일정 프레임마다 Y좌표를 0~100 사이로 바꿈
		if (frameCount % 10 == 0) {
			juck1Y = ran.nextInt(101); // 0~100 랜덤
		}

		// 모든 미사일의 y 좌표를 감소 시켜서 미사일이 위로 이동하도록 한다.

		for (Missile tmp : missList) {
			// 현재 y 좌표에서 10감소 시킨 값

			int resultY = tmp.getY() - 10;
			tmp.setY(resultY);

			if (tmp.getY() <= -20) {
				// 제거 하도록 표시해야 한다
				tmp.setRemove(true);
			}
		}

		// 반복문 돌면서 List에서 제거할 Missile 객체는 제거한다.
		for (int i = 0; i < missList.size(); i++) {
			// i 번째 missile 객체
			Missile tmp = missList.get(i);
			// 만일 i 번째 미사일 객체가 제거할 객체면
			if (tmp.isRemove()) {
				// list에서 i 번째 item을 제거한다
				missList.remove(i);
			}
		}

		if (back1Y >= 800) {
			back1Y -= 1600;
		}
		if (back2Y >= 800) {
			back2Y -= 1600;
		}
		/*
		 * 
		 * 하나로만 하기 if (back1Y >= 800) { back1Y = 0; }
		 */

	}
}
