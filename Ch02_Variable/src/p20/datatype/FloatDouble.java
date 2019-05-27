package p20.datatype;

public class FloatDouble 
{
	public static void main(String[] args) 
	{
		// 실수값
		double d1 = 3.14d; // double은 8바이트
		// double d1 = 3.14; // 위와 같은 표현
		// double d1 = 3.14D; // 위와 같은 표현
		float f1 = 3.14f;
		// float f1 = 3.14; // L-value는 float형으로 4바이트, R-value는 double형으로 8바이트 => 문법적오류(컴파일 에러)
		
		float f2 = (float)3.14; // 표현범위 내에서 명시적(강제)형변환을 하면 데이터 소실이 발생하지 않음 
		System.out.println(f2);
		
		float f3 = (float)3.0000000000000000000000000000014; // 표현범위 내에서 명시적(강제)형변환을 하면 데이터 소실이 발생하지 않음 
		System.out.println(f3); // 표현범위를 벗어난 상태에서 명시적 형변환을 하면 데이터 소실이 발생함 (유효자리 숫자만 표현)
		System.out.printf("%f\n", f3); // %f는 기본적으로 소숫점 이하 6자리까지 출력
		
		float f4 = (float)3.00014; 
		System.out.println(f4);
		
		final int MAX_VALUE = 100; // final(최종값)이 붙어있는 것은 변수를 상수화 시킴 (고정상수)
		// final은 C언어에서 const키워드와 동일한 역할을 수행
		// MAX_VALUE = 200; // 상수는 대문자로 표시하고 final을 붙임, 저장된 값을 변경할 수 없음
		
		System.out.println("aaaa" +  75 + 100); // 출력결과: aaaa75100 (concatenate 연산됨)
		System.out.println("aaaa" + (75 + 100)); // 연결연산 뒤에 +를 덧셈연산자로 쓰기 위해서는 괄호를 써야함
		System.out.println(75 + 100 + "aaaa");  // +는 C언어의 strcat함수와 동일
		
		int age = 30;
		System.out.printf("age: %d", age); // d는 decimal(10진수)의 약자
		
		System.out.println('\'');
	}
}
// 형변환: 명시적형변환(강제형변환) or 묵시적형변환(자동형변환) => 명시적형변환에서 데이터소실을 주의해야 한다!
// 리터럴: 변수에 저장된 값 자체 (실제값), 상수: 저장된 값을 변경할 수 없음 => 용어를 명확하게 구분할 것!
// 2진수는 0과 1로 모든 숫자를 표현 