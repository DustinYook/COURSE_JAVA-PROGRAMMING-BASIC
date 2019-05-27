package p05.wrapper;

public class WrapperEx3 
{
	public static void main(String[] args) 
	{
		printDouble(new Double(123.45)); // 객체생성 => new Double(123.45)는 클래스 Double 타입
		printDouble(123.45); // 123.45는 123.45D로 기본형 double 타입임 => 자동형변환이 일어나서 에러가 발생하지 않음
	}
	
	static void printDouble(Double obj) // 클래스메소드 
	{
		System.out.println(obj);
	}
	
}