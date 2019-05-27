package p01.date;
import java.util.TimeZone;

public class PrintTimeZoneID 
{
	public static void main(String[] args) 
	{
		String avail[] = TimeZone.getAvailableIDs(); // 각 지역의 timezone을 출력
		for(String id : avail)
			System.out.println(id);
	}
}