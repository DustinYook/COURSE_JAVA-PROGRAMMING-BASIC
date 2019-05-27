package p08.interface_ex3;
// 다중 인터페이스 구현: 여러 인터페이스로부터 다중상속받음
public class ABDemo implements Ademo, Bdemo // 클래스의 경우 다중상속이 안되지만 인터페이스의 경우 다중상속이 가능
{
	@Override
	public void print() 
	{
		System.out.println("print() overriding");
	}

	@Override
	public void write() 
	{
		System.out.println("write() overriding");
	}
}