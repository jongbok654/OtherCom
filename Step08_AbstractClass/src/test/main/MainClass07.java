package test.main;

import mypac.MyWeapon;
import mypac.SeaWeapon;
import mypac.Weapon;

public class MainClass07 {
	public static void main(String[] args) {
		/*
		 * 여기서 아래에 정의된 useWeapon() 메소드를 호출하려면?
		 */

		// MainClass07.useWeapon(null);
		// useWeapon(null);
		// ex)로 num과 String 예제도 있음

		useNum(5);
		useWeapon(new Weapon() {
			@Override
			public void attack() {
				System.out.println("공격함");
			}

		});

		/*
		 * 변수에 넣고 해보기
		 * 
		 */
		Weapon w1 = new Weapon() {
			@Override
			public void attack() {
				System.out.println("공격함2");
			}
		};
		useWeapon(w1);

		// 아래는 미리 생성해놨던 Weapon들을 사용함
		// 아래 Weapon들은 추상클래스인 Weapon을 이미 Override 해놓은 클래스들이기 때문에
		// 객체를 만들면 바로 사용 가능!!==>익명 클래스 안만들어도 됨
		Weapon w2 = new MyWeapon();

		useWeapon(w2);

		Weapon w3 = new SeaWeapon();

		useWeapon(w3);

	}

	public static void useWeapon(Weapon w) {
		w.attack();
	}

	public static void useNum(int num) {

		System.out.println(num);
	}

	public static void useString(String name) {
		System.out.println(name);
	}
}