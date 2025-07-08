package test.main;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;

public class MainClass10 {
	public static void main(String[] args) {
		File f = new File("memo.txt");
		try {
			// 파일로 부터 문자열을 읽어들일 수 있는 객체 생성
			var fr = new FileReader(f);
			// 좀 더 좋은 기능을 가지고 있는 BufferedReader 객체 생성
			var br = new BufferedReader(fr);

			// 무한 루프 돌기
			while (true) {

				// 한 줄씩 읽어낸다(1줄의 기준은 개행기호)
				String line = br.readLine();
				// 더이ㅣ상 읽을 line 이 없으면 반복문 탈출
				if (line == null)
					break;
				// 읽은 문자열 출력하기
				System.out.println(line);
			}
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}
