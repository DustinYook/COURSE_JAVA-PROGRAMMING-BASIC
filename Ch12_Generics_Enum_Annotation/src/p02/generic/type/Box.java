package p02.generic.type;

public class Box<T> // <T>는 대표에 해당되는 변수: 하나의 특정타입이 아니라 여러개를 받을 수 있는 것
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