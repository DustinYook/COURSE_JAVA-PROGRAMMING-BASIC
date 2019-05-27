package p20.datatype;

public class DataTypeEx1 
{
	public static void main(String[] args) 
	{
		// 1. 기본형타입(Primitive Datatype): 변수에 실제 값이 저장되어 있는 형태
		// 1) 정수형 => int가 디폴트값
		byte t = 127; // 표현범위: -128 ~ 127 (1바이트) => 표현범위 넘어가면 문법적오류 발생
		short s = 32767; // 표현볌위: -32768 ~ 32767 (2바이트)
		int n = 2147483647; // (4바이트)
		long l = 2000000000L; // (8바이트) long type에서도 L을 써주어야 됨
		// 2) 실수형 => double이 디폴트값
		float f = 3.14f; // float을 사용하기 위해서는 명시적으로 f표시 (4바이트) 
		double d = 3.14; // *실수형의 디폴트 자료형 (또는 명시적으로 d) (8바이트)
		// 3) 문자형
		char c = 'A'; // char c = 'AA'; (문자를 두개 저장할 수 없음) (2바이트; C언어에서는 1바이트)
		// 4) 논리형: true 또는 false를 저장할 수 있음
		boolean b1 = true; // 스위치가 켜진 상태 (1바이트)
		boolean b2 = false; // 스위치가 꺼진 상태
		
		// 2. 참조형타입 (Reference Datatype) : 변수에 주소값이 들어있다.		
		String str = "AAAA";
		System.out.println(t); // ctrl + alt + 방향키(하): 줄복사
		System.out.println(s);
		System.out.println(n);
		System.out.println(l);
		System.out.println(f);
		System.out.println(d);
		System.out.println(c);
		System.out.println(b1);
		System.out.println(b2);
		System.out.println(str);	
	}
} // 기본형과 참조형을 반드시 구분해서 사용해야함
// 변수에 타입이 존재하는 이유: 메모리 공간을 효율적으로 이용하기 위함
// 따라서 상황에 따라 요구되는 자료형을 사용하는 것이 좋음