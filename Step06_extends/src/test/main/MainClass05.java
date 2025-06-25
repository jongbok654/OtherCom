package test.main;

import test.mypac.HandPhone;
import test.mypac.SmartPhone;

public class MainClass05 {
	public static void main(String[] args) {
		SmartPhone p1 = new SmartPhone();
		p1.call();
		p1.mobileCall();
		p1.TakePicture();
		p1.doInternet();

		System.out.println("-----------");
		// Smartphone 객체를 생성해서 HandPhone type으로 받은다음
		HandPhone p2 = new SmartPhone();
		// 사진을 찍으면 몇 화소 일까?
		p2.TakePicture();
		// HandPhone 클래스를 받는 p2를 SmartPhone 객체로 생성하기 때문에 => SmartPhone의 TakePicture 메소드를
		// 실행함 ==> 1억 화소 출력

		System.out.println("-------");
		HandPhone p3 = new HandPhone();
		p3.TakePicture();
		// 핸드폰 자체만 확인하면은 그냥 "사진 찍음"이 출력됨
	}
}
