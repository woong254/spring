package day3.emp;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class 스트림 {
	public static void main(String[] args) {
		String[] strArr = {"키위", "포도", "바나나", "사과", "감", "사과"};
		Stream.of(strArr).sorted().limit(3).forEach(e -> System.out.println(e));
		
		//사과가 몇개 있나? filter count
		long cnt = Stream.of(strArr).filter((apple)-> apple.equals("사과")).count();
		System.out.println("사과는 "+cnt+"개 입니다");
		
		List<Employee> list = Arrays.asList(
				new Employee(100, "고길동", 4100),
				new Employee(101, "정지웅", 4000),
				new Employee(102, "이상현", 3500)
				);
		//급여합계
		long sum = list.stream().mapToLong(e -> e.getSalary()).sum();
		
		System.out.println("급여 합계는: "+sum);
	}
}
