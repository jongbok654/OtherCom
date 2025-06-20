package test.mypac;

public class Post {
	// 글번호를 지정할 필드
	public int id;
	// 글 내용을 저장할 필드
	public String content;
	// 글 작성자를 저장할 필드
	public String author;

	public void printData() {
		// format 사용 방식
		String data = String.format("번호: 이름: 주소: ", this.id, this.content, this.author);
		System.out.println(data);
	}
}
