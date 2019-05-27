package p21.datatype.casting;

public class CastingEx 
{
	public static void main(String[] args) 
	{
		int v1 = 44032;
		char c = (char) v1; // 명시적(강제)형변환: 기본형 타입에서 수행
		System.out.println(c); 
		
		long l1 = 500;
		v1 = (int)l1; // 큰 타입에서 작은 타입으로 형 변환
		System.out.println(v1);
		
		double d = 333333333333333333333333333333333333333333.1422222222222222222222222; // double형의 정수부는 52비트까지 표현가능
		v1 = (int) d; // int는 소숫점 이하가 없음 => 소숫점 이하 자리가 잘려나옴 (int 표현범위 넘치면 표현가능한 최댓값이 출력)
		System.out.println(v1);
		System.out.println(v1 * l1); // 연산식은 피연산자(operand)와 연산자(operator)로 구성
		
		String s = "1234"; 
		int s_mobile = Integer.parseInt(s);
		System.out.println(s_mobile);
		// 안드로이드는 자바언어를 기본 => 기상청에서는 String으로 보냄 => 스마트폰에서 보기 위해서 문자열을 숫자로 전환해야 함 (형변환)
	}
}
// 내일 3장과 4장 진행할 예정
// 다음주 월요일까지 3~5장 까지의 짝수번 예제 코딩 후 주석달아오기 (~p227)