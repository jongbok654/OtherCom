package test.main;

import test.mypac.MyRemocon;
import test.mypac.Remocon;

public class MainClass01 {
	public static void main(String[] args) {
		Remocon r1 = null;

		// 인터페이스 type의 참조값이 필요하면 해당 인터페이스를 implements 한 하위 클래스를 이용해서 얻어낸다
		Remocon r2 = new MyRemocon();
		r2.up();
		r2.down();

		// 인터페이스가 가지고 있는 상수 참조(static final)
		String a = Remocon.COMPANY;
	}

}
