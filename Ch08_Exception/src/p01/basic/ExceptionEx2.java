// 프로그램 설명: try, catch 블럭을 이용한 예외처리
package p01.basic;
import java.util.Scanner;

public class ExceptionEx2 // 클래스 
{
	public static void main(String[] args) // main 클래스 메소드
	{
		try // try 블럭에는 문제가 발생할 수 있는 문장들을 기술
		{
			System.out.println("이 프로그램은 두 정수의 나눗셈 연산을 수행하는 프로그램입니다.");
			System.out.print("[입력] 첫번쨰 숫자를 입력해주십시오: ");
			Scanner sc1 = new Scanner(System.in);
			int a = sc1.nextInt();
			System.out.print("[입력] 두번쨰 숫자를 입력해주십시오: ");
			Scanner sc2 = new Scanner(System.in);
			int b = sc2.nextInt();
			int result = a/b; // Arithmetic Exception이 발생 
			System.out.printf("[결과] %d / %d = %d\n", a, b, result); // 예외 비발생 시에만 수행 (예외발생 시 skip하고 catch 블럭으로 이동)
		} 
		catch (Exception e) // 예외가 발생할 경우 수행하는 블럭
		{
			System.out.println("[경고] 0으로 나눌 수 없습니다. 다시 입력해주십시오."); // 재입력 유도
			// try, catch 블럭 생성: surround with - try/catch block
		} 
		finally // 반드시 수행해야 하는 것은 여기에 기술, 자바 7.0에서는 존재 (생략가능)
		{
			System.out.println("[알림] 프로그램을 종료합니다.");
		}	
	}
}
//실행순서: try -> 문제발생 -> catch -> finally(항상수행)