package day2;

import java.time.LocalDate;
import java.util.Calendar;

public class DateUtill {
	public static void main(String[] args) {
		Calendar cal = Calendar.getInstance();
		System.out.println(cal.get(Calendar.DAY_OF_YEAR)); 
		
		LocalDate date = LocalDate.now();
		System.out.println(date);
		
		LocalDate birth = LocalDate.of(1999, 11, 27);
		System.out.println(birth);
	}
}
