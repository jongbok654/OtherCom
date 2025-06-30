package test.main;

import java.util.ArrayList;
import java.util.function.Consumer;

public class MainClass04 {
	public static void main(String[] args) {
		// 인사말을 담을 ArrayList 객체를 생성해서 참조값을 greets 라는 지역변수에 대입하기
		ArrayList<String> greets = new ArrayList<>();
		// greets에 들어 잇는 참조값을 이용해서 인사말 3개를 임의로 작성하기
		greets.add("hello");
		greets.add("hi");
		greets.add("good night");
		Consumer<String> con = (item) -> {
			System.out.println(item);
		};

		/*
		 * 매개변수의 갯수가 1개 일 때는
		 * 
		 * 
		 * 매개변수를 둘러싸는 ()는 생략 가능
		 * 
		 * 
		 * 매개변수의 이름은 마음대로 정할 수 있다(배열에 저장된t 이라는 의미에서 t으로 정렬)
		 * 
		 * 
		 * 함수안에서 실행할 code가 1줄 이거나 또는 리턴할 값만 명시 할 때는 { }도 생략 가능
		 * 
		 */

		greets.forEach(t -> System.out.println(t));

		System.out.println("========");

		// 위의 코드의 원래의 자바 코드 모습
		greets.forEach(new Consumer<String>() {
			@Override
			public void accept(String t) {
				System.out.println(t);
			}
		});

		// 원래 모양
		Consumer<String> con2 = new Consumer<String>() {
			@Override
			public void accept(String t) {

				System.out.println(t);
			}
		};

		/*
		 * .foreach() 메소드를 호출하면서 전달한 Cunsumer 객체의 accept()메소드가 배열에 저장ㅁ된 item 의 갯수만큼 호출되고
		 * 메소드의 매개 변수에는 배열에 저장된 아이템이 순서대로 변경된다.
		 */

		greets.forEach(con);
		System.out.println("----------");

		Consumer<String> con3 = (item) -> {
			System.out.println(item);
		};
		greets.forEach(con3);

		System.out.println("=========");

		greets.forEach((t) -> {
			System.out.println(t);
		});

	}
}
