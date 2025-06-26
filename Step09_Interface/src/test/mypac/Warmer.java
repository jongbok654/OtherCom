package test.mypac;

//함수 형태로 쓰기위한 이노테이션(메소드 1개가 강제된다) ==>메소드가 1개가 넘으면 에러남!!
@FunctionalInterface
public interface Warmer {

	public void warm(String target);
	//@FunctionalInterface를 선언하면 반드시 메소드는 1개만 있어야함!
}
