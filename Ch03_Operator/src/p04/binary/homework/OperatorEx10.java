package p04.binary.homework;

public class OperatorEx10 
{
	public static void main(String[] args) 
	{
		int a = 1_000_000;
		
		int result1 = a * a / a; // a*a�� int���� ������ ����� ������ �����÷ο� �߻� => ��������
		int result2 = a / a * a;
		
		System.out.printf("%d * %d / %d = %d\n", a, a, a, result1); // �����÷ο�� ���� ���������߻�
		long result1_1 = (long)a * (long)a / (long)a; // �����ذ�: long���� ǥ�������� �ø�
		System.out.printf("%d * %d / %d = %d\n", a, a, a, result1_1);
		System.out.printf("%d / %d * %d = %d\n", a, a, a, result2); // ������ �����÷ο�� �߻����� �ʾ����� ����
	}
}