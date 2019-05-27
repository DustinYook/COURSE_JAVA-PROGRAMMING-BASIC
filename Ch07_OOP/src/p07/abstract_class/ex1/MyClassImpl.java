package p07.abstract_class.ex1;

public class MyClassImpl extends MyClass 
{
	@Override 
	public void methodB() // 부모클래스에서 abstract로 선언된 메소드
	{
		System.out.println("Overriden methodB()"); // 추상클래스로 선언된 클래스를 상속받아 재정의해서 사용
	}
}