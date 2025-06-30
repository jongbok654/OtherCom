package test.main;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Random;
import java.util.Set;

public class MainClass12 {
	public static void main(String[] args) {
		// 1. 로또 번호를 담을 HashSet 객체를 생성해서 Set type set1이라는 지역 변수에 담아 보세요

		// 2.Random 객체를 생성해서 참조값을 ran 이라는 지역변수에 담아 보세요.

		/*
		 * 3.while 문을 이용해서 랜덤한 로또 번호를 set1에 반복적으로 담아보세요
		 * 
		 * while문은 무한 루프로 만들고 while문 탈출 조건은 set1.size()가 6이 되면 탈출되도록 해보세요.
		 * 
		 * ran.nextInt(45)+1은 1~45 사이의 랜덤한 정수를 얻어낼 수 있습니다
		 * 
		 * 로또 번호는 총 6개입니다.
		 * 
		 * 4.set1에 담긴 번호를 모두 하나의 콘솔창에 출력해 보세요
		 * 
		 * 5.AI에 물어봐서 set1에 담긴 내용을 List에 담은 다음 오름차순 정렬해 보세요
		 * 
		 * 6.오름차순 정렬된 번호를 하나씩 순서대로 콘솔창에 출력해 보세요.
		 */
		Random ran = new Random();
		Set<Integer> set1 = new HashSet<>();

		while (set1.size() < 6) {
			set1.add(ran.nextInt(45) + 1);
		}
		// 순서대로 출력
		set1.forEach((item) -> {
			System.out.println(item);

		});

		System.out.println("===============");

		List<Integer> list = new ArrayList<>(set1);
		// 정렬 ==> Collections,, sort=>오름차순
		Collections.sort(list);

		System.out.println(list);

		// 하나씩 출력
		list.forEach((item) -> System.out.println(item));
	}
}
