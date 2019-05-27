package p12.variable;

public class VarEx2 
{
	public static void main(String[] args) 
	{
		int x = 10; 
		int X = 70; // 변수 x와 X는 완전히 다른 변수공간: JAVA에서는 대소문자를 엄격히 구별
		// int class = 0; // 예약어(키워드)를 사용하면 안됨
		// int 3x = 21; // 숫자로 시작할 수 없음
		// int _x = 20; // 특수문자 중 underbar와 $만 사용가능
		// int $2 = 10;
		// int #1 = 10; // 나머지 특수문자는 식별자로 사용불가
		// double PI = 3.14159; // 상수의 경우 모두 대문자로 명명하는 암묵적 규칙
		int y = 20;
		int temp = 0;
		
		System.out.println("x:" + x + ", y:" + y); // 출력결과 => x:10, y:20
		// Swap 연산: 변수 x와 y에 들어 있는 값을 서로 바꾸기
		temp = x;
		x = y;
		y = temp;
		System.out.println("x:" + x + ", y:" + y); // 출력결과 => x:20, y:10
		// " " 사이의 문자들은 문자열, + 기호는 concatenate operator(연결연산자)로서의 역할을 수행: 문자열과 변수를 단순히 연결시켜주는 역할을 수행 
	}
}
// 식별자 명명규칙: JAVA에서는 대소문자를 엄격히 구별 / 예약어(키워드)를 사용하면 안됨 / 숫자로 시작할 수 없음 /특수문자 중 underbar와 $만 사용가능 
// 암묵적 명명규칙: 클래스명의 첫글자는 대문자 / 여러문자로 이루어진 경우 각 단어의 첫글자는 대문자 / 상수의 이름은 모두 대문자
// 참고) 예약어: JAVA에서 미리 정의된 언어 ex) class, int, double, for, while, if 등