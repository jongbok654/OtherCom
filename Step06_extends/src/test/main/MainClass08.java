package test.main;

import test.company.Department;
import test.company.Employee;

public class MainClass08 {
	public static void main(String[] args) {
		/*
		 * 사원의 이름: 박종복
		 * 
		 * 급여:1000
		 * 
		 * 부서명:교육부
		 * 
		 * 부서의 위치:역삼동
		 * 
		 * 위의 정보를 가지는 Employee 객체를 생성해서 그 참조값을 emp 라는 지역 변수에 담아보세요
		 * 
		 * Department,Employee 클래스를 수정하라는 말이 아님!
		 * 
		 * 여기 아래에 단지 2줄의 코딩만 하면됨
		 * 
		 * 메소드를 호출하라고 한 적도 없음
		 */
		Department dept1 = new Department("교육부", "역삼동");
		Employee emp1 = new Employee("박종복", 1000, dept1);
		emp1.printInfo();
		/*
		 * 위에서 생성한 부서와 동힐한 부서에서 근무하는 사원(Employee)객체를 하나 더 생성 해보세요
		 * 
		 * 사원 이름:가나다
		 * 
		 * 급여:2000
		 */
		Employee emp2 = new Employee("가나다", 2000, dept1);
		emp2.printInfo();
		/*
		 * 사원이름:주댕이 :급여:3000 부서 이름 :SALES 부서 위치: LA 위의 정보를 가지는 Employee 객체를 생성하여 1줄 코딩
		 */

		Employee emp3 = new Employee("주댕이", 3000, new Department("SALES", "LA"));
	}
}