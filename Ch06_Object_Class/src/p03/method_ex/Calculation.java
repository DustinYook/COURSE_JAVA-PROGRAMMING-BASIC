// ���α׷� ����: Calculation�� Ŭ���� ���Ǻ� => �ν��Ͻ� �޼ҵ�� Ŭ���� �޼ҵ�
package p03.method_ex;

public class Calculation
{
	// 1. �������(field, property, attribute)
	// 1) �ν��Ͻ� ���� => ����) ������ ��ü �ϳ��ϳ��� �ν��Ͻ��� ��
	long a; // ����1) longŸ���� ���� ��������� ��Ÿ���� ���ؼ��� L�� �����
	long b; // ����2) longŸ���� 21�� �Ѵ� ������ ��� ��� (8����Ʈ)
	
	// 2.����޼ҵ�(method, function, behavior) => �����ӿ� �ش�
	// ����) �޼ҵ� ����: ��ȯ�� �޼ҵ��(�Ű������� �Ű�������, ... );
	// 1) �ν��Ͻ� �޼ҵ�: ��ü���� �� ��밡��
	long add_inst() // long add_inst(long a, long b)�� ���� ���� ���������� �߻�  #�߰��н�
	{
		return a + b;
	}
	// 2) Ŭ���� �޼ҵ�: ��ü���� ���� ��Ʈ�����ڸ� �̿��Ͽ� ����
	static long add_cls(long input1, long input2) 
	{
		return input1 + input2;
	}
}