package p01.date;
import java.text.SimpleDateFormat;
import java.util.Date;

public class DateEx1 
{
	public static void main(String[] args) 
	{
		Date now = new Date();
		String str = now.toString();
		System.out.println(str);
		System.out.println(now);
		
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy.MM.dd_HH:MM:ss"); // 자주 사용
		String st = sdf.format(now);
		System.out.println(st);
	}
}