// ���α׷� ����: �ν��Ͻ� �޼ҵ�� Ŭ���� �޼ҵ��� ���
package p03.method_ex;
import java.util.Scanner;

public class CalculationTest 
{
	public static void main(String[] args) 
	{
		// 1.�ڷ��Է�
		System.out.println("���������� ������ �� ������ �Է����ֽʽÿ�");
		Scanner sc = new Scanner(System.in);
		System.out.print("ù��° ����: ");
		long num1 = sc.nextLong();
		System.out.print("�ι�° ����: ");
		long num2 = sc.nextLong();
		
		// 2.Ŭ���� �޼ҵ� ���: ��ü�������� ��Ʈ�����ڷ� ����
		System.out.printf("%d + %d = %d\n", num1, num2, Calculation.add_cls(num1, num2));

		// 3.�ν��Ͻ� �޼ҵ� ���: ��ü���� ��, ��Ʈ�����ڷ� ����
		Calculation cal = new Calculation(); // ��ü���� (�ν��Ͻ�ȭ)
		cal.a = num1;
		cal.b = num2;
		System.out.printf("%d + %d = %d\n", cal.a, cal.b, cal.add_inst());
		// ���α׷����� ������ �� �̵� => �̵��ϴ� �����͸� �ҽǾ��� �� �������־�� ��
	}
} 