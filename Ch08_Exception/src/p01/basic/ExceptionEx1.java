// 설명: 예외가 발생하는 경우에 대한 예시
package p01.basic;

public class ExceptionEx1 // 클래스 
{
	public static void main(String[] args) // main메소드 
	{
		int a = 3, b = 0;
		int result = a/b; // ArithmeticException: 0으로 나누어 예외발생 -> 프로그램 실행 시 발생하는 문제
		System.out.println(result);
		System.out.println("The system will be closed");
	}
}
//1.문법적오류(Syntax Error): 프로그램 코드에 의해서 수습될 수 없는 심각한 오류
//2.논리적오류(Logical Error): 코드에 의해 수행된 결과가 의도와 다르게 나오는 것
//3.예외(Exception): 프로그램 코드에 의해서 수습될 수 있는 다소 미약한 오류 (java.lang에 Exception클래스로서 정의)
//1)Runtime(Unchecked) Exception: 컴파일 시가 아닌  실행 시 예외발생 
//  java.lang.ArithmeticException
//  java.lang.ArrayStoreException
//  java.lang.ClassCastException
//  java.lang.EnumConstantNotPresentException
//  java.lang.IllegalArgumentException
//  java.lang.IllegalMonitorStateException
//  java.lang.IllegalStateException
//  java.lang.IndexOutOfBoundsException
//  java.lang.NegativeArraySizeException
//  java.lang.NullPointerException
//  java.lang.SecurityException
//  java.lang.TypeNotPresentException
//  java.lang.UnsupportedOperationException
//2)Checked Exception: try,catch블록을 이용하여 예외처리
//  java.lang.CloneNotSupportedException
//  java.lang.InterruptedException
//  java.lang.ReflectiveOperationException