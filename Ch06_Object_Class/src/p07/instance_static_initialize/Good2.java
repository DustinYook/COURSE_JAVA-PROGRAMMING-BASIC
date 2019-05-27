package p07.instance_static_initialize;

public class Good2 
{	
	// 2.�ʱ�ȭ ���: �����ں��� ���� ������ ���� ���� �� ��� => ������ �ʱ�ȭ ��� #2
	// 1)Ŭ���� �ʱ�ȭ���(class/static initial block): ��ü�� ó�� �� �� ���� �� �� ����� (�� ��) => �޸𸮿� ����
	static
	{
		System.out.println("1.Ŭ���� �ʱ�ȭ���"); // ó�� ��ü ������ ���� ��� (������ �޸𸮿� ���� ����)
	}
	// 2)�ν��Ͻ� �ʱ�ȭ���(instance initial block): ��ü�� ������ ������ ����� (�Ź�) => �޸𸮿� ���� 
	{
		System.out.println("2.�ν��Ͻ� �ʱ�ȭ ���"); // ��ü ���� ����� �����
	}
	
	// 3.������  => ������ �ʱ�ȭ ��� #3
	public Good2() 
	{
		System.out.println("3.������");
	}
	
	public static void main(String[] args) // �޼ҵ� ���ο� �ʵ尡 �� �� ���� => ���⿡ �����ϸ� ��������
	{
		Good2 g1 = new Good2(); // ù��° ��ü����
		Good2 g2 = new Good2(); // �ι�° ��ü����
		Good2 g3 = new Good2(); // ����° ��ü����
		System.out.println("4.main()"); // ����Ǵ� ������ �ſ� �߿�!
	}
}