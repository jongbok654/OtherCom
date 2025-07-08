package test.main;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class MainClass15 {
	public static void main(String[] args) {
		// 필요한 객체를 담을 변수를 미리 만든다

		try {
			var fis = new FileInputStream("c:/playground/SouthKorea.png");
			var fos = new FileOutputStream("c:/playground/copied3");
			// byte 알갱이 1024 개를 한번에 읽어들일수 있는 배열 객체 생성 (1 kilo byte)
			byte[] buffer = new byte[1024];

			// 반복문 돌면서
			while (true) {
				// byte[] 객체를 전달해서 배열에 읽어들이도록 하고 몇 byte 를 읽어 들였는지를 리턴받는다.
				int readedCount = fis.read(buffer);
				// 만일 더이상 읽을 byte 가 없다면 반복문 탈출
				if (readedCount == -1)
					break;
				// 배열안에 읽어들인 데이터를 읽은 갯수 만큼 출력하기
				fos.write(buffer, 0, readedCount);
				fos.flush();
			}
			System.out.println("파일을 copy 했습니다");
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}