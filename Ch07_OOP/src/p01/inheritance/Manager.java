package p01.inheritance; // ����� ���� �߿�!

public class Manager extends Employee // extends�� Employee���� ��ӹ޾Ҵٴ� ǥ�� (��� Ŭ������ object�κ��� ��ӹ���)
{ // ObjectŬ������ ������ �ڿ������ �����ϰ�� �� ���� Ŭ���������� ����� ���� (���ϻ��) => extends Employee, String(X)
	// �θ� Ŭ������ ��������� ����޼ҵ�� ��Ӵ�� (��, �ʱ�ȭ��ϰ� �����ڴ� ��Ӵ���� �ƴ�)
	String depart; 
	
	// ������ �����ε�: �Ű����� ������ �ٸ� ���� �����ڸ� �ǹ� => �޼ҵ� �����ε�
	public Manager()
	{
		System.out.println("�ڽ�Ŭ������ ����Ʈ������");
	}
	
	public Manager(String n, int s, String d) // ������
	{
		// �θ�Ŭ������ ��������� ����
//		this.name = n; // �θ�Ŭ�������� ��ӹ޾ұ� ������ name�� this�� ��밡��
//		this.salary = s; // �θ�Ŭ�������� ��ӹ޾ұ� ������ salray�� this�� ��밡��
//		super(n, s); // �θ�Ŭ������ �ش� �Ű����� ������ ���� �޼ҵ忡 ���� => this(var1, var2)�� ���  
		// super(): �θ�Ŭ������ ������ ȣ��
		this(n, s); // this(): �ڽ��� ���� Ŭ������ �ٸ� ������ ȣ��
		
		// �ڽ�Ŭ������ ��������� ����
//		this.depart = d;
		System.out.println("�ڽ�Ŭ������ ������1");
	} // �ٸ� Ŭ������ ���ǵ� ������ �޼ҵ带 ������ ���� ���: ��ü���ؼ� ���� ��� or ����� �޾Ƽ� ���� ��� (����: ������ ���ɿ���)
	
	public Manager(String n, int s) 
	{
		this.name = n; // �θ�Ŭ�������� ��ӹ޾ұ� ������ name�� this�� ��밡��
		this.salary = s; // �θ�Ŭ�������� ��ӹ޾ұ� ������ salray�� this�� ��밡��	
		System.out.println("�ڽ�Ŭ������ ������2");
	}
	
	public String getManager()
	{
		return super.getEmployee() + " : " + depart; 
		//super�� �θ�Ŭ����(Employee)�� ��Ī  
		// this�� �ڱ��ڽ��� ���� Ŭ����
	}
	
	// #�Ϲ����� ��ü������ ���� �ٸ���: �����ڰ� �������ؼ� ����� �� ���� => ���� �� �켱������ �������̵�� �޼ҵ�
	// �޼ҵ� �������̵�(������): �θ��� �޼ҵ带 �ڽ��� �������ؼ� ����ϴ� �� => ���� ��Ȳ�� �°� customize
	@Override // ��ü����: �θ�Ŭ������ ���ǵ� �͸��� ��� vs ���: �θ�Ŭ������ ���� �����ϰ� �����ؼ� ����� �� ���� 
	public String getEmployee() 
	{
		return "�����ǵ� �θ�Ŭ������ getEmployee()";
	} // �ð��� �����ϱ� ���ؼ� ����̶� ������ ���Ե� 
	
	// 1)super.getEmployee();�� Ư�� �޼ҵ� �ȿ� ���� ���
	public String aaa()
	{
		return "�θ�Ŭ������ getEmployee(): " + super.getEmployee();
	}
	// ���⿡ super.�� ���Ұ�
}