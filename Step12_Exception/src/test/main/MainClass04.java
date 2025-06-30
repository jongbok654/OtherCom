package test.main;

public class MainClass04 {
	public static void main(String[] args) {

		System.out.println("main 메소드 시작");

		try {
			/*
			 * Thread.slepp() 메소드 내부에서는 RuntimeException을 상속 받지 않은
			 * 
			 * InterruptedException이 발생한다. RuntimeException을 상속 받지 않은 예외는
			 * 
			 * 예외처리를 의무적으로 해야하는데, 이 때 처리하는 방법
			 * 
			 * 1.throw
			 * 
			 * 2.try-catch로 묶어주기
			 */
			Thread.sleep(5000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		System.out.println("main 메소드 종료");
	}
}
