package p02.threadclass;

public class AlphabetThread extends Thread // Thread��� Ŭ�����κ��� ���
{
	@Override // run()�� ������
	public void run()  
	{
		for(char ch = 'A'; ch <= 'Z'; ch++) // �����۾�
			System.out.print(ch);
		
		try // ����ó��
		{
			Thread.sleep(1000);
		} 
		catch (InterruptedException e) 
		{
			System.out.println(e.getMessage()); 
		}
	}
}