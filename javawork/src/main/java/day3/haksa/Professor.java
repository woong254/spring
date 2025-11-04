package day3.haksa;

public class Professor extends Member {
	//필드
	private int salary;
	//생성자
	public Professor () {}
	public Professor(int no, String name, int salary) {
		this.no = no;
		this.name = name;
		this.salary = salary;
	}
	//getter/setter
	public int getSalary() {
		return salary;
	}
	public void setSalary(int salary) {
		this.salary = salary;
	}
	
}
