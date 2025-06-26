//이 클래스가 속해있는 패키지 명시하기(없으면 에러)
package test.main;
//클래스 안에서 사용하는 다른 클래스나 인터페이스 import

public class TestMain {// 클래스의 범위를 나타내는 중괄호 "시작"

	/*
	 * 클래스 안에 무언가를 정의 할 때는 클래스 안에 속해 있다는 의미에서 들여 쓰기를 한다
	 * 
	 * 클래스 안에 정의할 수 있는 것은
	 * 
	 * 1.필드,static 필드 2.메소드,static 메소드 3.생성자 4.순서가 정해진 것은 아니지만 보통 필드 => 생성자 => 메소드
	 * 순으로 정의함!!
	 */

	// 필드
	public String name = "박종복";

	// Static 필드
	public static String yourName = "박종복2";

	// 생성자 (메소드와 닮아 있지만 return type이 없고 클래스명과 동일해야함
	public TestMain() {
		// 여기는 생성자 내부 (생성자 내부라는 의미에서 들여쓰기를 함
		// 어디에선가 new TestMain()해서 개게를 생성하면 여기가 실행됨!!
		System.out.println("TestMain 생성자 호출");
	}

	// 메소드
	public void test() {
		// 여기는 메소드 내부
		// 어디에선가 이클래스(TestMain)으로 생성된 객체의 test() 메소드를 호출하면 여기 실행
		System.out.println("메소드 호출");
		// 메소드 안에는 지역변수를 만들 수 있다(메소드는 만들 수 없음!!!)
	}

	// static 메소드
	public static void doSomething() {
		// .찍어서 호출할 수 있는 메소드
		System.out.println("doSOmething()메소드 호출됨");
	}

	public static void main(String[] args) {
		// 메인이되는 main 메소드
	}

}// 클래스의 범위를 나타내는 중괄호 "끝"
