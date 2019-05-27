// 프로그램 설명: 캐스팅 연산자를 이용한 명시적 형변환
package p52.casting;

public class CastingEx1 
{
	public static void main(String[] args)
	{
		double d = 85.4;
		System.out.println("d = " + d);
		
		int score = (int)d; // 실수 85.4를 정수형으로 명시적 형변환 (score에 정수부 85가 저장)
		System.out.println("score = " + score);
	}
}