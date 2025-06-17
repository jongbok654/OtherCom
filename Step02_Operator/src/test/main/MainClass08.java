package test.main;

public class MainClass08 {
public static void main(String[] args) {
	//for문 이용해서 합산
	int sum=0;
	for(int i=1;i<101;i++) {
		sum+=i;
	}
	System.out.println(sum);
	System.out.println("====");
	int sum1=0;
	for(int i=0;i<100;i++) {
		sum1+=i+1;
		
	}
	System.out.println(sum1);
}
}
