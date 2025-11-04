package day2;

public class MethodTest {
	public static void main(String[] args) {
		printHead(); //매개변수 X 리턴 X
		printFoot();
		printString("정지웅");
		
		sum(5,4);
		int result = mul(5,4);
		
		System.out.println("1.총합= "+total(2,2,2)); 
		System.out.println("2.총합= "+total(2,4,6)); 
	}
	
	static int total(int ... score) {
		int result = 1;
		for(int sc : score) {
			result *= sc;
		}
		
		return result;
	}
	
	static void sum(int num1,int num2) {
		int result = num1 + num2;
		
		System.out.println(result);
		return;
	}
	
	static int mul(int num1, int num2) {
		int result = num1 * num2; 
		return result;
	}
	//중복되는 코드 => 메서드
	static void printHead() {
		System.out.println("============");
		System.out.println("===header===");
		System.out.println("============");
	}
	
	static void printFoot() {
		System.out.println("============");
		System.out.println("===footer===");
		System.out.println("============");
	}
	
	static void printString(String str) {
		System.out.println("============");
		System.out.println("==="+str+"===");
		System.out.println("============");
	}
}
