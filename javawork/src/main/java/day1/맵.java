package day1;

import java.util.HashMap;
import java.util.Set;

public class 맵 {
	public static void main(String[] args) {
		HashMap<Integer,String> map = new HashMap<Integer, String>();
		
		//추가
		map.put(100, "홍길동");
		map.put(101, "나길동");
		map.put(102, "김길동");
		
		//삭제
		map.remove(101);
		System.out.println("삭제 후: "+map);
		
		//변경
		map.put(102, "이순신");
		System.out.println("변경 후: "+map);
		
		//검색
		System.out.println("102번 사원은 "+ map.get(102));
		
		//전체조회 -> key 전체를 list로 변환
		Set<Integer> keys = map.keySet();
		for(Integer key : keys) {
			System.out.println(key + " : " + map.get(key));
		}
	}
}
