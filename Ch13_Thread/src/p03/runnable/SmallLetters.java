package p03.runnable;

// 2��.�۾� thread
public class SmallLetters implements Runnable // Runnable�̶� �������̽��� ����
{
	@Override // �߻�޼ҵ� run()�� ������
	public void run() 
	{
		for(char ch = 'a'; ch <= 'z'; ch++)
			System.out.print(ch);
	}
}