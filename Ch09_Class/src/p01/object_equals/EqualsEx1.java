package p01.object_equals;

import java.util.GregorianCalendar;

// equals(): ��ü/���ڿ� �� �� ��� 
// == : ��ġ(��) �� �� ���
public class EqualsEx1 
{
	public static void main(String[] args) 
	{
		GregorianCalendar g1 = new GregorianCalendar(2017,06,27); // �ڹ� �����ڰ� ����� ���� Ŭ����
		GregorianCalendar g2 = new GregorianCalendar(2017,06,27);
		
		if(g1.equals(g2)) // �� �غ�
		{
			System.out.println("����");
			System.out.println("g1: " + g1);
			System.out.println("g2: " + g2);
		}
		else
			System.out.println("�ٸ�");
	}
}