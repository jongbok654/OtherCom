package test.main;

public class MainClass03 {
	public static void main(String[] args) {
		// printSum() 메소드 3번 호출
		printSum(1, 1);
		printSum(2, 2);
		printSum(3, 3);

	}

	public static void printSum(int num1, int num2) {
		int result = num1 + num2;
		System.out.println(num1 + "과 " + num2 + "의 합은:" + result);
	}
}
