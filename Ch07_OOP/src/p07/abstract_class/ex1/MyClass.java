package p07.abstract_class.ex1;

// �߻�޼ҵ尡 ������ �ݵ�� abstract�� �ٿ��� ��!
public abstract class MyClass // abstract�� ������ ��ü���� �Ұ�
{
	// �������(field)
	int num = 3; // �ν��Ͻ� ����
	
	public MyClass() // ����Ʈ ������
	{
	}
	
	public MyClass(int n) // ������
	{
		this.num = n;
	}
	
	// ����޼ҵ�
	public void methodA() // �ν��Ͻ� �޼ҵ�(�Ϲݸ޼ҵ�)
	{
		System.out.println("methodA()");
	}
	
	// �߻�޼ҵ�: �ڽ�Ŭ�������� ��ӹ޾� �������ؼ� ���
	public abstract void methodB(); // �޼ҵ��� ��ü(Body)�� ����
//	public void methodC(); // �̷��Դ� ����
}
