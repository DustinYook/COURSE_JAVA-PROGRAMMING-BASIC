package p01.lambda.ex1;
//�������̽��� ������ Ŭ������ ����
public class MyInterfaceImpl implements MyInterface // MyInterface�� ������ Ŭ����
{
	@Override // ���� ������ ����� ���ؼ�,��,��ü�� �����ؼ� ����ϴ� ��� => �� ����� ���� �������� ��
	public void sayHello() 
	{
		System.out.println("MyInterface�� ����");
	}
}