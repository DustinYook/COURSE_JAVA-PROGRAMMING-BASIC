package p07.abstract_class.ex1;

public class MyClassImpl extends MyClass 
{
	@Override 
	public void methodB() // �θ�Ŭ�������� abstract�� ����� �޼ҵ�
	{
		System.out.println("Overriden methodB()"); // �߻�Ŭ������ ����� Ŭ������ ��ӹ޾� �������ؼ� ���
	}
}