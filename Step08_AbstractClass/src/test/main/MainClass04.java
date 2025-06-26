package test.main;

public class MainClass04 {
	public static void main(String[] args) {

		/*
		 * 메소드 안에 클래스를 정의 할 수도 있다 .
		 * 
		 * 메소드 안에서만 사용할 수 있다 .
		 * 
		 * 지역 내부클래스(Local inner Clas)라고 칭한다.
		 */

		class Cat {
			public void say() {
				System.out.println("야옹");
			}
		}
		// Local Inner Class로 객체 생성 가능
		Cat c1 = new Cat();
		c1.say();
	}
}
