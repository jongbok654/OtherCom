package test.main;

public class MainClass11 {
	public static void main(String[] args) {

		int i = 0;
		while (i < 5) {
			System.out.println(i + "번 반복합니다");
			i++;
		}

		System.out.println("=========");

		int j = 0;
		while (true) {
			System.out.println(j + "번 반복합니다");
			j++;
			if(j==0) {
				break;
			}
		}
	}
}
