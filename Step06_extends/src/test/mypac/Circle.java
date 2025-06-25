package test.mypac;

//Shape는 default 생성자가 없으므로 그냥 상속은 불가능
public class Circle extends Shape {
	private int mm;

//그래서 아래처럼 생성자를 추가하면 상속이 가능함
	public Circle(int x, int y, int mm) {
		super(x, y);
		// super()는 부모 클래스의 생성자를 생성함
		this.mm = mm;
	}

	public void printArea() {
		double area = mm * mm*Math.PI;
		System.out.println("한변의 길이: " + mm + "이고  넓이는: " + area);
	}

	@Override
	public void printInfo() {
		super.printInfo();
		System.out.println("반지름은" + mm);
	}

}
