package p01.inheritance;

public class Employee // Ŭ���� �ȿ��� ����, �޼ҵ�, �ʱ�ȭ���, �����ڰ� ����
{
	// 1.������� 
	String name; // �ν��Ͻ� ����
	int salary; 
	
	// 2.�ʱ�ȭ���
	static 
	{ // Ŭ���� �ʱ�ȭ���
		System.out.println("�θ�Ŭ������ Ŭ���� �ʱ�ȭ���: ��ӹ��� �� �ƴ�");
	}
	{ // �ν��Ͻ� �ʱ�ȭ���
		System.out.println("�θ�Ŭ������ �ν��Ͻ� �ʱ�ȭ���: ��ӹ��� �� �ƴ�");
	}
	
	// 3.������
	public Employee() // ����Ʈ ������
	{
		System.out.println("�θ�Ŭ������ ����Ʈ ������: ��ӹ��� �� �ƴ�");
	}
	public Employee(String name, int salary) // ������
	{
		this.name = name;
		this.salary = salary;
		System.out.println("�θ�Ŭ������ ������: ��ӹ��� �� �ƴ�"); // ���� �� ����� �����ٲ� �� ����
	}
	
	// 4.�޼ҵ�
	public String getEmployee() // �ν��Ͻ� �޼ҵ�
	{
		return name + " " + salary;
	}
}