// 프로그램 설명: 부동소숫점에 대한 오차를 알아보기 위한 예제
package p44.floating_point_type;

public class FloatToBinEx 
{
	public static void main(String[] args) 
	{
		float f = 9.1234567f;
		int i = Float.floatToIntBits(f); 
		// floatToIntBits()라는 멤버메소드는 float의 값을 int의 값으로 변환해주는 역할 수행
		
		System.out.printf("%f\n", f);
		System.out.printf("%#X\n", i); // 16진수로 출력
	}
}
// 참고) %x와 %X의 차이점
// %x는 16진수의 10이상의 표현 A~F를 소문자로 표현 => 예) 10진수 10을 a로 표현
// %X는 16진수의 10이상의 표현 A~F를 대문자료 표현 => 예) 10진수 10을 A로 표현