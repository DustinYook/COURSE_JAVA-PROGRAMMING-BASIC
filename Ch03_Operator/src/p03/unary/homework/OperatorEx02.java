package p03.unary.homework;

public class OperatorEx02 
{
	public static void main(String[] args) 
	{
		int i = 5, j = 0;
		j = i++; // j�� i�� ��ġ���������� ���� ����: j = i; -> i = i + 1;
		System.out.println("j = i++; ���� ��, i: " + i + ", j: " + j);
		
		i = 5;
		j = 0;
		j = ++i; // j�� i�� ��ġ���������� ���� ����: i = i + 1; -> j = i; -> i = i;
		System.out.println("j = ++i; ���� ��, i: " + i + ", j: " + j);
	}
}