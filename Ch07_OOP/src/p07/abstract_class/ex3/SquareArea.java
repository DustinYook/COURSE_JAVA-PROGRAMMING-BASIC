// Figure��� �߻�Ŭ���� �����, �� �ȿ� �߻�޼ҵ�(void area(int a, int b);)�� ����
// �簢���� ������ ���ϴ� Ŭ����(SquareArea)�� ����
// �ﰢ���� ������ ���ϴ� Ŭ����(TriangleArea)�� ����
// main�޼ҵ忡 ����� ���(�Է°�:20,30)
package p07.abstract_class.ex3;

public class SquareArea extends Figure // �ڽ�Ŭ���� #2 (Figure�κ��� ��ӹ���)
{
	int sArea; // ������� ������ ����
	
	@Override
	void area(int a, int b) // �θ�Ŭ������ �߻�޼ҵ忡 �������̵�
	{
		sArea = a*b;
		System.out.println("�簢���� ����: " + sArea);
	}
}