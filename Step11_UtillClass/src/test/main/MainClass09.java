package test.main;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;
import java.util.function.Consumer;

public class MainClass09 {
	public static void main(String[] args) {
		/*
		 * HashSet 은 Set 인터페이스를 구현한 클래스 이다
		 * 
		 * -순서가없다
		 * 
		 * -key값도 없다
		 * 
		 * -중복을 허용하지 않는다
		 * 
		 * -어떤 data를 묶음(집합)으로 관리하고자 함께 사용된다
		 */

		// 정수를 저장할 수 있는 HashSet 객체를 생성해서 참족밧을 Set 인터페이스 type 지역변수에 담기

		Set<Integer> set1 = new HashSet<>();
		set1.add(10);
		set1.add(10);
		set1.add(20);
		set1.add(20);
		set1.add(30);
		set1.add(30);
		set1.add(40);
		set1.add(40);

		// 문자열을 저장할 수 있는 HashSet 객체
		Set<String> set2 = new HashSet<>();

		set2.add("a1");
		set2.add("a2");
		set2.add("a3");
		set2.add("a4");
		set2.add("a5");
		set2.add("a6");
		set2.add("a7");

		// Set 객체에 저장된 모든 아이템을 순서를 보장할 수는 없지만 모두 참조해서 사용해보기
		set1.forEach((item) -> {
			System.out.println(item);
		});
		// set1은 Set<Integer>이기 때문에 item은 Integer type이다.

		System.out.println("=========");

		// set2는 item은 String type
		set2.forEach((item) -> {
			System.out.println(item);
		});

		System.out.println("=============");
		set2.forEach(new Consumer<String>() {
			@Override
			public void accept(String t) {

			}

		});

		// Iterator를 사용하는 구조도 연습해보기

		Iterator<String> it = set2.iterator();

		while (it.hasNext()) {

			// 다음 item을 얻어낸다(item의 type은 Iterator의 Generic type 이다
			String item = it.next();

			// 얻어낸 item을 사용하고 또 다음 item 이 있는지 위에서 확인이 된다.
			System.out.println(item);
		}

	}
}
