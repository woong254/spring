package day2;

public class StringUtillTest {
	public static void main(String[] args) {
		String year = StringUtil.getYear("19991127");
		System.out.println(year);
		
		String date = StringUtil.getDate("2025","10","29");
		System.out.println(date); // "2025-10-20"
		
		String regDate = "2025-10-10";
		String[] result = regDate.split("-");
		System.out.println(result[0]);
	}
}
