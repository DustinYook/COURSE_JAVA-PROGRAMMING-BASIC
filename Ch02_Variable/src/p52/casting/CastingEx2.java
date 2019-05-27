// 프로그램 설명: 정수형간의 형변환 예제
package p52.casting;

public class CastingEx2 
{
	public static void main(String[] args) 
	{
		int i = 10;
		byte b = (byte)i;
		System.out.printf("[int -> byte] i=%d -> b=%d \n", i, b);
		
		i = 300;
		b = (byte)i; // byte는 256(2^7)까지 표현가능해서 300을 저장하면 overflow가 발생
		System.out.printf("[int -> byte] i=%d -> b=%d \n", i, b);
		
		i = 10;
		b = (byte)i;
		System.out.printf("[int -> byte] i=%d -> b=%d \n", i, b);
		
		i = -2;
		b = (byte)i;
		System.out.printf("[int -> byte] i=%d -> b=%d \n", i, b);
		
		System.out.println("i=" + Integer.toBinaryString(i));
		// toBinaryString 메소드는 이진수의 문자열로 변환 
	}
}