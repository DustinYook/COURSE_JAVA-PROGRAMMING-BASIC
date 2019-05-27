package p02.throw_new;

public class ThrowException2 
{
	// 메소드 안에서 예외 발생 시 throw new Exception으로 처리
	public static void main(String[] args) // main 메소드에 문제는 없지만 전가시키면 좋지 않음!
	{
		int result;
		try
		{
			result = add(1,-2); // 3단계
			System.out.println(result);
		}
		catch(Exception e)
		{
			
		}
		System.out.println(); 
	}
	
	static int add(int a, int b) throws Exception // 1단계
	{
		int result = a + b;
		if(result < 0)
		{
			throw new Exception("고의로 예외를 발생시킴");
		}
		return result;
	}
}