// ���α׷� ����: �������ڿ��� �����ؾ� �� ����
package p04.binary.homework;

public class OperatorEx26 
{
	public static void main(String[] args) 
	{
		int a = 5;
		int b = 0;
		boolean decide = false;
		
		System.out.printf("a = %d, b = %d\n", a, b);
		decide = (a!=0)||(++b!=0); // ����) ��OR�����ڴ� ������ true�̸� ������ �������� ����!
		System.out.printf("(a!=0) || (++b!=0) = %b\n", decide);
		System.out.printf("a = %d, b = %d\n", a, b);
		decide = (a==0) && (++b!=0); // ����) ��AND�����ڴ� ������ false�̸� ������ �������� ����!
		System.out.printf("(a==0) && (++b!=0) = %b\n", decide);
		System.out.printf("a = %d, b = %d\n", a, b);
	}
}