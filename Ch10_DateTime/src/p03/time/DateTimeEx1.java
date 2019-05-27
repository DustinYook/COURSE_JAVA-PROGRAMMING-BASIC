package p03.time;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class DateTimeEx1 
{
	public static void main(String[] args) 
	{
		LocalDateTime now = LocalDateTime.now();  // now()는 클래스 메소드
		DateTimeFormatter dtf = DateTimeFormatter.ofPattern("yyyy년 M월 d일 a h시 m분");
		String st = now.format(dtf);
		System.out.println(st);
	}
}
// java.time 패키지 소속 클래스 (자바 8.0에서 등장)
// LocalDate
// LocalDateTime
// LocalTime