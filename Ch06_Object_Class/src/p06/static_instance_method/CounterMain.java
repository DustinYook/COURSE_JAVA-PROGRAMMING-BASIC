package p06.static_instance_method;

public class CounterMain 
{
	public static void main(String[] args) 
	{
		// �����ڰ� ����Ʈ �����ڸ� �������� ������ �����Ϸ��� ������ ����Ʈ �����ڸ� ������
		System.out.println("��ü����Ƚ��: " + Counter.getCount()); // Ŭ���� �޼ҵ� ����
		Counter c = new Counter(); // ����Ʈ ������
		System.out.println("��ü����Ƚ��: " + Counter.getCount());
		System.out.println("��ü����Ƚ��: " + c.num);
		
		Counter c2 = new Counter();
		System.out.println("��ü����Ƚ��: " + Counter.count); // Ŭ���������� "Ŭ������.Ŭ����������"�� �������� ���
		System.out.println("��ü����Ƚ��: " + c2.count); // ���� ����� �� �ٶ�����
		// �߿�) Ŭ�������� count�� ��ü���� �ø��� ������
	}
}