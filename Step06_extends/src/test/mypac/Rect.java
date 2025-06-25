package test.mypac;

public class Rect extends Shape {
	private int radius;

	public Rect(int x, int y, int radius) {
		super(x, y);
		this.radius = radius;
	}

	public void printArea() {
		int area = radius * radius;
		System.out.println("넓이는:" + area);
	}

	@Override
	public void printInfo() {
		System.out.println("좌표:" + x + " " + y + "한변의 길이:" + this.radius);
	}
}
