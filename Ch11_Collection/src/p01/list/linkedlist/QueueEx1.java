package p01.list.linkedlist;
import java.util.LinkedList;
// Queue: FIFO(First In First Out) ��� => ���Լ��� ��� 
// LinkedList�� �̿��Ͽ� Queue�� ������
public class QueueEx1 
{
	
	public static void main(String[] args) 
	{
		LinkedList<String> queue = new LinkedList<>();
		// �ڷ�����: �䳢 - �罿 - ȣ����
		// ������ ����: �䳢 -> �罿 -> ȣ����
		queue.offer("�䳢");
		queue.offer("�罿");
		queue.offer("ȣ����");
		while(!queue.isEmpty())
		{
//			String str = queue.peek(); // peek()�� �ڷḦ ������ �޼ҵ� => ������ �ϴµ� ���Ÿ� ������ ���� => ���� �Ѱ��� ������ �־��� ����
			// ���ѷ��� ����� �ܼ�â�� ������ �׸�(terminate)
			String str = queue.poll(); // poll()�� ��� �ִ� �ڷḦ ��� �� ���� => ���� ��ǥ��� 
			System.out.println(str);
		}
	}
	
}
//offer(E e): Adds the specified element as the tail (last element) of this list.
//peek(): Retrieves, but does not remove, the head (first element) of this list.