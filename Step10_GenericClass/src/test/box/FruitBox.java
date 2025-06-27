package test.box;

//Generic 클래스 T를 전달 받을 수 있는 클래스 설계하기
public class FruitBox<T> {
	//를 필드의 type으로 활용
	private T item;

	//T를 매개변수의 type으로 활용
	public void pack(T item) {
		this.item = item;
	}

	//T를 메소도의 리턴 type으로 활용
	public T unpack() {
		return item;
	}
}
