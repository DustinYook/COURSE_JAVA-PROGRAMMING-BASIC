package p03.modifier_private;

public class ModifierEx1 
{
	public static void main(String[] args) 
	{
		Circle c = new Circle(2.0);
//		c.radius = 5.0; // ��������� private�� �����Ǿ����Ƿ� ��Ʈ�����ڷ� ���ٺҰ�
		double result = c.getArea();
		System.out.println("���� ����: " + result);
	}
}