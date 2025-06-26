package test.main;

import mypac.Zoo;
import mypac.Zoo.Monkey;
import mypac.Zoo.Tiger;

public class MainClass03 {
	public static void main(String[] args) {

		Zoo z1 = new Zoo();
		// Zoo 객체의 getMonkey() 메소드를 호출해서 얻어낸 Monkey 객체의 say() 메소드 호출하기
		Monkey m1 = z1.getMonkey();
		m1.say();
		// z1에 들어있는 참조값을 이용해서 Tiger 객체의 참조값을 얻어낸 다음 roar() 메소드를 호출해보세요

		// 위에 코딩보다 더 짧게 줄여 쓰는 방법
		z1.getTiger().roar();
		
		
		Zoo.Tiger t1=z1.getTiger();
		t1.roar();
		
		
		Tiger t2 = z1.getTiger();
		t2.roar();
	}
}
