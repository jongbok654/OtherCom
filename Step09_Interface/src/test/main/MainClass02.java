package test.main;

import test.mypac.MyRemocon;
import test.mypac.Remocon;

public class MainClass02 {
	public static void main(String[] args) {

		// 다형성 확인
		Object r1 = new MyRemocon();
		Remocon r2 = new MyRemocon();
		MyRemocon r3 = new MyRemocon();

		// useRemocon(r1); ==>Object 객체는 그냥 호출 불가함! ==>casting 해야 호출 가능!!
		useRemocon((Remocon) r1);

		useRemocon(r2);
		useRemocon(r3);
	}

	public static void useRemocon(Remocon r) {
		r.up();
		r.down();
	}
}
