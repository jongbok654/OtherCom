package test.main;

import java.util.ArrayList;
import java.util.List;

import test.box.AppleBox;
import test.box.FruitBox;
import test.fruit.Apple;
import test.fruit.Banana;

public class MainClass02 {

	public static void main(String[] args) {

		// Apple을 담을 용도로 사용할 fruitbox 객체 생성하기
		FruitBox<Apple> box1 = new FruitBox<Apple>();
		// Banana 담는 fruitbox
		FruitBox<Banana> box2 = new FruitBox<Banana>();

		box1.pack(new Apple());
		box2.pack(new Banana());
		
		//ArrayList 연습했던 거
		List<AppleBox>boxes=new ArrayList<>();
		for(int i=0;i<20;i++) {
			AppleBox box = new AppleBox();
			box.pack(new Apple());
			boxes.add(box);
			
			System.out.println(i+"번째 박스");
			
			
		}
	}
}
