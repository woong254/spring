package day1;

public class 배열과반복문 {
	public static void main(String[] args) {
		//성적 5개
		int[] score = {94,100,86,52,65};
		int pass = 0;		
		//성적 출력
		for(int i=0; i < score.length; i++) {
			System.out.print(score[i]);	
			//통과여부 70점이상 success/ fail
			if(score[i] >= 70) {
				System.out.println(" 통과입니다.");
				pass++;
			} else {
				System.out.println(" 불통입니다.");
			}
		}
		System.out.println("통과된 건수는 "+pass+"건 입니다.");
	}
}
