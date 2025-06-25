package test.main;

import test.mypac.Item;

//private로 변수를 선언해서 참조할 수 없기 때문에 get,set 이용!
public class MainClass11 {
	public static void main(String[] args) {
		Item item = new Item();
		item.setName("전자시계");

		// Item 객체에 저장된 상품의 이름을 불러와서(참조해서) 활용하려면
		// 1.특정 변수에 담고 싶다
		// 2.어딘가에 전달하고 싶다
		// 3.콘솔창에 출력하고 싶다.
		String a = item.getName();// 출력할 때 이용(getName은 return값이기 때문에)
		System.out.println(a);
	}
}
