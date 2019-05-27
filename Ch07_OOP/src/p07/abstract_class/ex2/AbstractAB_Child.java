package p07.abstract_class.ex2;

public class AbstractAB_Child extends AbstractB 
{
	@Override
	void methodB() 
	{
		System.out.println("Overriden methodB()");
	}

	@Override
	void methodA() 
	{
		System.out.println("Overriden methodA()");
	}
}