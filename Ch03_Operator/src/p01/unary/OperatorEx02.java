package p01.unary;

public class OperatorEx02 
{
	public static void main(String[] args) 
	{
		int i = 5, j = 0; 
		j = i++; // i = i; (8�� ����) -> i = i + 1; (9�� ����) 
		System.out.println("j = i++; ���� ��: i = " + i + ", j = " + j + "\n");
		
		i = 5; j = 0; // �ڹٿ����� �̷��Ե� �� �� ���� (C���� ����)
		j = ++i; // i = i + 1; (12�� ����) -> i = i; (13�� ����)
		System.out.println("j = ++i; ���� ��: i = " + i + ", j = " + j);
		
	}
}