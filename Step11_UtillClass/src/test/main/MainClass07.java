package test.main;

import java.util.List;

public class MainClass07 {
	public static void main(String[] args) {
		/*
		 * List<String> names = new ArrayList<>();
		 * 
		 * names.add("kim")
		 * 
		 * names.add("lee")
		 * 
		 * names.add("park")
		 * 
		 * 아래작업으로 대체
		 * 
		 */

		// 대신 이 list는 읽기 전용이다(수정,삭제,변경 불가) ==> list는 불변 컬렉션
		List<String> names = List.of("kim", "lee", "park");
	}
}
