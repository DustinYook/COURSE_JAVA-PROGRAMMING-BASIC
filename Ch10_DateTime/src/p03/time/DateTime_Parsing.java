package p03.time;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class DateTime_Parsing 
{
	public static void main(String[] args) 
	{
		DateTimeFormatter dtf; // 객체생성하고는 다름; 선언만 한 것임
		LocalDate ld;
		
		ld = LocalDate.parse("2024-06-28");
		System.out.println(ld); 
		
		dtf = DateTimeFormatter.ISO_LOCAL_DATE;
		ld = LocalDate.parse("2024-06-28", dtf);
		System.out.println(ld);
		
		dtf = DateTimeFormatter.ofPattern("yyyy/MM/dd");
		ld = LocalDate.parse("2024/06/28", dtf);
		System.out.println(ld);
	}
}
// 미러 사이트: 전세계 여러지역에서 사용하기 때문에 parse()를 이용하여 하나의 형식으로 통일시킴
// 내일은 collection을 할 예정 => 자료구조관련