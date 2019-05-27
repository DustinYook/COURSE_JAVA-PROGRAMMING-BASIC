package p05.user.exception;

public class InvalidMain 
{
	public static void main(String[] args) // main 메소드 => 메소드 안에 선언된 변수는 지역변수이고 반드시 초기화 해야 함
	{
		try // 예외가 발생할 여지가 있는 문장
		{
			int result = subtract(5,10); // 3단계
			System.out.println(result); // 위 문장에서 예외가 발생했기 때문에 실행하지 않음
		} 
		catch (InvalidInputException e)
		{
			System.out.println(e.getMessage()); 
		}
	}
	
	// 코드 작성은 독립적인 것부터 작성을 해야 자동완성 기능을 이용할 수 있음
	static int subtract(int a, int b) throws InvalidInputException // 메소드 (2단계)
	{
		if(a<b) // 예외를 정의하여 만들어 내는 것!
			throw new InvalidInputException("에러"); // 예외를 발생시키라는 명령어
		// 예외를 고의로 발생시킴 => 자신이 속한 메소드로 던짐 => 호출한 부분으로 던짐 (1단계)
		return a-b;
	}
}