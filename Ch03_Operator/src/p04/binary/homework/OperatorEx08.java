package p04.binary.homework;

public class OperatorEx08 
{
	public static void main(String[] args) 
	{
		int a = 1_000_000; // 100�� (�ڸ����� _�� �����о ��)
		int b = 2_000_000; // 200��

		long c = a * b; // ���� �����߻� (�⺻ ����� int�������� �̷������ ����)
		System.out.println(c); 
		
		c = (long)a * (long)b; // �����ذ�: ���������ȯ�� ���ְų� �� ���� ���尪�� L�� ����
		System.out.println(c); 
	}
}