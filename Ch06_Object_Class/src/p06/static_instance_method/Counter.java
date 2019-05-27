// ���α׷� ����: Ŭ���� �޼ҵ�� �ν��Ͻ� �޼ҵ�
package p06.static_instance_method;

public class Counter 
{
	public Counter() // ����Ʈ ������
	{
		count++;
//		System.out.println(count); // 1�� ��� (�������� ������ ���)
//		System.out.println(count++); // 0�� ��� (��ġ��������)
//		System.out.println(++count); // 1�� ��� (��ġ��������)
		this.num = count;
	}
	
	// Ŭ���� ���� (����Ʈ��=0): ��ü���� ���� ��Ʈ�����ڷ� ���ٰ���
	static int count; // static�� �پ������� �޸𸮿� �̹� �ö�� ����
	// Ŭ���� �޼ҵ�: ��ü���� ���� ��Ʈ�����ڷ� ���ٰ���
	public static int getCount()
	{
		return count;
	}
	public static void setCount(int c) // ������ ������ �Ű������� ��
	{
		Counter.count = c;
	}

	// �ν��Ͻ� ����: ��ü ���� �� ��밡��
	int num; // static�� �پ����� ������ ��ü������ �ؼ� �޸𸮿� �ø� �� ����
	// �ν��Ͻ� �޼ҵ�: ��ü���� �� ��밡��
	public int getNum() 
	{
		return num;
	}
	public void setNum(int n) 
	{
		this.num = n;
	}
}