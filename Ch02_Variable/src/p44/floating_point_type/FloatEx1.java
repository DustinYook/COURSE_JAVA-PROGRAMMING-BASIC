// 프로그램 설명: 부동소숫점 표현방식의 출력예제
package p44.floating_point_type;

public class FloatEx1 
{
	public static void main(String[] args) 
	{
		System.out.printf("     123456789012345678901234\n");
		
		float f1 = 9.12345678901234567890f;
		System.out.printf("f1 :   %f\n", f1); // %f의 디폴트값은 소숫점 이하 6째 자리까지 출력
		System.out.printf("f1 : %24.20f\n",f1); // 24칸을 확보, 소숫점 이하 20째 자리까지 출력
		
		float f2 = 1.2345678901234567890f; // f는 생략불가
		System.out.printf("f2 : %24.20f\n", f2);
		
		double d = 9.12345678901234567890d; // d는 생략가능
		System.out.printf("d  : %24.20f\n", d);
	}
}