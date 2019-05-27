package p11.innerclass.basic;

public class InnerClass // 외부 클래스
{
	public void method()
	{
		class Local // Local Inner Class: 메소드 안에 존재하는 클래스
		{
		}
	}
	
	class Inner1// Instance Inner Class: 클래스 안에 또 클래스가 있는 것
	{
	}
	
	static class Inner2 // Static Inner Class: static 키워드가 붙어 있는 경우
	{
	}
}