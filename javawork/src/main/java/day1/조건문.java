package day1;

/*
 * 근무시간이(9~18) 맞으면 Y / N
 */
public class 조건문 {
	public static void main(String[] args) {
		int workTime = 5;
		
		if(workTime >= 9 && workTime <=18) {
			System.out.println("근무시간입니다");
		} else {
			System.out.println("근무시간이 아닙니다");
		};
		
		int sTime = 10;
		int eTime = 22;
		
		if((eTime - sTime)-1 >= 9) {
			System.out.println("초과근무입니다");
		} else {
			System.out.println("정상근무입니다");
		}
			
	}
}
