package test.main;

public class MainClass01 {
	public static void main(String[] args) {
		int num1 = 5;
		int num2 = 2;
		// + 연산 하기
		int sum = 10 + 1;
		int sum2 = num1 + num2;
		int num3 = 10 + num2;
		// 함수끼리 연산하면 결과는 함수만 나온다
		int result = 5 / 3;
		int result2 = num1 / num2;
		// 연산의 결과로 실수 값을 얻어내고 싶으면 적어도 하나는 실수여야 함
		double result3 = 5 / 3.0;
		//double result3 = 5/(double)3;
		int result4 = 10 % 3;
		byte a = 10;
		//a는 byte type인데 btye인데 a에 저장된 값을 int type b에 대입하는건 괜찮을까?
		int b = a;
		//b는 int type 인데 b에 저장된 값을 byte type c에 대입하는건 문제가 생김 => 값이 넘침
		//b 자체는 int type이지만 (byte)연산자로 casting 하면
		//대입연산자의 우측에는 byte type이 있다고 간주되어서문법이 성립한다.
		//대신 b 안에 들어있는 값이 byte 범윙ㄴ에 들어 있다는 것이 확실할 때만 casting 해야지 오류가 없다
		byte c=(byte)b;
		int d= 1000;
		byte e=(byte)d;
		// 값이 byte 허용값을 넘기 때문에 오류값이 나옴 .
		System.out.println(e);

	}
}
