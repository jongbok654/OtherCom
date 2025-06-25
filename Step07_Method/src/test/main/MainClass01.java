package test.main;

public class MainClass01 {
	// static 영역에 만들어지는 main()메소드
	public static void main(String[] args) {

		System.out.println("main 메소드 시작됨");
		MainClass01.test();
		//동일한 클래스 안에 있는 static 메소드는 클래스명. 을 생략 가능
		test();

		System.out.println("main 메소드 종료됨");
	}

	private static void test() {
		System.out.println("test() 메소드 출력됨");
	}
}
