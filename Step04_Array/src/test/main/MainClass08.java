package test.main;

import java.util.Random;

public class MainClass08 {
	public static void main(String[] args) {
		// String type 이 저장되어 있는 배열
		String[] data = { "🍒", ".", "🍌", "🍈", "7" };
		// 위의 배열에 저장된 5개의 무자열중에서 랜덤하게 한개만 콘솔창에 출력되도록
		Random ran = new Random();
		int index = ran.nextInt(data.length);

		// 랜덤한 요소 출력
		System.out.println("랜덤 출력: " + data[index]);
		
		//다른 방법으로 출력
		
		int ranNum=ran.nextInt(5);
		System.out.println(data[ranNum]);
		
	}
}
