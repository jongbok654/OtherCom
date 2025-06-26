package test.main;

import test.mypac.Person;
import test.mypac.Programmer;
import test.mypac.Singer;

public class MainClass08 extends Person {
	public static void main(String[] args) {

		Person p1 = new Person();

		p1.work();
		p1.sing();
		p1.develop();

		System.out.println("--------");

		Singer p2 = new Person();

		// Person 객체를 생성해서 Programmer type으로 받으면 develop() 메소드만 가능
		Programmer p3 = new Person();
		
		
		
	}

}
