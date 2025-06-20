package test.main;

import test.auto.Car;

public class MainClass02 {
public static void main(String[] args) {
	//Car type 객체의 참조값(id)를 담을 수 있는 비어 있는 변수 만듦
	Car c1=null;
	//Car 클래스로 객체 생성하고 할당된 참조값을 c1에 대입
	c1 = new Car();
	//c1에 들어 있는 참족밧을 이용해서 drive()메소드 호출
	c1.drive();
	
	Car c2=new Car();
	c2.drive();
	System.out.println("main 메소드가 종료 됩니다.");
}
}
