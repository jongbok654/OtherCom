package test.main;

import java.io.IOException;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.io.PrintStream;

public class MainClass05 {
	public static void main(String[] args) {
		// 콘솔창에 출력할 수 있는 객체의 참조값 얻어내기
		PrintStream ps = System.out;
		// PrintStream 객체의 참조값을 부모 type 변수에 담기
		OutputStream os = ps;
		var osw = new OutputStreamWriter(os);
		//var osw = new OutputStreamWriter(new OupputStream(System.out));
		try {
			osw.write(97);// a
			osw.write(98);// b
			osw.write(99);// c
			osw.write(44032);// 가
			osw.write("분수");
			osw.write("\r\n");
			osw.write("피아노");
			osw.flush();// 출력
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}
