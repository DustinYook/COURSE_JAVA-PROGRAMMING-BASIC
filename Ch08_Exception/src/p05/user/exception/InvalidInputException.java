package p05.user.exception;

public class InvalidInputException extends Exception // 개발자가 만든 Exception을 상속받음 
{
//	public InvalidInputException() // 기본 생성자 
//	{
//		super("잘못된 명령입니다."); // 부모클래스의 생성자 호출해서 초기값 저장 // 부모 클래스에 기본 생성자에 이 내용이 저장
//	}

	public InvalidInputException(String string) 
	{
		super(string);
	}
}