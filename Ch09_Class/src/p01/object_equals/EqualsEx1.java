package p01.object_equals;

import java.util.GregorianCalendar;

// equals(): 객체/문자열 비교 시 사용 
// == : 수치(값) 비교 시 사용
public class EqualsEx1 
{
	public static void main(String[] args) 
	{
		GregorianCalendar g1 = new GregorianCalendar(2017,06,27); // 자바 개발자가 만들어 놓은 클래스
		GregorianCalendar g2 = new GregorianCalendar(2017,06,27);
		
		if(g1.equals(g2)) // 비교 해봄
		{
			System.out.println("같음");
			System.out.println("g1: " + g1);
			System.out.println("g2: " + g2);
		}
		else
			System.out.println("다름");
	}
}