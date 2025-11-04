package day1;

public class 배열과반복문2 {
	public static void main(String[] args) {
		//성적 5개
		int[] score = {94,100,86,52,65};
		int pass = 0;		
		//성적 출력
		for(int ofscore : score) {
			System.out.print(ofscore);	
			//통과여부 70점이상 success/ fail
			if(ofscore >= 70) {
				System.out.println(" 통과입니다.");
				pass++;
			} else {
				System.out.println(" 불통입니다.");
			}
		}
		System.out.println("통과된 건수는 "+pass+"건 입니다.");
	}
}
