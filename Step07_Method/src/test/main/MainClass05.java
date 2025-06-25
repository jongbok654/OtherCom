package test.main;

import test.mypac.Messenger;
import test.mypac.Post;

public class MainClass05 {
	public static void main(String[] args) {
		// Messenger type 객체의 sendPost() 메소드를 호출하기
		// 실행했을 때 Exception이 발생하지 않아야 함

		Messenger mm = new Messenger();
		mm.sendPost(new Post(5, "박종복책", "박종복"));
	}
}
