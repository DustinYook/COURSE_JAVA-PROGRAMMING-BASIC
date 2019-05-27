package p02.throw_new;

public class ExceptionEx4 
{
	// 1.throw new Exception: 예외를 발생시킨 메소드로 전가
//	public static void main(String[] args) throws Exception 
//	{
//		int sum = 1+(-2); // 오류가 아님
//		if(sum < 0) // sum이 0보다 작으면
//			throw new Exception("Checked Exception"); // 처리를 전가 (goto와 비슷)
//		// main메소드는 JVM이 호출 => 예외를 던짐
//	}
	
	// 2. try, catch 블럭을 통한 예외처리
	public static void main(String[] args)
	{
		int sum = 1+(-2); // 오류가 아님
		// 1) 첫번째 처리방식: 처리를 전가시키는 방법
		if(sum < 0)
		{
			try
			{
				// 예외를 발생시킴
				throw new Exception("Checked Exception"); 
			} 
			catch (Exception e) 
			{
				System.out.println("throw로 던진 것을 자기 스스로 catch가 받음");
				System.out.println(e.getMessage());
			}
		} System.out.println("sum = " + sum);
	}
}