package p08.interface_ex2;

public class DemoMain 
{
	public static void main(String[] args) 
	{
		// 1.������(Polymorphism): �θ��� �ϳ� Ÿ������ ���� �ڽ��� ����ų �� �ִ� �� => ���: Ŭ����, �߻�Ŭ����, �������̽�
		Demo d = new DemoImpl(); // ������: ���⼭ Demo�� �������̽� => �������� ����: �θ� ���� �ڽĿ� �ִ� �Ϳ��� ����
		d.print(); // �θ�� �ڽ� �������� ������ �ִ� ��
//		d.write(); // �θ𿡴� ���� �ڽĸ� ������ �ִ� �� => ������ ���� // �θ��� ���� ������ ����
		((DemoImpl)d).write(); // ����ȯ�̶�� �Ȱ��� ������ �������� ������ �غ���
		System.out.println("Demo.PI: " + Demo.PI);
		System.out.println("Demo.a: " + Demo.a);
		System.out.println("d.PI: " + d.PI);
		System.out.println("d.a: " + d.a);
		
		// 2.�ڽİ�ü�� �����ؼ� ���ԵǴ� ��� (���� ���)
		DemoImpl di = new DemoImpl(); // �ڽ�Ŭ������ ��ü�� �����ϴ� ��
		di.print();
		di.write();
		// 1�� ������ �� ȿ�����̱� ������ �̸� �߱��ؾ� ��
		System.out.println("di.PI: " + di.PI);
		System.out.println("di.a: " + di.a);
		
		// 3.�������̽� ��ü�� �����Ͽ� ���� �Ǵ� ��� => �������̽��� ��ü������ �Ұ�
		// Demo de = new Demo();
		
		// 4.�͸�(Anonymous) ����(implements) ��ü����
		Demo demo = new Demo() // �͸�ü���� // DemoImpl���� ���� �ٸ� ��ü�� (������: Demo��� ���� �������̽��� ����)
		{
			@Override
			public void print() 
			{
				System.out.println("Anonymous print()");
			}
			
			// �θ� �������̽��� �ٸ��� ���� ����  �޼ҵ�� ���Ұ� (#1)
//			void buy()
//			{
//				System.out.println("buy()");
//			}
		};
		demo.print();
//		demo.buy(); // ������ �����߻� (#1)
	}
}