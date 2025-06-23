package test.main;

public class MainClass01 {
	public static void main(String[] args) {
		/*
		 * in javascript// let nums=[10,20,30,40,50]; //nums[0] nums[1]
		 * 
		 * 
		 * in java //int[] nums={10,20,30,40,50};// nums[0]; nums[1];
		 */
		int[] nums = { 10, 20, 30, 40, 50 };
		// "가","나","다","라","마" 5개의 문자열 배열에 넣고
		// 그 참조값은 names라는 변수에 대입하기

		String[] names = { "가", "나", "다", "라", "마" };

		for (int i = 0; i < nums.length; i++) {
			System.out.println(nums[i]);
		}
		//names 배열에 저장된 문자열을 반복문 돌면서 콘솔창에 하나씩 순서대로 출력하기
	}
}
