package p01.threadclass;

//2.�۾� thread 
public class DigitThread extends Thread // ThreadŬ�����κ��� ��� 
{
	@Override // annotation
	public void run() // start()�� ȣ���ؾ� ���డ��
	{
		for(int i = 0; i < 10; i++)
			System.out.print(i);
		System.out.println();
		
		try // ����ó��
		{
			Thread.sleep(2000);// ������ ms(�и�������); 1,000ms = 1sec
			// ������ �ð����� main thread�� ó����
		} 
		catch (InterruptedException e) 
		{
			System.out.println(e.getMessage());
		} 
	}
}