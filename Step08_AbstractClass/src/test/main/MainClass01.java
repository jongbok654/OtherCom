package test.main;

import mypac.MyWeapon;
import mypac.Weapon;

public class MainClass01 {
	public static void main(String[] args) {
		// 추상 클래스도 data type의 역할을 할 수가 있다.

		Weapon w1 = null;

		// 그렇다면 Weapon type의 참조값은 어떻게 얻어내나?
		// Weapon 추상클래스를 상속받은 MyWeapon 클래스의 객체로 만듦 =>이 때 MyWeapon은
		// @Override로 추상 메소드를
		// 재정의 해야함

		Weapon w2 = new MyWeapon();
		w2.prepare();
		w2.attack();
	}
}
