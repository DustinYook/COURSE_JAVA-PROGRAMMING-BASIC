package p07.instance_static_initialize;

public class Good1 
{
	// Ŭ���� ���ο� �ʵ尡 �� �� ���� => ���⿡ �����ϸ� ��������
	// �ν��Ͻ� ����: ��ü���� �� ��밡��
	int b; // ����Ʈ��: 0
	float f; // ����Ʈ��: 0.0
	double d; // ����Ʈ��: 0.0
	boolean aa; // ����Ʈ��: false(0)
	char ch; // ����Ʈ��: "u000" (unicode�� 000)
	String str; // ����Ʈ��: null
	
	
	public static void main(String[] args) // �޼ҵ� ���ο� �ʵ尡 �� �� ���� => ���⿡ �����ϸ� ��������
	{
		Good1 g = new Good1();
		System.out.println(g.b); 
		System.out.println(g.f);
		System.out.println(g.d);
		System.out.println(g.aa);
		System.out.println(g.ch);
		System.out.println(g.str);
		
		// 1.����� �ʱ�ȭ => ������ �ʱ�ȭ ��� #1
		int a = 0; // ���������� ��� ����� �ʱ�ȭ �ݵ�� �ʿ�
		System.out.println(a);
	}
}