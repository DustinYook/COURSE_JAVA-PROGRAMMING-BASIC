package p01.threadclass;

public class MultiThreadEx 
{
	// 1��.main thread 
	public static void main(String[] args) 
	{
		Thread t = new DigitThread(); // ������(polymorphism)
		t.start(); // start()�� ȣ��Ǿ�� run()�� ����� // thread�� ���� => run()�� ã�� DigitThread�� ��
		// 8���� 9�� ������ �־�� �۾� thread�� ���� �� 
		// *13~22�� ������ ���ÿ� ����� (mulit-thread: �۾� thread�� main thread�� ���ÿ� ����) => ����� ���� ��������� ��ǻ���� ��Ȳ�� ���� �ٸ� 
		
		for(char ch = 'A'; ch <= 'Z'; ch++) // �ڽŸ��� ������
			System.out.print(ch);
		System.out.println();
		try 
		{
			Thread.sleep(1000); // 1�� ���� �Ͻ�����
			// ������ �ð����� �۾� thread�� ó����
		} 
		catch (InterruptedException e) 
		{
			System.out.println(e.getMessage());
		} 
	}
}
// �ϳ��� ���μ��� �ȿ��� 2���� thread(main/�۾� thread)�� ����
// thread�� �߿��� ����: �ϳ��� ���α׷� ������ ���� ���� thread�� ����ϱ� ����
// Runnable �������̽��� ������ Ŭ����
// Thread�� �켱���� �ο�
// start() -> run(): start()�� ����Ǿ� run()�� ã�ư��� ����
// sleep(): thread�� �Ͻ�����
// @FunctionalInterface: ���ٽ��� �������� ǥ��