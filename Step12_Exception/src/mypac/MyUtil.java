package mypac;

import java.util.Random;

public class MyUtil {

	public static void generate() {
		Random ran = new Random();
		// 0~9 사이의 랜덤한 정수를 발생시키기
		int ranNum = ran.nextInt(10);

		// 만일 우연히 7이라는 숫자가 나오면
		if (ranNum == 7) {
			throw new WowException("7을 찾아냈습니다");
		}
		System.out.println(ranNum + "숫자가 나왔습니다.");
	}

	// 5초가 걸ㄹ는 가상의 그림을 그리는 메소드
	public static void draw() {
		System.out.println("5초 동안 그림을 그리시오...");
		try {
			Thread.sleep(5000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		System.out.println("그림 완성");
	}

	// 5초가 걸리는 가상의 전송을 하는 메소드
	public static void send() throws InterruptedException {
		System.out.println("5초동안 전송을 해요...");

		Thread.sleep(5000);

		System.out.println("전송 완료!");
	}
}
