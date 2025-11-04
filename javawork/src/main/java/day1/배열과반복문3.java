package day1;

import java.util.Arrays;
import java.util.List;

public class 배열과반복문3 {
	public static void main(String[] args) {
		List<Integer> score = (List<Integer>)Arrays.asList(94,100,86,52,65);
		//성적 5개
		int pass = 0;		
		//성적 출력
		for(int i=0; i < score.size(); i++) {
			System.out.print(score.get(i));	
			//통과여부 70점이상 success/ fail
			if(score.get(i) >= 70) {
				System.out.println(" 통과입니다.");
				pass++;
			} else {
				System.out.println(" 불통입니다.");
			}
		}
		System.out.println("통과된 건수는 "+pass+"건 입니다.");
	}
}
