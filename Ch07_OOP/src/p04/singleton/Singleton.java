package p04.singleton;

public class Singleton // private�� ���� Singleton Pattern�� ����
{
	// static�̹Ƿ� Ŭ���� ���� => �޸𸮿� �ö�� ���� // private�̹Ƿ� �� Ŭ���� �������� ��밡�� (Ŭ���� ���ο����� ��ü���� ����)
	private static Singleton s = new Singleton(); // ������ ��ü�� �޸𸮿� �Ҵ��ϰ� �� Ŭ���� �������� ���
//	Singleton s = new Singleton(); // ��ü����
	
	private Singleton() // �� �����ڴ� �� Ŭ���� �������� ��밡�� (private�� �ǹ�) 
	{ // �ƹ��͵� ���� ���� ����Ʈ ������: ���� ��Ű�� ������ �� �� ����
		System.out.println("����Ʈ ������");
	}
	
	public static Singleton getInstance() // Ŭ���� �޼ҵ�: ��ü�������� ��Ʈ�����ڷ� ����
	{ // s��� ���������� visible��  
		if(s == null) // ��ü�� �������� �ʾ����� (���������� �ƹ��͵� �� ����Ű��)
			s = new Singleton();
		return s; // �׻� ����
	}
}