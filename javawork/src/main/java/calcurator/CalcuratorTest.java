package calcurator;

public class CalcuratorTest {
	public static void main(String[] args) {
		Calcurator cal = new Calcurator(10);
		
		// 정적메서드 호출(클래스이름으로 접근. 객체생성안함)
		double result = cal.mul(10);
		System.out.println(result);
	}
}
