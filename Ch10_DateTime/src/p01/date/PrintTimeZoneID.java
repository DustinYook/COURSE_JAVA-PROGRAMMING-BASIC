package p01.date;
import java.util.TimeZone;

public class PrintTimeZoneID 
{
	public static void main(String[] args) 
	{
		String avail[] = TimeZone.getAvailableIDs(); // �� ������ timezone�� ���
		for(String id : avail)
			System.out.println(id);
	}
}