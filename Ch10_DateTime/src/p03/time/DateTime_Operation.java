package p03.time;
import java.time.LocalDateTime;

public class DateTime_Operation 
{
	public static void main(String[] args) 
	{
		LocalDateTime now = LocalDateTime.now();
		System.out.println("����ð�: " + now);
		
		LocalDateTime target = now.plusYears(1).plusMonths(2).plusDays(3).plusHours(4).minusMinutes(5).plusSeconds(6);
		// ���� ��¥���� �ð��� ���ϰų� �� �� ��
		System.out.println("���� �� �ð�: " + target); // ���� �� �ð����
	}
}