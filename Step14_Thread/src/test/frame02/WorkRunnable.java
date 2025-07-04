package test.frame02;

/*
 * 1.Runnable 인터페이스를 구현한 클래스를 정의한다.
 * 
 * 2.run() 메소드를 강제 오버라이드 한다.
 * 
 * 3.Thread 클래스로 객체를 생성하면서 해당 클래스로 만든 객체를 생성자의 인자로 전달한다
 * 
 * 4.Thread 클래스로 만든 객체의 start() 메소드를 호출해서 스레드를 시작 시킨다.
 */
public class WorkRunnable implements Runnable {


	@Override
	public void run() {
		
		System.out.println("10초 걸리는 작업 실행");
		try {
			Thread.sleep(10000);
		} catch (InterruptedException e1) {
			e1.printStackTrace();
		}
		System.out.println("작업이 종료됨");
	}
	

}
