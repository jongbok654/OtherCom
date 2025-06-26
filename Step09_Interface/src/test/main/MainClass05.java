package test.main;

import test.mypac.Drill;

public class MainClass05 {
	public static void main(String[] args) {

		Drill d1 = new Drill() {

			@Override
			public void hole() {
				System.out.println("구멍 뚫기");

			}
		};
		useDrill(d1);
		/*
		 * 여기는 팀원이 코딩한다고 가정 팀원이 직접 Drill type 객체를 생성해서 어디에 구멍을 뚫을지 마음대로 결정할 수 있다
		 */
		// 자바 스크립트처럼 화살표로 표현하기
		// ()->{}는 @Override된 메소드 이다!
		Drill d2 = () -> {

			useDrill(() -> {

				System.out.println("벽에 뚫기");
			});

		};
		Drill d3 = () -> {
			System.out.println("천장에 구멍 뚫기");
		};
		useDrill(d3);
		
		useDrill(()->{
			System.out.println("책상에 구멍뚫기");
		});

	}

	/*
	 * 
	 * useDrill() 기능을 만드는 프로그래머(팀장, 라이브러리 프레임워크 개발자)입장에서 생각해보기 Drill 인터페이스는 본인이 미리
	 * 만들어 놓은 상태 메소드 안에서 Drill 객체를 이용해서 어떤 복잡한 동작을 미리 만들어 놓을 수 있다.
	 */

	public static void useDrill(Drill d) {
		d.hole();

	}
}
