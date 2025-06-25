package test.main;

public class MainClass02 {
	public static void main(String[] args) {
		// static 메소드라 함수 호출 가능
		sendMessage("Hello");
		sendMessage("Bye");
		// 메소드 호출하면서 String type 데이터를 직접 만들어서 전달

		String str = "박종복";
		// 이미 만들어진 변수에 있는 내용을 변수명으로 전달
		sendMessage(str);

	}

	public static void sendMessage(String msg) {
		System.out.println(msg + "를 전달했습니다");

	}
}
