// Figure��� �߻�Ŭ���� �����, �� �ȿ� �߻�޼ҵ�(void area(int a, int b);)�� ����
// �簢���� ������ ���ϴ� Ŭ����(SquareArea)�� ����
// �ﰢ���� ������ ���ϴ� Ŭ����(TriangleArea)�� ����
// main�޼ҵ忡 ����� ���(�Է°�:20,30)
package p07.abstract_class.ex3;

public class MainEx 
{
	public static void main(String[] args) 
	{
		int a = 20, b = 30; // �Էº���
		
		// �ڽ�Ŭ������ ��ü�� ����
		TriangleArea t = new TriangleArea();
		SquareArea s = new SquareArea();
		// ������ �̿��ؼ� TriangleArea(20,30)���� �ϴ� ����� ����!
		
		// �����ǵ� �߻�޼ҵ� ȣ��
		t.area(a,b);
		s.area(a,b);
		
		// �̿� ���� ���°� ���� => ������(polymorphism): �θ��� Ÿ���� ���� �ڽİ�ü�� �����ϴ� ��
		Figure f1 = new SquareArea();  // ����: ����Ŵ (������ ����_
		Figure f2 = new TriangleArea();
		Figure f; // figure�� �θ�Ŭ����
		f = new SquareArea();
		f = new TriangleArea();
		// ����ϴ� ����: �ϳ��� ���������� ���� �ڽİ�ü�� ����ų �� ����
		// �������� ������ �������� ����
	}
}
// ������ �������̽��� �������� ���� �н� => �߿�!