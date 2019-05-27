package p04.binary.homework;

public class OperatorEx10 
{
	public static void main(String[] args) 
	{
		int a = 1_000_000;
		
		int result1 = a * a / a; // a*a는 int형의 범위를 벗어나기 때문에 오버플로우 발생 => 논리적오류
		int result2 = a / a * a;
		
		System.out.printf("%d * %d / %d = %d\n", a, a, a, result1); // 오버플로우로 인해 논리적오류발생
		long result1_1 = (long)a * (long)a / (long)a; // 문제해결: long으로 표현범위를 늘림
		System.out.printf("%d * %d / %d = %d\n", a, a, a, result1_1);
		System.out.printf("%d / %d * %d = %d\n", a, a, a, result2); // 다행히 오버플로우는 발생하지 않았으나 위험
	}
}