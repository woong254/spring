package day1;

import java.util.HashSet;
import java.util.Set;

/*
 * 요구사항 :
 * 1. 난수 6개 생성해서 리스트에 저장
 * 2. 1~15
 * 3. 중복값 허용 ㄴㄴ
 */

public class 로또번호 {
	public static void main(String[] args) {
		//리스트 변수 선언 ==> 중복값 제거하려면 Set을 이용
		Set<Integer> lotto = new HashSet<Integer>();
		while(lotto.size() < 6) {
			//난수생성(1 ~ 15)
			//리스트에 추가 (add())
			lotto.add((int)(Math.random() * 15 + 1));
		}

		System.out.println(lotto);
		//결과출력
	}
}
