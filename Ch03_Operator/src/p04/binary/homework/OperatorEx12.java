package p04.binary.homework;

public class OperatorEx12 
{
	public static void main(String[] args) 
	{
		char c1 = 'a'; // ASCII�ڵ尪:97
		char c2 = c1; // 'a'�� c2�� ����
		char c3 = ' '; // ���鹮�ڷ� �ʱ�ȭ
		int i = c1 + 1; // ASCII�ڵ尪 97�� ���� 
		
		c3 = (char)(c1 + 1); // c1 + 1�� ����� int�̹Ƿ� ���������ȯ �ʿ�
		c2++;
		c2++;
		
		System.out.println("i=" + i);
		System.out.println("c2=" + c2);
		System.out.println("c3=" + c3);
	}
}