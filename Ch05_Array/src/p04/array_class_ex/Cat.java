package p04.array_class_ex;

public class Cat 
{
	// ������� ����
	String name;
	String kind;
	
	// ������ ����
	public Cat(String n, String k) 
	{
		// super();
		this.name = n;
		this.kind = k;
	}
	
	@Override // ������(�������̵�)
	public String toString() 
	{
		return name + "�� " + kind + "�Դϴ�.";
	}
}