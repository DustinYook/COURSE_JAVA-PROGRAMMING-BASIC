package p01.lambda.ex1;
//인터페이스를 구현한 클래스를 생성
public class MyInterfaceImpl implements MyInterface // MyInterface를 구현한 클래스
{
	@Override // 가장 오래된 방법을 통해서,즉,객체를 생성해서 사용하는 방법 => 이 방법을 쓰지 않으려고 함
	public void sayHello() 
	{
		System.out.println("MyInterface를 구현");
	}
}