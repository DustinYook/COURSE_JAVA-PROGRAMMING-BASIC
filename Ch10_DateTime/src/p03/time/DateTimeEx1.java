package p03.time;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class DateTimeEx1 
{
	public static void main(String[] args) 
	{
		LocalDateTime now = LocalDateTime.now();  // now()�� Ŭ���� �޼ҵ�
		DateTimeFormatter dtf = DateTimeFormatter.ofPattern("yyyy�� M�� d�� a h�� m��");
		String st = now.format(dtf);
		System.out.println(st);
	}
}
// java.time ��Ű�� �Ҽ� Ŭ���� (�ڹ� 8.0���� ����)
// LocalDate
// LocalDateTime
// LocalTime