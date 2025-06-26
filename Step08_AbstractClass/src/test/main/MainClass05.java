package test.main;

import mypac.Weapon;

public class MainClass05 {
	public static void main(String[] args) {

		/*
		 * 우주를 공격하고싶음 Weapon 추상 클래스를 상속 받은 클래스를 파일로 만들지 않고 Local Innere Class를 이용하여 쉽게
		 * 만들기
		 */

		class SpaceWeapon extends Weapon {

			@Override
			public void attack() {
				prepare();
				System.out.println("우주 공격");

			}

		}
		// 위에서 생서한 클래스로 객체를 생성
		Weapon w1 = new SpaceWeapon();
		// 메소드 호출
		w1.attack();
		// 변수를 생성 안하고 일회용으로 사용할 때 코딩 압축법
		new SpaceWeapon().attack();
	}
}
