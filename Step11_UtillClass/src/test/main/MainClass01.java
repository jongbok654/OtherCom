package test.main;

import java.util.ArrayList;

public class MainClass01 {
	public static void main(String[] args) {
		// java에서 배열은 용도가 한정되어 있다.item을 담을 수 있는 공간을 늘리거나 줄일 수 없다

		// 문자열(String) type을 담을 수 있는 열 5개 짜리 배열 객체 생성

		String[] names = new String[5];
		names[0] = "박종복1"
				+ "";
		names[1] = "박종복2";
		names[2] = "박종복3";

		// 아이템을 갯수 상관없이 필요에 따라 마음대로 추가하거나 제거할 수 있는 ArrayList
		ArrayList<String> friends = new ArrayList<>();

		// 박종복1,박종복2,박종복3을 순서대로 담아보기
		friends.add(names[0]);
		friends.add(names[1]);
		friends.add(names[2]);
		friends.add("박종복4");
		friends.add("박종복5");
		System.out.println(friends);

		// 0 변방의 아이템을 불러와서 item이라는 변수에 담기
		String item = friends.get(0);
		System.out.println(item);
		// 1 변방의 아이템을 삭제
		friends.remove(1);
		System.out.println(friends);
		// 저장된 아이템의 갯수(size)를 size 하는 지역 변수에 담기
		int size = friends.size();
		System.out.println(size);
		// 0변방에 "에이콘"을 끼워넉히
		friends.add(0, "에이콘");
		// 저장된 모든 아이템 전체 삭제
		friends.clear();
		System.out.println(friends);
	}
}
