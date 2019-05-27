// 프로그램 설명: 인스턴스 메소드와 클래스 메소드의 사용
package p03.method_ex;
import java.util.Scanner;

public class CalculationTest 
{
	public static void main(String[] args) 
	{
		// 1.자료입력
		System.out.println("덧셈연산을 수행할 두 정수를 입력해주십시오");
		Scanner sc = new Scanner(System.in);
		System.out.print("첫번째 정수: ");
		long num1 = sc.nextLong();
		System.out.print("두번째 정수: ");
		long num2 = sc.nextLong();
		
		// 2.클래스 메소드 사용: 객체생성없이 도트연산자로 접근
		System.out.printf("%d + %d = %d\n", num1, num2, Calculation.add_cls(num1, num2));

		// 3.인스턴스 메소드 사용: 객체생성 후, 도트연산자로 접근
		Calculation cal = new Calculation(); // 객체생성 (인스턴스화)
		cal.a = num1;
		cal.b = num2;
		System.out.printf("%d + %d = %d\n", cal.a, cal.b, cal.add_inst());
		// 프로그래밍은 데이터 간 이동 => 이동하는 데이터를 소실없이 잘 관리해주어야 함
	}
} 