package p03.modifier_private;

public class Circle 
{
	// private: Ŭ���� �ȿ����� ��밡��
	// private double radius; 
	double radius;
	
	public Circle(double r) // ������ 
	{
		this.radius = r; 
	}
	
	double getArea() // �ν��Ͻ� �޼ҵ� // �����ڰ� ����Ʈ: ���� ��Ű������ ���ٰ���
	{
		double area;
		area = 3.14*(radius*radius);
		return area;
	}
}