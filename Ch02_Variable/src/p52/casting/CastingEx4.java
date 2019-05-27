// 프로그램 설명: 정수형과 실수형 간의 형변환 예제
package p52.casting;

public class CastingEx4 
{
	public static void main(String[] args) 
	{
		int i = 91_234_567; // 8자리의 10진수
		System.out.printf("i=%d\n", i); 
		
		float f = (float)i; // int를 float으로 형변환
		int i2 =  (int)f; // float을 int로 형변환
		System.out.printf("f=%f, i2=%d\n", f, i2); // 질문
		
		double d = (double)i; // int를 double로 형변환
		int i3 = (int)d; // double을 int로 형변환
		System.out.printf("d=%f, i3=%d\n", d, i3);
		
		float f2 = 1.666f; // 소숫점 이하 3자리의 실수
		int i4 = (int)f2; // float을 int로 형변환
		System.out.printf("(int)%f=%d\n", f2, i4);
	}
}