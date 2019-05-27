package p08.interface_ex2;

public class DemoImpl implements Demo 
{
	@Override
	public void print() 
	{
		System.out.println("print() overriding");
	}
	
	public void write()
	{
		System.out.println("write()");
	}

}
