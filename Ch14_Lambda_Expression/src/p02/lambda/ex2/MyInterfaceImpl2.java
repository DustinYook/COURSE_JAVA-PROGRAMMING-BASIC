package p02.lambda.ex2;

public class MyInterfaceImpl2 implements MyInterface2 
{
	@Override
	public void calculate(int x, int y) 
	{
		int result = x*y;
		System.out.println("계산결과는: " + result);
	}
}