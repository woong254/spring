package calcurator;

public class Calcurator {
	double n1; // read, write
	private double result; // 캡슐화 read
	
	public Calcurator() {}

	public Calcurator(double n1) {
		this.n1 = n1;
	}
	
	//메서드 오버로딩(중복선언: 같은 이름 가능. 매개변수 타입,수 다름)
	public static double mul(double n1) {
		return n1*(Math.PI*n1);
	}

	public void mul() {
		result = n1*(Math.PI*n1);
	}
	
	public double getResult() {
		return result;
	}

	public void setResult(double result) {
		this.result = result;
	}

	public double getN1() {
		return n1;
	}
	
	//setter, getter
	

}
