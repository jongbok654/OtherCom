package test.main;


import test.mypac.Circle;
import test.mypac.Rect;
import test.mypac.Shape;

public class MainClass07 {
	public static void main(String[] args) {
		// Shape 객체 생성
		Shape s1 = new Shape(100, 100); // Shape는 default 생성자가 없기 때문에 값을 넣어야 객체 생성됨!
		s1.printInfo();

		Circle c1 = new Circle(20, 300, 10);
		c1.printArea();
		c1.printInfo();
		
		System.out.println("=========");
		Rect r1 = new Rect(100,200,50);
		r1.printArea();
		r1.printInfo();
	}
}
