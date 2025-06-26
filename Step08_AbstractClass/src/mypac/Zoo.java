package mypac;

public class Zoo {
	public class Monkey {
		public void say() {
			System.out.println("원숭이");
		}
	}

	public class Tiger {
		public void roar() {
			System.out.println("어흥");
		}
	}

	// 메소드 (호출되면 Monkey 객체를 생성해서 리턴해주는 메소드)
	public Monkey getMonkey() {
		return new Monkey();
	}
	
	public Tiger getTiger() {
		return new Tiger();
	}
}
