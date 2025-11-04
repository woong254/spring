package day3.emp;

import java.util.List;
import java.util.stream.Collectors;

//테이블 전체 레코드 담기
//등록, 수정, 삭제, 조회 ,전체조회 .정렬
public class EmployeeList {
	
	List<Employee> list;
	
	public EmployeeList(List<Employee> list) {
		this.list = list;
	}
//전체조회
	public void selectAll() {
		for(Employee emp : list) {
			System.out.println(emp);
		}
	}
//등록
	public void insert(Employee employee) {
		list.add(employee);
	}
//사번 조회(find)
	public Employee findByid(int id) {
		for(Employee emp : list) {
			if(id == emp.getEmployeeId()) {
				return emp;
			}
		}
		return null;
	}
//이름 조회(find)
	public Employee findByname(String firstName) {
		return list.stream()
				.filter((Employee e) ->  firstName.equals(e.getFirstName()))
				.findFirst()
				.get();
	}
	
//검색(filter)
	public List<Employee> findBySalary(int salary) {
		return list.stream()
				.filter((Employee e) -> e.getSalary() > salary )
				.collect(Collectors.toList());
	}
	
//정렬 (이름순으로 정렬)
	public List<Employee> findOrderByName() {
//		return list.stream()
//				.sorted((Employee a, Employee b) -> a.getFirstName().compareTo(b.getFirstName()))
//				.collect(Collectors.toList());
		list.sort(( o1,  o2)-> o1.getFirstName().compareTo(o2.getFirstName()));
		return list;
	}	
//정렬 (급여순으로 정렬)
	public List<Employee> findOrderBySalary() {
//			return list.stream()
//				.sorted((Employee a, Employee b) -> (int)(a.getSalary() - b.getSalary() ))
//				.collect(Collectors.toList());	
		list.sort((o1,o2)-> (int)(o2.getSalary() - o1.getSalary()));
		return list;
	}
//수정
	
//삭제
	
	
	
}

