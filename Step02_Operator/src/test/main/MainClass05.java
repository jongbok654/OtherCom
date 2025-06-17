package test.main;
//논리 연산자 테스트
public class MainClass05 {
public static void main(String[] args) {
	boolean result1=false||false;
	boolean result2=false||true;
	boolean result3=true||false;
	boolean result4=true||true;
	
	System.out.println(result1);
	System.out.println(result2);
	System.out.println(result3);
	System.out.println(result4);
	
	boolean result5=false&&false;
	boolean result6=false&&true;
	boolean result7=true&&false;
	boolean result8=true&&true;
	
	System.out.println("==========");
	
	System.out.println(result5);
	System.out.println(result6);
	System.out.println(result7);
	System.out.println(result8);
	
	//not 연산
	
	boolean result9=!true;
	boolean result10=!false;
	
	System.out.println("========");
	System.out.println(result9);
	System.out.println(result10);
}
}
