package test.main;

import java.io.File;
import java.io.FileReader;
import java.io.IOException;

public class MainClass09 {
	public static void main(String[] args) {
		File f = new File("memo.txt");
		try {
			// 파일로 부터 문자열을 읽어들일 수 있는 객체 생성
			var fr = new FileReader(f);
			// 무한 루프 돌기
			while (true) {
				// 한 글자씩 읽어듥인다(문자라 code 값임 !!!)
				int code = fr.read();
				// 만일 더이상 읽을 문자가 없다면
				// FileReader의 read라는 메소드 자체가 파일에 더이상 읽을 문자열이 없으면
				// -1을 return 하는 메소드이기 때문에 code가 -1이면 반복문을 하게함!ㄴ
				if (code == -1)
					break;
				// code를 문자로 변환
				char ch = (char) code;
				// 출력
				System.out.println(ch);
			}
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}
