package test.main;

import test.auto.Car;

public class MainClass03 {
public static void main(String[] args) {
	Car c1=new Car();
	String name=c1.name;
	int price=c1.price;
	//Car 객체의 필드에 값 대입해보기
	c1.name="Sonata";
	c1.price=3000;
	//담은 후에 참조되는 값을 지역변수에 담아보기
	String name2=c1.name;
	int price2=c1.price;
	System.out.println(name2);
	System.out.println(price2);
}
}
