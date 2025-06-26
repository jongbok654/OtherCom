package test.main;

import test.mypac.Operator;

public class MainClass07 {

	public static void main(String[] args) {

		// 더하기 연산을해서 결과값을 리턴해주는 Operator type 객체
		Operator plus = (double num1, double num2) -> {
			return num1 + num2;
		};

		Operator minus = (double num1, double num2) -> {
			return num1 - num2;
		};

		Operator multiply = (n1, n2) -> {
			return n1 * n2;
		};
		Operator multiply2 = (a, b) -> a * b;

		double result1 = plus.excute(5, 5);
		System.out.println(result1);
		
		useOperator(multiply2,5, 5);
	}

	public static void useOperator(Operator op,double num1,double num2) {
		double result=op.excute(num1, num2);
		System.out.println("결과:"+result);
	}

	

}

