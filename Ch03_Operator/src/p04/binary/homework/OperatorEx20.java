// 프로그램 설명: 나머지 연산자에 대한 이해
package p04.binary.homework;

public class OperatorEx20 
{
	public static void main(String[] args) 
	{
		System.out.println("-10에서 8을 나눈 나머지: " + (-10%8)); // -10 = -1 * 8 + (-2) 
		System.out.println("10에서 -8을 나눈 나머지: " + (10%-8)); // 10 = -1 * -8 + (2)
		System.out.println("-10에서 -8을 나눈 나머지: " + (-10%-8)); // -10 = 1 * -8 + (-2)
	}
}