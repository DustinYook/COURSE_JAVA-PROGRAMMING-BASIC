// 프로그램 설명: 인스턴스 메소드에 접근
package p03.method;
import java.util.Scanner; // Scanner클래스 사용을 위한 처리

public class CalculationTest 
{
	public static void main(String[] args) 
	{
		// 1.자료입력
		System.out.println("연산을 수행할 두 정수를 입력해주십시오");
		Scanner sc = new Scanner(System.in);
		System.out.print("첫번째 정수: ");
		long num1 = sc.nextLong();
		System.out.print("두번째 정수: ");
		long num2 = sc.nextLong();
		
		// 2.클래스 사용위한 객체생성
		Calculation cal = new Calculation();
		
		// 3. 인스턴스 메소드에 접근
		System.out.printf("%d + %d = %d\n", num1, num2, cal.add(num1, num2)); // 다음 매개변수로 이동: tab
		System.out.printf("%d - %d = %d\n", num1, num2, cal.sub(num1, num2));
		System.out.printf("%d * %d = %d\n", num1, num2, cal.mult(num1, num2));
		System.out.printf("%.1f / %.1f = %.1f\n", (double)num1, (double)num2, cal.div((double)num1,(double)num2));
	}
}