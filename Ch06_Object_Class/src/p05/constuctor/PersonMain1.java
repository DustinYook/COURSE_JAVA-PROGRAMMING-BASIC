package p05.constuctor;

public class PersonMain1
{
	// field(��������, ���뺯��)
	int b; // 1)�ν��Ͻ� ����: ��ü�� �����ؼ� ���
	static int c; // 2)Ŭ���� ����: ��Ʈ�����ڸ� �̿��ؼ� ����
	
	public static void main(String[] args)  // �޸𸮿� �ö�� ���� (static ����)
	{
		Person p1 = new Person(); // ��ü���� (�ν��Ͻ�ȭ)
		p1.name = "ȫ�浿";
		p1.age = 21;
		System.out.printf("%s, %d��\n", p1.name, p1.age);
		
		int a = 0; // ��������: �޼ҵ� ���� ����, �ݵ�� �ʱ�ȭ �ʿ�, ����� ��� �������� ��ȣ
		System.out.print(a + " ");
		
		PersonMain1 p2 = new PersonMain1();
		System.out.print(p2.b + " "); 
		
		System.out.print(PersonMain1.c + " ");
		System.out.print(c); // ���� Ŭ�������� �����Ƿ� Ŭ������ ��������
	}
}