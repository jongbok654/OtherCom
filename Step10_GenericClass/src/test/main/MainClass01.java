package test.main;

import test.box.AppleBox;
import test.fruit.Apple;

public class MainClass01 {
	public static void main(String[] args) {
		//Apple 객체를 생성해서 AppleBox 객체에 담아 보세요
		Apple A = new Apple();
		AppleBox AB=new AppleBox();
		
		//객체를 다 생성해서 다회성!
		AB.pack(A);
		
		//AB변수에 1회용 사과
		AB.pack(new Apple());
		//1회용
		new AppleBox().pack(new Apple());
	}
}
