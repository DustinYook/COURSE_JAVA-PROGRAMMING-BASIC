// Figure��� �߻�Ŭ���� �����, �� �ȿ� �߻�޼ҵ�(void area(int a, int b);)�� ����
// �簢���� ������ ���ϴ� Ŭ����(SquareArea)�� ����
// �ﰢ���� ������ ���ϴ� Ŭ����(TriangleArea)�� ����
// main�޼ҵ忡 ����� ���(�Է°�:20,30)
package p07.abstract_class.ex3;

public class TriangleArea extends Figure // �ڽ�Ŭ���� #1 (Figure�κ��� ��ӹ���)
{
	double tArea; // ������� ������ ����
	
	@Override
	void area(int a, int b) // �θ�Ŭ������ �߻�޼ҵ忡 �������̵�
	{
		tArea = ((double)a*(double)b)/2.0; 
		System.out.println("�ﰢ���� ����: " + tArea);
	}
}
