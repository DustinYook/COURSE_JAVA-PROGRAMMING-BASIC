package p01.lambda.ex1;

public class LambdaTest1 
{
	public static void main(String[] args) 
	{
		// 4���� ǥ���� ������ 
		// 1.��ü�� �����ؼ� ����ϴ� ���
		MyInterfaceImpl mi = new MyInterfaceImpl(); 
		mi.sayHello();
		
		// 2.������(Polymorphism)�� �̿��� ��ü���� ���
		MyInterface m2 = new MyInterfaceImpl(); // �θ��� ������ ������ �ڽ��� ����Ŵ
		m2.sayHello();
		
		// 3.�͸�(Anonymous)������ü�� ����ϴ� ���
		MyInterface ma = new MyInterface() 
		{
			@Override
			public void sayHello() 
			{
				System.out.println("�͸�����ü�� �̿�");
			}
		};
		ma.sayHello();
		
		// 4.���ٽ� ǥ���� �̿��� ��� => ���ٽĿ����� �ݵ�� �߻�޼ҵ尡 1���� �־�� �� with @FunctionalInterface
		MyInterface ml = () -> System.out.println("���ٽ��� �̿�"); // ���ٽ� ǥ��
		ml.sayHello();
	}
}