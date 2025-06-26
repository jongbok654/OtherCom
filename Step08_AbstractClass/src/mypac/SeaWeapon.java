package mypac;

public class SeaWeapon extends Weapon {

	@Override
	public void attack() {
		this.prepare();
		System.out.println("해상 공격");
	}
}
