package p01.unary;

public class OperatorEx09 
{
	public static void main(String[] args) 
	{
		int x = 10, y = 8;
		System.out.printf("%d�� %d�� ������\n", x, y); // ǥ���Է��Լ�: printf
		System.out.printf("���� %d�̰�, �������� %d�Դϴ�.\n\n", x/y, x%y); 
		// '/'�� �������� ��, '%'�� �������� ������
		
		// � �񱳿�����
		System.out.print("x�� ���尪�� 10�϶�, x==10�� ���: "); // ����
		if(x==10)
			System.out.println(true);
		else
			System.out.println(false);
		
		System.out.print("x�� ���尪�� 10�϶�, x!=10�� ���: "); // �����ʴ�
		if(x!=10)
			System.out.println(true);
		else
			System.out.println(false);
	}
} // �̸�����: Refactor - Rename