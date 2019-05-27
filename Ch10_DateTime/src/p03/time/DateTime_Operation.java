package p03.time;
import java.time.LocalDateTime;

public class DateTime_Operation 
{
	public static void main(String[] args) 
	{
		LocalDateTime now = LocalDateTime.now();
		System.out.println("현재시간: " + now);
		
		LocalDateTime target = now.plusYears(1).plusMonths(2).plusDays(3).plusHours(4).minusMinutes(5).plusSeconds(6);
		// 현재 날짜에서 시간을 더하거나 뺄 수 있
		System.out.println("연산 후 시간: " + target); // 연산 후 시간출력
	}
}