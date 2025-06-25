package test.main;

import test.company.Department;
import test.company.Employee;

public class MainClass10 {
	public static void main(String[] args) {
		Department d1 = new Department("영업부", "대전");
		/*
		 * 위의 부서에서 근무하는 사원(Employee) 객체 3개를 만들어서 그 참조값 3개를 배열에 순서대로 넣어 보세요.
		 */

		Employee emp1 = new Employee("가", 1000, d1);
		Employee emp2 = new Employee("나", 1000, d1);
		Employee emp3 = new Employee("다", 1000, d1);

		Employee[] arr = { emp1, emp2, emp3 };
		//다른 방법
		Employee[] arrs = new Employee[3];
		arrs[0]=emp1;
		arrs[1]=emp2;
		arrs[2]=emp3;
		
		//for 문 이용해서 Employee[]에 담긴 Employee 객체의 .printInfo() 메소드 순서대로 출력하기
		for(int i=0;i<3;i++) {
			arr[i].printInfo();
		}
		System.out.println("===========");
		//Java에서의 향상된 for문 ==> 좀 더 간편하고 짧음!
		for (Employee e:arr) {
			e.printInfo();
		}
	}
}
