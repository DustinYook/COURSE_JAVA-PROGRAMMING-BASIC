package p04.while_statment;

public class WhileEx1 
{
	public static void main(String[] args) 
	{
		int i = 1;
		int sum = 0;
		while(i <= 10) // while�� ������ �����̸� �� ���� �������� ���� �� ����
		{
			System.out.println(i);
			sum += i;
			i++;
		} System.out.println(sum);
	}
}