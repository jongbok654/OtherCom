package test.main;

import mypac.MyUtil;

public class MainClass06 {
	public static void main(String[] args) {
		MyUtil.draw();
		// send()는 throw이기 때문에 메인에서 처리 해줘야함!!!
		try {
			MyUtil.send();
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		// 스태틱 메소드이기 때문에 .으로 실행
		MyUtil.generate();
	}
}
