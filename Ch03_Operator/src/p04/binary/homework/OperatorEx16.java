package p04.binary.homework;
// import java.util.Scanner;

public class OperatorEx16 
{
	public static void main(String[] args) 
	{
		float pi = 3.141592f; // 실수형의 디폴트형은 double임, float으로 사용하고자 한다면 f를 반드시 붙여야함
		float shortPi = (int)(pi*1000)/1000f; // 소숫점 이하 셋째 자리까지만 나타내기 위한 처리
		System.out.println(shortPi);
		
//		final double PI = 3.14; // final은 C언어의 const와 동일한 기능을 함
//		System.out.print("원의 반지름의 길이를 입력해주십시오: ");
//		Scanner sc = new Scanner(System.in);
//		int radius = sc.nextInt();
//		double result = Math.pow(radius, 2)*PI;
//		System.out.println(result);
	}
}