package p05.break_continue;

public class ContinueEx1 
{
	public static void main(String[] args) 
	{
		int count = 0;
		for(int i = 1; i <= 9; i++)
		{
			if(i%2==0) // ¦���� ���
			{
				System.out.println(i);
				count++;
				continue; // ¦���� ��� ��ŵ => continue ������ ���ǽ����� ��
			}	
		} System.out.println("¦���� ������ " + count + "�� �Դϴ�.");
	}
}