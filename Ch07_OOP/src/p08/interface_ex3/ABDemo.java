package p08.interface_ex3;
// ���� �������̽� ����: ���� �������̽��κ��� ���߻�ӹ���
public class ABDemo implements Ademo, Bdemo // Ŭ������ ��� ���߻���� �ȵ����� �������̽��� ��� ���߻���� ����
{
	@Override
	public void print() 
	{
		System.out.println("print() overriding");
	}

	@Override
	public void write() 
	{
		System.out.println("write() overriding");
	}
}