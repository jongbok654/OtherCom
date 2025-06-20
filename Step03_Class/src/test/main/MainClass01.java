package test.main;
//File 클래스 쓸 때 필요함
import java.io.File;
//createNewFile 할 때 필요
import java.io.IOException;
//java.util 페키지에 있는 Random 클래스를 import 
import java.util.Random;
import java.util.Scanner;

public class MainClass01 {
	public static void main(String[] args)throws IOException {
	
		String name = "park";
		int num; // 선언만 하면 변수가 만들어지지 않음(만들어질 준비만 함)
		num = 10;// 값을 넣는 시점에 변수가 만들어 짐
		// 랜덤한 숫자를 얻어내기 ==>Random+Ctrl+space로 자바 유틸 랜덤
		Random ran = null;
		ran = new Random();
		System.out.println(ran);
		System.out.println("=======");
	

		boolean result1 = ran.nextBoolean();
		System.out.println(result1);

		int result2 = ran.nextInt();
		System.out.println(result2);
		// 콘솔창에 문자열 출력하기

		// 파일 시스템에 memo.txt 파일을 만들기
		File f=new File("C:/playground/memo.txt");
		f.createNewFile();
	
		
		Scanner scan=new Scanner(System.in);
		String line=scan.nextLine();
		System.out.println("main 메소드가 종료 됩니다.");
		// 콘솔창에 입력한 숫자나 문자열을 읽어들이고 싶다면,콘솔창에 입력한 내용을 이용해서 int나 String을
		// 만들어내는 기능을 가지고 있는 객체 필요
	}
}
