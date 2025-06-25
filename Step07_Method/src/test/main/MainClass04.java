package test.main;

import test.mypac.Post;

public class MainClass04 {
	public static void main(String[] args) {
		// sendPost() 메소드 호출

		Post p1 = new Post(1, "c", "d");
		sendPost(new Post(5, "a", "b"));
		sendPost(p1);
	}

	public static void sendPost(Post post) {
		System.out.println(post.getId() + "\n" + post.getTitle() + "\n" + post.getAuthor() + "글꼴 전송했습니다");

	}

}
