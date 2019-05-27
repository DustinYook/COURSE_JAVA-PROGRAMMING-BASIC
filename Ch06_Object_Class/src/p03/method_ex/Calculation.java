// 프로그램 설명: Calculation의 클래스 정의부 => 인스턴스 메소드와 클래스 메소드
package p03.method_ex;

public class Calculation
{
	// 1. 멤버변수(field, property, attribute)
	// 1) 인스턴스 변수 => 참고) 생성된 객체 하나하나를 인스턴스라 함
	long a; // 참고1) long타입인 것을 명시적으로 나타내기 위해서는 L을 써야함
	long b; // 참고2) long타입은 21억 넘는 숫자의 경우 사용 (8바이트)
	
	// 2.멤버메소드(method, function, behavior) => 움직임에 해당
	// 참고) 메소드 형식: 반환형 메소드명(매개변수형 매개변수명, ... );
	// 1) 인스턴스 메소드: 객체생성 후 사용가능
	long add_inst() // long add_inst(long a, long b)와 같이 쓰면 문법적오류 발생  #추가학습
	{
		return a + b;
	}
	// 2) 클래스 메소드: 객체생성 없이 도트연산자를 이용하여 접근
	static long add_cls(long input1, long input2) 
	{
		return input1 + input2;
	}
}