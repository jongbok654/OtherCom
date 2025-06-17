package test.main;

public class MainClass03 {
	public static void main(String[] args) {
		//for와 i++의 후순위 연산 예시
		for(int i=0;i<10;i++) {
			System.out.println(i);
		}
		System.out.println("===========");
		//콘솔창에 9부터 0까지 순서대로 출력되도록 for문
		for(int i=9;i>=0;i--) {
			System.out.println(i);
		}
		System.out.println("========");
		for(int i=9;i>=0;--i) {
			System.out.println(i);
		}
	}

}
