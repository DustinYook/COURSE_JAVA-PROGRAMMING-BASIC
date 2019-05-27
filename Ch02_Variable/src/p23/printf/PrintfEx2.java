// ���α׷� ����: printf�� ���õ� ��ȯ���� ���� �н� 2
package p23.printf;

public class PrintfEx2 
{
	public static void main(String[] args) 
	{
		float f1 = .10f; // <=> float f1 = 0.10f 
		System.out.printf("f1 = %f, %e, %g\n", f1, f1, f1); 
		// %f�� �⺻������ �Ҽ��� ���� 6° �ڸ������� ǥ�� (����Ʈ ��)
		
		float f2 = 1e1f; // ���� 1�� 1.0�� �ǹ�, ���� e1�� 10^1(10.0)�� �ǹ�
		System.out.printf("f2 = %.2f, %.2e, %.2g\n", f2, f2, f2);
		
		float f3 = 3.14e3f; // 3.14 * 10^3�� �ǹ�, ��, 3140.0�� �ǹ�
		System.out.printf("f3 = %f, %e, %g\n", f3, f3, f3);
		
		double d = 0.1234567890; 
		System.out.printf("d = %f\n", d); // %f�� �⺻������ �Ҽ��� ���� 6° �ڸ������� ǥ���ϰ� �� ���� �ڸ��� �ݿø�ó��
		System.out.printf("d = %14.10f\n", d); // 14ĭ�� �����Ҵ�, �Ҽ��� ���� 10° �ڸ����� ���
		
		System.out.printf("[12345678901234567890]\n");
		String url = "www.codechobo.com"; 
		System.out.printf("[%s]\n", url); // %s�� ���ڿ��� �����ּҸ� �޾ƿ� ����ϴ� ��ȯ��
		System.out.printf("[%20s]\n", url); // 20: 20ĭ�� �����Ҵ�, +�� ����Ʈ ��(��������): ������ ���� 
		System.out.printf("[%-20s]\n", url); // -�� �������� (���� ������ �ϰ� ������ ��������� -��ߵ�)
		System.out.printf("[%.8s]\n", url); // .8�� �����ּҿ������� 8��° ���幮�ڿ����� ����϶�� ��ȯ�� 
	}
}