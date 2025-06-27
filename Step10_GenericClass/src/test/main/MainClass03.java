package test.main;

import test.fruit.Apple;
import test.mypac.Pair;

public class MainClass03 {
	public static void main(String[] args) {
		Pair<String, Object> p1 = null;
		Pair<Integer, String> p2 = null;
		// 기본 data tpye은 Generic 클래스로 사용할 수 있다.
		Pair<String, Apple> p3 = new Pair<String, Apple>("my", new Apple());
		
		// 객체 생성할 때는 제너릭은 생략 가능!!
		// ex)
		Pair<String, Apple> p33 = new Pair<>("my", new Apple());
	}

}
