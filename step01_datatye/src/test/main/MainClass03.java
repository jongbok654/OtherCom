package test.main;

public class MainClass03 {
public static void main(String[] args) {
	boolean isRun=false;
	
	if (isRun) {
		System.out.println("달려요");
	}
	//비교 연산의 결과로 얻어진 boolean 값 담기
	boolean isGreater =10>1;
	//논리 연산의 결과로 얻어진 boolean 값 담기
	boolean result=true||false;
	//한번 선언한 변수는 다시 선언 할 수 없다
	//boolean result=false;
	result=false; // 변수에 다른 값을 대입 할 수 있다(동인할 type인 경우에만)
	System.out.println(result);
}
}
