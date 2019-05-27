package p02.lambda.ex2;

public class LambdaTest2
{
	public static void main(String[] args) 
	{
		// 1.��ü����
		MyInterfaceImpl2 m1 = new MyInterfaceImpl2();
		m1.calculate(10, 20);
		
		// 2.������ �̿�
		MyInterface2 m2 = new MyInterfaceImpl2(); // �������̽� -> ����Ŭ����
		m2.calculate(10, 20);
		
		// 3.�͸��� ��ü���
		MyInterface2 mi = new MyInterface2() 
		{
			@Override
			public void calculate(int x, int y) 
			{
				int result = x*y;
				System.out.println("�������: " + result);
			}
		};
		mi.calculate(10,20);
		
		// 4.���ٽ� ǥ��
		MyInterface2 ml = (x, y) -> 
		{
			int result = x*y;
			System.out.println("�������: " + result);
		};
		ml.calculate(10, 20);
	}
}