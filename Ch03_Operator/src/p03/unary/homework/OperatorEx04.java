package p03.unary.homework;

public class OperatorEx04 
{
	public static void main(String[] args) 
	{
		int i = -10;
		i = +i; // ���� ��ȣ������: +(-10) = -10
		System.out.println(i);

		i = -10;
		i = -i; // ���� ��ȣ������: -(-10) = 10
		System.out.println(i);
   }
}