package p02.throw_new;

public class ThrowException1 
{
	// 메소드 안에서 예외 발생 시 try, catch 블럭을 이용한 처리방법
	public static void main(String[] args)// main 메소드
	{
		try 
		{
			int result = add(1,-2);
			System.out.println(result);
		} 
		catch (Exception e) 
		{
		}
		System.out.println(); 
		// try, catch 블럭은 예외가 발생하는 지점에 넣어두는 것이 좋음!
	}
	
	static int add(int a, int b)
	{
		int result = a + b;
		if(result < 0)
		{
			try 
			{
				throw new Exception("고의로 예외를 발생시킴");
			}
			catch (Exception e) 
			{
				System.out.println("발생된 예외를 처리함");
			}
		}
		return result;
	}
}