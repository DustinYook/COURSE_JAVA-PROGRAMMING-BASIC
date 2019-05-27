package p04.binary.homework;

public class OperatorEx18 
{
	public static void main(String[] args) 
	{
		double pi = 3.141592;
		double shortPi = Math.round(pi*1000) / 1000.0; // round는 소수첫째 자리에서 반올림하는 메소드
		System.out.println(shortPi); // 
	}
}