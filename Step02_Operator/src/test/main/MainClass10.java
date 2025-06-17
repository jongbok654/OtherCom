package test.main;

public class MainClass10 {
	public static void main(String[] args) {
		// 3항 연산자 예시

		boolean isWait = false;
		String result = isWait ? "기다려요" : "기다리지 말아요";
		System.out.println(result);

		String result2 = null;
		if (isWait) {
			result2 = "기다려요";
		} else {
			result2 = "기다리지 말아아요";
		}
		System.out.println(result2);
	}
}
