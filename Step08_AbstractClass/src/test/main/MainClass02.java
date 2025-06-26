package test.main;

import mypac.MyWeapon;
import mypac.SeaWeapon;
import mypac.SkyWeapon;
import mypac.Weapon;

public class MainClass02 {
	public static void main(String[] args) {
		Weapon w1 = new SkyWeapon();
		w1.attack();
		// 지상 공격을 하는 Weapon type 객체
		Weapon w2 = new MyWeapon();
		w2.attack();
		
		/*
		 * 해상 공격을 하는 WEapon type 객체를 만들어서 .attack() 메소드를 호출했을 때 해상공격이
		 * 되도록 구현해보세요
		 * 
		 * 단) 기존에 만든 SkyWeapon,MyWeapon,Weapon 클래스를 수정하지 마세요
		 * 새로운 클래스를 만들어서 구현하세요
		 */
		
		Weapon w3=new SeaWeapon();
		w3.attack();
	}
}
