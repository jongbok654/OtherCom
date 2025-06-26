package test.main;

import mypac.Weapon;

public class MainClass06 {
	public static void main(String[] args) {

		/*
		 * Cyber 공간을 공격하고 싶다 클래스 파일을 따로 만들기 싫다 =>Local Inner Class로 만들면된다.
		 * 
		 * 거기에 이름 만들기도 귀찮을 때 사용 방법=>Local Inner Class를 익명으로 만들어 사용
		 * 
		 */

		// 아래는 익명 클래스 사용법
		Weapon w1 = new Weapon() {

			@Override
			public void attack() {
				prepare();
				System.out.println("사이버 공격");
			}
		}; // ==> 클래스라서 {} 사용
		w1.attack();

		/*
		 * 가상공간을 공격해야함
		 * 
		 * 익명의 Local Inner Class를 이용해서 weapon type 객체를 생성해서 공격해야함
		 * 
		 * 1번만 공격해야함=>위에처럼 w1이라는 변수를 만들지 않고 1회용 객체를 만들어서 사용할 예정
		 * 
		 */

		new Weapon() {

			@Override
			public void attack() {
				prepare();
				System.out.println("가상공간 공격");
			}
		}.attack();
	}
}
