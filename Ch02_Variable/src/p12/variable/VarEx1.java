package p12.variable;

public class VarEx1 
{
	public static void main(String[] args) 
	{   // �ڷ��� ������  = ���尪; 
		int year = 0; // year�� ������ �� => year��� ���������� 0�̶�� ���ڸ� ����
		int age = 14; // int�� �ڷ���(data type): ������ �� �ִ� ������ ������ => ������ �� �ִ� �ڷ������� �����ϴ� ����
		// 0 != '0' != "0"  => '0'�� ����(���)�� �ν�, "0"�� ���ڿ��� �ν�
		// �ڷ����� ���尪�� ��ġ���� ������ ������ ����(������ ����)�� �߻�
		System.out.println(year); // �ٺ���: ctrl + alt + ����Ű(��)
		System.out.println(age);
		
		year = age + 2000; // age���� 14�� �� // year�� 0���� 2014�� ���ŵ�
		age = age + 1; // age�� ���尪�� 14���� 15�� ���ŵ�
		age = year; // year�� ���尪�� age�� �����϶�� �ǹ� (���а��� �ٸ�)
		System.out.println(year);
		System.out.println(age);
	}
}
// �����ư�� ������ ������ ����
// ����: ����� ���ڰ� ����
// ������������ ���� => ������ ��ȣ�� ��� ����