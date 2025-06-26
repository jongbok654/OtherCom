package test.main;

import test.mypac.Warmer;

public class MainClass06 {

	public static void main(String[] args) {

		Warmer w1 = new Warmer() {
			@Override
			public void warm(String target) {
				System.out.println(target + "을 따뜻하게 하기");
			}

		};

		useWarmer(w1);
		// 매개변수가 존재하기 때문에 아래처럼 하면 오류남!
		// Warmer w2=()->{};

		Warmer w2 = (String target) -> {
			System.out.println(target + "을 뜨겁게 하기");
		};
		useWarmer(w2);

		Warmer w3 = (t) -> {
			System.out.println(t + "을 더 뜨겁게 하기");
		};
		useWarmer(w3);
	}

	public static void useWarmer(Warmer w) {
		w.warm("손");
	}
}
