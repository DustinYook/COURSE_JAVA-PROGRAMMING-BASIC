package p04.array_class;

// �ڵ����� ���赵�� ���� ���� => ��ü�� �����Ǹ� ��ü������ 
public class Dog // main�޼ҵ尡 ���� (�Ϲ����� class)
{
	// �������
	String name; 
	String kind;
	
	// ������(Constructor): ��ü ���� �� �ʱⰪ �����ϴ� ����
	public Dog(String name, String kind) // Ŭ�����̸��� ����, ���´� �޼ҵ�����, ��ȯ�� �������� ����
	{ // ��ü�� ������ �� ����Ǵ� �޼ҵ�
		// super(); // ���� �ʿ� ����
		// ������ Dog�� parameter�� name�� ���尪�� Ŭ���� Dog�� ��������� name�� ����
		this.name = name; // d[0].name = "����";
		this.kind = kind; // d[0].kind = "�ҵ�";
	}
	
	/*public Dog(String string1, String string2) // ���� �Ͱ� ������ ���� (parameter������ ��������)
	{
		this.name = string1;
		this.kind = string2;
	}*/
	
	@Override // ������: �ڹٰ����ڰ� ����� ���� �޼ҵ�(toString)���� �츮�� �������ؼ� ���
	public String toString() // Dog��� Ŭ���� �ȿ� ���ǵ� ����޼ҵ�
	{
		return name + "�� " + kind + "�Դϴ�." ; 
	}
}
// �� �κ��� ���� �� �κп��� ���� �߿��� �κ���!