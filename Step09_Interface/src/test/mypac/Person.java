package test.mypac;

public class Person implements Singer, Programmer {

	public void work() {
		System.out.println("일을 합니다");
	}

	@Override
	public void sing() {
		System.out.println("노래");

	}

	@Override
	public void develop() {
		System.out.println("개발");

	}
}
