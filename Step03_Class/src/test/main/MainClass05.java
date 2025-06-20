package test.main;

import test.util.MyUtil;

public class MainClass05 {
	public static void main(String[] args) {
		// static 필드 참조
		String a = MyUtil.version;
		// static 메소드 호출
		MyUtil.send();
//u1.owner와 u2.owner의 id값이 다름 => 서로 고유한 객체 저장소를 가지고 있음
		MyUtil u1 = new MyUtil();
		u1.owner = "박종복";

		MyUtil u2 = new MyUtil();
		u2.owner = "가가가";

	}
}
