package test.main;

/*
 * java에서 객체는 여러개의 type을 가질 수 있다
 * 
 * ==> 다형성을 가질 수 있다 ==> type이 여러개라는 의미
 */
import test.mypac.HandPhone;
import test.mypac.Phone;

public class MainClass02 {
	public static void main(String[] args) {
		HandPhone p1 = new HandPhone();
		// HandPhone 객체를 생성해서 나온 참조값을 Phone type 지역변수 p2에 담기
		Phone p2 = new HandPhone();
		// HandPhone 객체를 생성해서 나온 참조값을 Object type 지역변수 p3에 담기
		Object p3 = new HandPhone();

	}
}
