package p01.object_equals;

public class Circle 
{
	int radius; // c1 = 5

	public Circle(int radius) // ������
	{
		this.radius = radius;
	} 
	
	@Override // equal()�� ������: �ּҰ� �񱳸� ���尪(����)�񱳷� ��ȯ
	public boolean equals(Object obj) // ��ǥ ��Ī�� �θ� Ŭ������ �� ���� 
	{
		// instanceof: ���������� �ش� Ŭ������ ����Ű���� �� 
		if(!(obj instanceof Circle)) // c2�� Circle�̶�� Ŭ������ ����Ű�� �ִ��� �Ǵ�
			return false;
		// �θ� Ŭ������ Ÿ���� �ڽ� Ŭ������ Ÿ�Ժ��� ŭ
	    Circle c = (Circle) obj; // �θ𿡰� �ڽ��� �Ȱ��� ���� => ���� ����ȯ (ū Ÿ���� ���� Ÿ������)
		
		if(this.radius == c.radius) // c1.radius == c2.radius
			return true;
		else
			return false;
	}
}