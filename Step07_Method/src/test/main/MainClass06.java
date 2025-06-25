package test.main;

import test.mypac.ZzangGu;

public class MainClass06 {
	public static void main(String[] args) {
		/*
		 * ZzangGu 객체를 3개 생성해서 배열에 담은다음 반복문 돌면서 배열에 담긴 ZzanGu 객체의 dance() 메소드를 모두 호출하기
		 */

		ZzangGu ZZ1 = new ZzangGu();
		ZzangGu ZZ2 = new ZzangGu();
		ZzangGu ZZ3 = new ZzangGu();

		ZzangGu[] arr = { ZZ1, ZZ2, ZZ3 };

		for (int i = 0; i < 3; i++) {
			arr[i].dance();
		}
	}
}
