package test.main;

public class MainClass03 {
	public static void main(String[] args) {
		// String type을 담을 수 있는 null로 초기화된 방 3개짜리 배열객체 생성
		String[] names = { null, null, null };
		names[0] = "a";
		names[1] = "b";
		names[2] = "c";

		// String type을 담을 수 있는 null로 초기화된 방 100개짜리 배열 생성
		String[] names2 = new String[100];
	}
}
