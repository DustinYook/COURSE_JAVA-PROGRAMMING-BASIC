package p05.break_continue;

public class BreakEx1 
{
	public static void main(String[] args) 
	{
		while(true) // ���ѷ��� ����
		{
			int num = (int)(Math.random()*6)+1; // 1~6 ������ ������ ������ ��ȯ
			System.out.println(num);
			if(num == 6) // �ֻ��� ���� 6�� ������ ����
				break; // break��: �ݺ���(while)�� �������´�.
		}System.out.println("���α׷� ����");
	}
}