package p01.list.linkedlist;
import java.util.Stack;

public class StackEx2 
{
	public static void main(String[] args) 
	{
		Stack<String> s = new Stack<>();
		s.push("��赿");
		s.push("���ʵ�");
		s.push("�ұ���");
		s.push("�̹���");
		while(!s.isEmpty())
		{
			String str = s.pop(); // pop()�� ��� ��, ���� // peek()�� ��¸� �ϰ� �������� ����
			System.out.println(str);
		}
	}
}