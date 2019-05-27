package p05.modifier_protected_child;
import p05.modifier_protected_parent.Polygon; // �ڽ�Ŭ����
// �θ�Ŭ������ protected ������ ��Ű���� �ٸ� �ڽ�Ŭ���������� ����� ���

public class Square extends Polygon // �ٰ������� ��ӹ��� �簢��
{
	public Square(int x, int y, int sideLength) // ������ 
	{
		super(4); // �θ�Ŭ������ ������ȣ��
		setPoint(0, x, y);
		setPoint(1, x+sideLength, y);
		setPoint(2, x+sideLength, y+sideLength);
		setPoint(3, x+sideLength, y+sideLength);
	}
	
	public int getX(int index)
	{
		return x[index];
	}
	
	public int getY(int index)
	{
		return y[index];
	}
}