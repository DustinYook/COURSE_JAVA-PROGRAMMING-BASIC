package p07.abstract_class.ex1;
// �߻�Ŭ������ Ư�� 1.��ü�����Ұ�: ��ӹ��� �ڽİ�ü���� ���� -> �߻�Ŭ������ ��������� �ڽİ�ü�����Ͽ� ��ӹ޾� ���
//             2.�������� �ϰ����� ����ϱ� ���� -> �ڹ� ������Ʈ�� ���ؼ� ��� // �߻�Ŭ������ ���� �ϰ����̰� ����
//             3.�߻�޼ҵ�� �ڽ�Ŭ�������� ������(overriding)�ؼ� ���
//             4.�߻�޼ҵ尡 ��������� abstractŰ����� �����Ұ� => �������̽��� ����!
public class MyClassMain 
{
	public static void main(String[] args) 
	{
//		MyClass m = new MyClass(); // �߻�Ŭ������ ��ü���� �Ұ�
//		MyClass m = new MyClass() 
//		{	
//			@Override
//			public void methodB() 
//			{
//			}
//		};
		
		MyClassImpl m = new MyClassImpl(); 
		System.out.println(m.num); // abstract�� ����� �θ�Ŭ�����κ��� ��ӹ��� �������
		m.methodA();
		m.methodB();
	}
}
//�θ�� ���� �ڽİŴ��� �� ����
//�ڽ��� �ϳ��� �θ� ����
//�ڽ� Ŭ������ ������ �ϳ��� �θ�κ��� ��ӹ��� �� ���� => ���ϻ��
//�߻�Ŭ����: �̿ϼ� ���赵 => �뷫���� �׸�
//�������̽�: �߻�Ŭ�������� �߻�ȭ�� �� ���� => �� �뷫���� �׸�