package test.main;

import test.auto.Car;
import test.util.MyUtil;

public class MainClass06 {
	public static void main(String[] args) {
		// MyUtil에서 Car의 초기값은 설정해놓지 않았기 떄문에 일단 값은 null임 ==> c1.drive()같은 메소드 불가능
		Car c1 = MyUtil.car;
		// Car 객체를 생성해서 MyUtil 클래스의 car라는 필드에 담기
		MyUtil.car = new Car();
		// c1은 위에서 생성한 Car 객체의 참조값이 들어 있다.
		Car c2 = MyUtil.car;
		c2.drive();
		

		MyUtil.car.drive();
		// 예시를들면 System.out.println()
		// ==> 시스템이라는 클래스의 out타입의 필드의 println메소드 실행
		MyUtil.send();
		MyUtil.car.carprice();
		c2.carprice();
	
	}
}
