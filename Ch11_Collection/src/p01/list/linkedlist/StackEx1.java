package p01.list.linkedlist;
import java.util.LinkedList;
// LinkedList를 통한 stack 구현: LIFO(Last In First Out) 방식, 즉, 후입선출방식
// 가장 나중에 들어간 것이 가장 나중에 나옴 => 하노이 탑과 같은 유형
public class StackEx1 
{
	public static void main(String[] args) 
	{
		// LinkedList는 List 계열: 자료가 순서적, 중복적
		LinkedList<Integer> stack = new LinkedList<>();
		stack.addLast(new Integer(12));
		stack.addLast(new Integer(59));
		stack.addLast(new Integer(7));
		while(!stack.isEmpty()) // 비어있으면 끝냄
		{
			Integer num = stack.removeLast(); // 마지막 것부터 출력 후, 제거하는 메소드
			System.out.println(num);
		}
	}
}