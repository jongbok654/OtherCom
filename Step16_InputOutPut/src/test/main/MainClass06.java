package test.main;

import java.io.BufferedWriter;
import java.io.IOException;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.io.PrintStream;

public class MainClass06 {
	public static void main(String[] args) {
		// 콘솔창에 출력할 수 있는 객체의 참조값 얻어내기
		PrintStream ps = System.out;
		// PrintStream 객체의 참조값을 부모 type 변수에 담기
		OutputStream os = ps;
		var osw = new OutputStreamWriter(os);
		// var osw = new OutputStreamWriter(new OupputStream(System.out));
		var bw = new BufferedWriter(osw); // bw는 BufferedWriter이기 때문에 문자열 출력 가능!
		try {
			bw.write("하나");
			bw.newLine();
			bw.write("두울");
			bw.newLine();
			bw.write("세엣");
			bw.newLine();
			bw.flush();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}
