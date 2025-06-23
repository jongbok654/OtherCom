package test.main;

import java.util.Random;

public class MainClass07 {
	public static void main(String[] args) {
		// Random 객체 생성
		Random ran = new Random();
		// nextInt(5)==> 0~4까지 랜덤한 숫자 출력
		int ranNum = ran.nextInt(5);
		System.out.println(ranNum);
	}
}
