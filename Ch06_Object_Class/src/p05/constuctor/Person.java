package p05.constuctor;

public class Person 
{
	// �������(field) = ��������, ���뺯��, Ŭ������� (�ν��Ͻ������� Ŭ�������� ����)
	String name; // ��������: �ʱ�ȭ �ʿ����, ����Ʈ�� ����
	int age;
	
	public Person() // ����Ʈ������: �����Ϸ��� ���������� �ڵ����� ����
	{ // "shift + alt -> constuctor" �Ǵ� "ctrl + space"
		System.out.println("����Ʈ������ ����");
	} // ������ �Ű������� �ִ� �����ڰ� �����ϴ� ��쿡�� �� �̻� �����Ϸ��� �ڵ��������� �ʾ� �����ڰ� ������ ��
	
	public Person(String name) // �޼ҵ� �����ε�: �Ű������� ����, Ÿ���� �߿�!
	{ // �޼ҵ� �����ε�: �Ű������� ����(����,Ÿ��,����)�� �ٸ��� �޼ҵ���� ���� �޼ҵ尡 ���� �� �ִ� ��츦 ��Ī
		this.name = name; // this: �ڱ��ڽ��� ���� Ŭ������ �ǹ�
	} 
	
	public Person(int age) 
	{ // #�߰��н�: this�޼ҵ�?
		// System.out.println("�Ű������ִ� ������2 ����"); // this�޼ҵ� ���� ���� ����
		this("ȫ�浿",age); // this�����ʹ� �ڱ��ڽ��� ���� Ŭ������ ��������� ���� ����, �ڱ� Ŭ���� �ȿ� �ִ� �ٸ� ������ ȣ��
		System.out.println("�Ű������ִ� ������2 ����");
	} // ����: ȫ�浿 -> Person(String name)ȣ�� -> this("ȫ�浿",19)�� ���� Person(String n, int a)ȣ��
	// �߿�! ������ ������ ���α׷� ������� �˾Ƶδ� �� �ſ� �߿�!

	public Person(String n, int a) 
	{
		this.name = n;
		this.age = a;
	}
	
//	public Person(String name, int age) // ������ ���� Ÿ���� ���� �޼ҵ�� ���� �� ������ �� ����
//	{
//		this.name = name;
//		this.age = age;
//	}
	
	public Person(int aa, String nn) 
	{
		this.name = nn;
		this.age = aa;
	}
	
	// getter & setter �޼ҵ�
	public String getName() 
	{
		return name;
	}
	public void setName(String name) 
	{
		this.name = name;
	}

	public int getAge() 
	{
		return age;
	}
	public void setAge(int age) 
	{
		this.age = age;
	}
}