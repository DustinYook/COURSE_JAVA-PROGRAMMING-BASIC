// 프로그램 설명: Calculation의 클래스 정의부 => 메소드의 이해 (C언어의 함수의 개념과 동일)
package p03.method;

public class Calculation 
{
	// 인스턴스 함수: 객체생성 후, 도트연산자로 접근
	long add(long input1, long input2) // 덧셈연산을 수행하는 메소드
	{
		long result = input1 + input2; 
		return result; // 메소드 호출부에 결과값 반환
	}
	
	long sub(long input1, long input2) // 뺄셈연산을 수행하는 메소드
	{
		long result = input1 - input2;
		return result;
	}
	
	long mult(long input1, long input2) // 곱셈연산을 수행하는 메소드
	{
		long result = input1 * input2;
		return result;
	}
	
	double div(double input1, double input2) // 나눗셈연산을 수행하는 메소드
	{
		double result = input1 / input2;
		return result;
	}
}