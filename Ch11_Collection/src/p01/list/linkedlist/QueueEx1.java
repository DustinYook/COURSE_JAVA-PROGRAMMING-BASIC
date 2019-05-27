package p01.list.linkedlist;
import java.util.LinkedList;
// Queue: FIFO(First In First Out) 방식 => 선입선출 방식 
// LinkedList를 이용하여 Queue를 구현함
public class QueueEx1 
{
	
	public static void main(String[] args) 
	{
		LinkedList<String> queue = new LinkedList<>();
		// 자료형태: 토끼 - 사슴 - 호랑이
		// 나가는 순서: 토끼 -> 사슴 -> 호랑이
		queue.offer("토끼");
		queue.offer("사슴");
		queue.offer("호랑이");
		while(!queue.isEmpty())
		{
//			String str = queue.peek(); // peek()는 자료를 꺼내는 메소드 => 꺼내긴 하는데 제거를 하지는 않음 => 따라서 한개만 무한히 넣었다 뺐다
			// 무한루프 종료는 콘솔창의 빨간색 네모(terminate)
			String str = queue.poll(); // poll()은 들어 있는 자료를 출력 후 제거 => 선거 개표방식 
			System.out.println(str);
		}
	}
	
}
//offer(E e): Adds the specified element as the tail (last element) of this list.
//peek(): Retrieves, but does not remove, the head (first element) of this list.