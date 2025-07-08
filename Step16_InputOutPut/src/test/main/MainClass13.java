package test.main;

import java.io.FileInputStream;
import java.io.FileOutputStream;

public class MainClass13 {
	public static void main(String[] args) {
		try {
			// 파일로 부터 byte 알갱이를 읽어들을 객체 생성
			var fis = new FileInputStream("c:/playground/SouthKorea.png");
			// byte 알갱이를 파일에 출력할 객체 생성
			var fos = new FileOutputStream("c:/playground/copied2.png");
			// byte 알갱이 1024 개를 한 번에 읽어들일 수 있는 배열 객체 생성(1 kilo byte를 한 번에 담을 수 있음)
			byte[] buffer = new byte[1024];
			
			
			// 반복문 돌면서
			while (true) {
				// byte[] 객체를 전닳서 배열에 읽어들이도록 하고 몇 byte 를 읽어 들였는지를 리턴받는다
				int readedCount = fis.read(buffer);
				if (readedCount == -1)
					break;
				// 배열안에 읽어들인 데이터를 읽은 갯수 만큼 출력하기

				// 0번에서 부터 읽어 들인 만큼 write 하겠다는 의미임.
				fos.write(buffer, 0, readedCount);
				fos.flush();

			}
			System.out.println("파일을 copy 했습니다");
			fos.close();
			fis.close();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
