package p01.object_clone;
import java.util.GregorianCalendar;
//clone(): ��ü�� �����ϴ� �޼ҵ�

public class CloneEx1 
{
	public static void main(String[] args) 
	{
		GregorianCalendar g1 = new GregorianCalendar(2017,06,27);
//		GregorianCalendar g2 = g1.clone(); // g1 Ÿ�԰� g2 Ÿ���� �ٸ�
		GregorianCalendar g2 = (GregorianCalendar) g1.clone(); // g1 Ÿ�԰� g2 Ÿ���� �ٸ�
		
		System.out.printf("%tF\n", g1);
		System.out.printf("%tF\n", g2);
	}
}