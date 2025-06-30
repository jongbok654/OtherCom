package test.main;

import mypac.MyUtil;
import mypac.WowException;

public class MainClass07 {
	public static void main(String[] args) {
		System.out.println("main 메소드 시작됨");
		try {
			MyUtil.generate();
		} catch (WowException we) {
			System.out.println("WowException 발생함");
			System.out.println("예외 메시지:" + we.getMessage());
		}

		System.out.println("main 메소드가 종료됨");
	}
}
