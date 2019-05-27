package p01.list.linkedlist;
import java.util.LinkedList;
// LinkedList�� ���� stack ����: LIFO(Last In First Out) ���, ��, ���Լ�����
// ���� ���߿� �� ���� ���� ���߿� ���� => �ϳ��� ž�� ���� ����
public class StackEx1 
{
	public static void main(String[] args) 
	{
		// LinkedList�� List �迭: �ڷᰡ ������, �ߺ���
		LinkedList<Integer> stack = new LinkedList<>();
		stack.addLast(new Integer(12));
		stack.addLast(new Integer(59));
		stack.addLast(new Integer(7));
		while(!stack.isEmpty()) // ��������� ����
		{
			Integer num = stack.removeLast(); // ������ �ͺ��� ��� ��, �����ϴ� �޼ҵ�
			System.out.println(num);
		}
	}
}