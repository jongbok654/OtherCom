package test.main;

public class MainClass09 {
public static void main(String[] args) {
	//1~100까지 짝수들의 총합
	
	int sum=0;
	for(int i=1;i<51;i++) {
		sum+=i*2;
		
	}
	System.out.println(sum);
	System.out.println("=======");
	int result=0;
	for(int i=0;i<=100;i++) {
		if(i%2==0) {
			result+=i;
		}
	}
	System.out.println(result);
}
}
