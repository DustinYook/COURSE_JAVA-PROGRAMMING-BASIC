package p12.variable;

public class VariableScope 
{
	// static�� ������ RAM�� �ö�Դٴ� �ǹ�
	// ��������(Global variable): Ŭ���� �ȿ� �ִ� ����, �޼ҵ� �ȿ��� ��밡��
	static int a; // ���������� �ʱ�ȭ�� ���� �ʾƵ� �� (���������� �ʱ�ȭ���� ������ ����Ʈ ���� 0�� �������)
	int b; // static�� ���� ���� ���������� �޸𸮿� �ö���� ����, �޼ҵ� �ȿ��� ���Ұ� => ��ü����
	static int c = 3; // ��� ������ static���� �����ϸ� �ȵ� => �޸� ���� �߻�
	
	
	public static void main(String[] args) // main �޼ҵ� (�տ� static�� ���� => �޸𸮿� ����)
	{
		a = a + 10; // �޼ҵ� �ȿ��� ���������� ���ٰ���
		System.out.println(a);
		// b = 20; // �޸𸮿� �ö�� ���� �ʱ� ������ ���Ұ�
		System.out.println(c);
		
		// ��ü����
		VariableScope v = new VariableScope(); // v:��������, VariableScope:Ÿ��
		System.out.println(v.b); // ��ü v�� �����ϴ� b ��������� ����
		
		// ��������(Local Variable): �޼ҵ� �ȿ� �ִ� ����
		int v1 = 0; // ���������� �ݵ�� �ʱ�ȭ�� �ؾ���
		v1 = v1 + 10; 
	}
}
// �޸𸮿� �ø��� ���: static ��� or ��ü����