// ���α׷� ����: �ν��Ͻ� �޼ҵ忡 ����
package p03.method;
import java.util.Scanner; // ScannerŬ���� ����� ���� ó��

public class CalculationTest 
{
	public static void main(String[] args) 
	{
		// 1.�ڷ��Է�
		System.out.println("������ ������ �� ������ �Է����ֽʽÿ�");
		Scanner sc = new Scanner(System.in);
		System.out.print("ù��° ����: ");
		long num1 = sc.nextLong();
		System.out.print("�ι�° ����: ");
		long num2 = sc.nextLong();
		
		// 2.Ŭ���� ������� ��ü����
		Calculation cal = new Calculation();
		
		// 3. �ν��Ͻ� �޼ҵ忡 ����
		System.out.printf("%d + %d = %d\n", num1, num2, cal.add(num1, num2)); // ���� �Ű������� �̵�: tab
		System.out.printf("%d - %d = %d\n", num1, num2, cal.sub(num1, num2));
		System.out.printf("%d * %d = %d\n", num1, num2, cal.mult(num1, num2));
		System.out.printf("%.1f / %.1f = %.1f\n", (double)num1, (double)num2, cal.div((double)num1,(double)num2));
	}
}