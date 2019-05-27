package p01.object_clone;

public class Rectangle implements Cloneable // Cloneable�̶�� �������̽��� �����ؾ� ��������
{
	int width, height;

	public Rectangle(int width, int height) 
	{
		this.width = width;
		this.height = height;
	}
	
	@Override // ����� ������ ��� ������ �ʿ�
	protected Object clone() // throws CloneNotSupportedException // �ܺη� ���� => �� �޼ҵ带 ȣ���� �Ϳ��� ���ܸ� ����
	{
		try 
		{
			return super.clone();
		} 
		catch (CloneNotSupportedException e) 
		{
			return null;
		}
	}
}