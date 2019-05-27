package p04.binary.homework;

public class OperatorEx08 
{
	public static void main(String[] args) 
	{
		int a = 1_000_000; // 100만 (자리수를 _로 끊어읽어도 됨)
		int b = 2_000_000; // 200만

		long c = a * b; // 논리적 오류발생 (기본 계산이 int기준으로 이루어지기 때문)
		System.out.println(c); 
		
		c = (long)a * (long)b; // 문제해결: 명시적형변환을 써주거나 각 변수 저장값에 L을 써줌
		System.out.println(c); 
	}
}