package test.auto;
/*
 * Class의 역할
 * 1.객체의 설계도 역할
 * -객체는 heap 영역에 들어 있는 물건이라고 생각함
 * Class를 이용해서 객체를 원하는 시점에 원하는 갯수 만큼 만들어 낼 수 있다
 * 만들어진 객체가 어떤 저장소와 어떤 기능을 가지게 할지 class로 설게 할 수 있다
 * 
 * 2. data type 역할
 * 
 * 3.static 필드와 메소드를 포함하는 역할
 */

import java.util.Random;

public class Car {
	//차의 이름을 저장할 필드 만들기(필드는 지역변수가 아님,객체 고유의 저장소입니다)
	public String name;
	//차의 가격을 저장할 필드 만들기
	public int price;
	//객체를 만들기 위해서는 생성자가 필요함!!!
	public Car(){
		Random ran = new Random();
		price=ran.nextInt();
		
	}
	
	public void drive() {
		System.out.println(this.name+"달려요");
	}
	public void carprice() {
		System.out.println("가격은"+price);
	}
}
