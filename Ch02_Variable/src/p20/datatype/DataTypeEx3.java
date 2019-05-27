package p20.datatype;

public class DataTypeEx3 
{
	public static void main(String[] args) 
	{
		short s = 12; // 12를 s라는 변수공간에 대입
		int n = s; // short의 저장값을 int형 변수에 저장
		
		char c = 'A'; // 문자상수 A의 ASCII 코드값은 65
		System.out.println(c); // 출력결과: A
		int n2 = c+1; // A의 ASCII 코드값 65에 1을 더해 66을 저장
		System.out.println(n2); // 출력결과: B
		System.out.println((char)n2);
		
		int x = 123; // 문장의 끝은 세미콜론
		float y = x + 12.3f; // f를 명시적으로 써 주지 않으면 double로 인식 
		// 연산을 수행하기 위해서는 피연산자가 같은 자료형이여야 함
		// 즉, int형 변수는 더 큰 자료형인 float형으로 묵시적 형변환 후 덧셈연산을 수행하게 됨
		// f를 써주는 이유: 메모리 공간을 효율적으로 이용하기 위해 (float은 4바이트, double은 8바이트)
		System.out.println(y);
		
		short s1 = 10; // 32767
		short s2 = 20; // 32767
		int z = s1 + s2; // int보다 작으면 int를 기준으로 연산
		System.out.println(z);
	}
}
// 참조형 타입: 기본형 타입을 제외한 모든 타입 => ex) string