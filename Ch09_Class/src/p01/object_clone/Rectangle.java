package p01.object_clone;

public class Rectangle implements Cloneable // Cloneable이라는 인터페이스를 구현해야 복제가능
{
	int width, height;

	public Rectangle(int width, int height) 
	{
		this.width = width;
		this.height = height;
	}
	
	@Override // 사용자 정의의 경우 재정의 필요
	protected Object clone() // throws CloneNotSupportedException // 외부로 돌림 => 이 메소드를 호출한 것에게 예외를 던짐
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