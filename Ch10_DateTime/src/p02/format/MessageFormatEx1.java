package p02.format;
import java.text.MessageFormat;

public class MessageFormatEx1 
{
	public static void main(String[] args) 
	{
		String id = "yookdonny3";
		String name = "������";
		String tel = "010-4034-1075";
	
		String text = "ȸ��ID: {0}\nȸ���̸�: {1}\nȸ����ȭ: {2}"; // Messageformat.format()�� ����ϱ� ���� ����
		String result1 = MessageFormat.format(text, id, name, tel); 
		System.out.println(result1);
		System.out.println("====================");
		
		String sql = "insert into member values({0},{1},{2})"; 
		// ������ ���̽����� ���� query��� (����ŬDB������ ' '�� ���ڿ��� ���, �ڹٿ����� " "���) => query���� ȣȯ�ǰ� �� ����
		Object obj[] = {"'yookdonny3'", "'������'", "'010-4034-1075'"}; // ���� Ÿ���̹Ƿ� ObjectŸ���� ���
		String result2 = MessageFormat.format(sql, obj); 
		System.out.println(result2);
	}
}