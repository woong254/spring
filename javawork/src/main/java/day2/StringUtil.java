package day2;

/**
 * @author jju
 * @since 1.4
 */
public class StringUtil {
	
	/**
	 * 주민번호로 출생년도 추출
	 * @param id 주민번호
	 * @return 년도 4자리
	 */
	public static String getYear(String id) {
		//id가 없으면 빈값 리턴
		if(id == null) {
			return "";
		} else {
			String result = id.substring(0, 4);
			return result;
		}
	}
	//년, 월, 일을 join
	public static String getDate(String ... date) {
		return String.join("-", date);
	}
	
	public static String getSplitYear(String date) {
		String[] result = date.split("-");
		return result[0];
		
	}
}
