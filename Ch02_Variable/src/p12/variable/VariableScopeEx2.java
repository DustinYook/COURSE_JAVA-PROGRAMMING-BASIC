package p12.variable;

public class VariableScopeEx2
{
	public static void main(String[] args) // �޼ҵ� ���� ������ �������� 
	{
		int a = 15;
		int b = 0; // ���������� �ݵ�� �ʱ�ȭ�ؾ� ��
		// int b; // ���ϸ� ���������� �߻�
		
		if(a > 10)
		{
			// int b = 0; // ��� ���� b�� main�Լ����� invisible (��� ���� ����� �Ҹ�)
			b = a-10;
		}
			
		int c = a + b + 5;
		System.out.println(c);
	}
}