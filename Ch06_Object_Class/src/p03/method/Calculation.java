// ���α׷� ����: Calculation�� Ŭ���� ���Ǻ� => �޼ҵ��� ���� (C����� �Լ��� ����� ����)
package p03.method;

public class Calculation 
{
	// �ν��Ͻ� �Լ�: ��ü���� ��, ��Ʈ�����ڷ� ����
	long add(long input1, long input2) // ���������� �����ϴ� �޼ҵ�
	{
		long result = input1 + input2; 
		return result; // �޼ҵ� ȣ��ο� ����� ��ȯ
	}
	
	long sub(long input1, long input2) // ���������� �����ϴ� �޼ҵ�
	{
		long result = input1 - input2;
		return result;
	}
	
	long mult(long input1, long input2) // ���������� �����ϴ� �޼ҵ�
	{
		long result = input1 * input2;
		return result;
	}
	
	double div(double input1, double input2) // ������������ �����ϴ� �޼ҵ�
	{
		double result = input1 / input2;
		return result;
	}
}