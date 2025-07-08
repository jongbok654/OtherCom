package test.main;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;

public class MainClass03 {
	public static void main(String[] args) {
		System.out.println("main 메소드 시작됨");
		// 1 byte 처리 스트림
		InputStream kbd = System.in;
		// 2 byte 처리 스트림(65536 가지 표한 가능) 한글 처리 가능한 객체
		var isr = new InputStreamReader(kbd);
		// BufferReader 의 생성자로 InputStreamReader 객체를 전달해서 객체 생성
		var br = new BufferedReader(isr);
		System.out.println("입력: ");
		//위를 한줄로 간략하게 코딩해보기
		//var br = new BufferedReader(new InputStreamReader(System.in));
		try {
			// 묹열을 한 줄 읽어들이기
			String line = br.readLine();
			System.out.println("line:" + line);

		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}
