package p02.lambda.ex2;

public class MyInterfaceImpl2 implements MyInterface2 
{
	@Override
	public void calculate(int x, int y) 
	{
		int result = x*y;
		System.out.println("�������: " + result);
	}
}