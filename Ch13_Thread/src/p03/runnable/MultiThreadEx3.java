// ���α׷� ����: �Ʊ���� �������� Runnable�� �����Ͽ� ��� 
package p03.runnable;

public class MultiThreadEx3 
{
	public static void main(String[] args) // 1��.main thread
	{
		Thread t = new Thread(new SmallLetters()); // Thread ��ü���� 
		// new SmallLetters(): Runnable�������̽����� start�� ���� => �׷��� new Thread(Runnable)�� ��
//		Thread(Runnable target)
//		Allocates a new Thread object.
		t.start(); // Thread ����
		
		char arr[] = {'��', '��', '��', '��', '��'};
		for(char ch : arr) // ���� for��
			System.out.print(ch);
		
//		Runnable r = new Runnable() // �͸� Ŭ����
//		{
//			@Override
//			public void run() 
//			{
//				for(char ch = 'a'; ch <= 'z'; ch++)
//					System.out.print(ch);
//				
//			}
//		};
	}
}