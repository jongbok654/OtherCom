package test.main;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class MainClass07 {
	public static void main(String[] args) {
		// 새로운 파일을 만들어서 문자열을 기록하는 예제를 만들고자 한다.
		// 파일에 저장할 문자열
		String msg = """
				가나다
				라마바

				""";

		File f = new File("memo.txt");
		try {
			// 만일 해당 파일이 존재하지 않으면
			if (!f.exists()) {
				// 새로 만들기
				f.createNewFile();
				System.out.println("memo.txt 파일을 만들었습니다.");
			}
			// 파일에 문자열을 출력하는 기능을 가지고 있는 객체 생성
			var fw = new FileWriter(f,true);
			// 여기서 fw.append는 String타입을 반환하지 않는데 어떻게 이용한걸까?
			// String은 CharSequence 타입이기 떄문 ==> CharSequence는 문자열을 받는다. ==>그래서 String을 fw.apeend의 값으로 받을 수 있음!!
			fw.append(msg);
			fw.flush();
			fw.close();
			System.out.println("memo.txt 파일에 문자열을 기록 했습니다.");
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}
