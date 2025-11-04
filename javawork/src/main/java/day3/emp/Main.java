package day3.emp;

import java.util.Arrays;
import java.util.List;

public class Main {
	public static void main(String[] args) {
		
		List<Employee> list = Arrays.asList(
				new Employee(100, "고길동", 4100),
				new Employee(101, "정지웅", 4000),
				new Employee(102, "이상현", 3500)
				);
		
		EmployeeList empList = new EmployeeList(list);
		
		
		System.out.println(empList.findByid(101));
		System.out.println(empList.findByname("이상현"));
		System.out.println("============이름=============");
		System.out.println(empList.findOrderByName());
		System.out.println("============급여=============");
		System.out.println(empList.findOrderBySalary());
	}
}
