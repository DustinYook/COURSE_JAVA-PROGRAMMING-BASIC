package p03.class_method_ex;

public class PrintEx2 // 클래스
{
	public static void main(String[] args) // main 메소드
	{
		MethodEx3 m3 = new MethodEx3(); // 객체생성
		m3.PrintEx2('-', 40); // 멤버메소드 호출
		System.out.println("NCS Java Basic");
		m3.PrintEx2('@', 40); // 멤버메소드 호출
	}
}