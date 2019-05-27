package p04.binary.homework;

public class OperatorEx06 
{
	public static void main(String[] args) 
	{
		byte a = 10;
		byte b = 20;
		
		byte c1 = (byte) (a + b); 
		System.out.println(c1); // byte의 결과값을 위해서는 명시적형변환 필요
		
		int c2 = a + b; // 정수의 연산은 기본적으로 int로 바꾸어 이루어 짐  
		System.out.println(c2); // 결과값 int
	}
}