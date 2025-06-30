package test.main;

import java.util.ArrayList;
import java.util.Scanner;

public class MainClass02 {
	public static void main(String[] args) {
		// 정수를 저장할 수 있는 ArrayList<integer> 객체를 생성해서 참조값을 지역변수 nums에 담기
		ArrayList<Integer> nums = new ArrayList<>();

		// ArrayList 객체에 10,20,30, 숫자 3개를 담아보세요
		nums.add(10);
		nums.add(20);
		nums.add(30);
		// ArrayList 객체에 저장된 숫자를 for 문을 이용해서 순서대로 콘솔창에 출력해보세요
		for (int i = 0; i < 3; i++) {
			System.out.println(nums.get(i));
		}
		// 향상된 foreach 문
		for (int n : nums) {
			System.out.println(n);
		}

		ArrayList<String> kk = new ArrayList<>();
		for (int i = 0; i < 5; i++) {
			Scanner scan = new Scanner(System.in);
			System.out.println(i+"번째 문자열 입력하기:");
			String answer = scan.nextLine();
			kk.add(answer);
			

		}
		for (String i:kk) {
			System.out.println("입력된 문자열 출력 :"+i);
		}
		

	}
}
