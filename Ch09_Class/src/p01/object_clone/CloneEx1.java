package p01.object_clone;
import java.util.GregorianCalendar;
//clone(): 객체를 복제하는 메소드

public class CloneEx1 
{
	public static void main(String[] args) 
	{
		GregorianCalendar g1 = new GregorianCalendar(2017,06,27);
//		GregorianCalendar g2 = g1.clone(); // g1 타입과 g2 타입이 다름
		GregorianCalendar g2 = (GregorianCalendar) g1.clone(); // g1 타입과 g2 타입이 다름
		
		System.out.printf("%tF\n", g1);
		System.out.printf("%tF\n", g2);
	}
}