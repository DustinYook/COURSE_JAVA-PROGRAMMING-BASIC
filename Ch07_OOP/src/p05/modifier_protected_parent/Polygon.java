package p05.modifier_protected_parent;

public class Polygon // �θ�Ŭ���� // Ŭ���� �տ��� public,default,abstract�� ����
{
	protected int x[]; // protected - 1)������Ű�� �� ��밡�� 2)��Ű���ٸ� �ڽ�Ŭ�������� ��밡��
	protected int y[]; // int�� �迭����
	
	public Polygon(int v) // ������
	{
		// x[] = new int[v]; // ����) �̷��� ���� �ȵ�
		x = new int[v]; // v�� �迭�� ĭ ���� �ǹ�
		y = new int[v]; 
	}
	
	protected void setPoint(int index, int a, int b) 
	// protected ���� �͸� �ٸ� ��Ű�� �� �ڽ�Ŭ�������� ��밡�� (�Ⱥ��� ���� ���Ұ�)
	{
		this.x[index] = a;
		this.y[index] = b;
	}
} // ������������ ����: ��������