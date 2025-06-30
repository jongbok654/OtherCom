package test.main;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class MainClass10 {
	public static void main(String[] args) {
		// Set 클래스의 of()라면 static 메소드를 이용해서 read only Set 객체를 만들 수 있따
		Set<String> set1 = Set.of("A", "B", "C", "D");
		Set<String> set2 = Set.of("E", "F", "G", "H");

		// 중복된 데이터가 들어있는 List
		List<String> names = List.of("park", "lee", "kim", "lee");

		// List는 Collection type 이기도 하다 (collection은 부모 type이다)
		Collection<String> collec = names;

		// HashSet 객체의 생성자에 List를 전달해서 HashSet 객체 생성(중복이 제거된다!!!)
		Set<String> namesSet = new HashSet<String>(names);

		// ArrayList 객체의 생성장에 Set을 전달해서 ArrayList 객체 생성(인덱스로 관리할 수 있따.
		List<String> names2 = new ArrayList<String>(namesSet);

	}
}
