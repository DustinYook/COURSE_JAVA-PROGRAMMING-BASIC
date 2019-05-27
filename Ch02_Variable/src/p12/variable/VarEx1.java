package p12.variable;

public class VarEx1 
{
	public static void main(String[] args) 
	{   // 자료형 변수명  = 저장값; 
		int year = 0; // year를 변수라 함 => year라는 변수공간에 0이라는 숫자를 저장
		int age = 14; // int는 자료형(data type): 저장할 수 있는 형식을 지정함 => 저장할 수 있는 자료형식을 한정하는 역할
		// 0 != '0' != "0"  => '0'은 문자(상수)로 인식, "0"는 문자열로 인식
		// 자료형과 저장값이 일치하지 않으면 컴파일 에러(문법적 오류)가 발생
		System.out.println(year); // 줄복사: ctrl + alt + 방향키(하)
		System.out.println(age);
		
		year = age + 2000; // age에는 14가 들어감 // year가 0에서 2014로 갱신됨
		age = age + 1; // age의 저장값이 14에서 15로 갱신됨
		age = year; // year의 저장값을 age에 저장하라는 의미 (수학과는 다름)
		System.out.println(year);
		System.out.println(age);
	}
}
// 저장버튼을 누르면 컴파일 수행
// 변수: 저장된 숫자가 변함
// 변수공간에는 저장 => 전기적 신호가 계속 유지