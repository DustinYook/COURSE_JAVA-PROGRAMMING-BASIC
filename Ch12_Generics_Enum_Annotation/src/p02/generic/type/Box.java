package p02.generic.type;

public class Box<T> // <T>�� ��ǥ�� �ش�Ǵ� ����: �ϳ��� Ư��Ÿ���� �ƴ϶� �������� ���� �� �ִ� ��
{
	private T t;
	
	public T get() // getter()
	{
		return t;
	}
	
	public void set(T t) // setter()
	{
		this.t= t;
	}
}