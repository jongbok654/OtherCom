package test.company;

public class Employee {
	private String name;
	private int salary;
	private Department dept;

	public Employee(String name, int salary, Department dept) {
		this.name = name;
		this.salary = salary;
		this.dept = dept;
	}

	// 텍스트 메소드
	public void printInfo() {
		System.out.println("이름: " + name);
		System.out.println("연봉: " + salary);
	}
}
