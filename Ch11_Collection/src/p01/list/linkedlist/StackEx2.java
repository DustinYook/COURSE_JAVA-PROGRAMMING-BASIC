package p01.list.linkedlist;
import java.util.Stack;

public class StackEx2 
{
	public static void main(String[] args) 
	{
		Stack<String> s = new Stack<>();
		s.push("상계동");
		s.push("서초동");
		s.push("불광동");
		s.push("이문동");
		while(!s.isEmpty())
		{
			String str = s.pop(); // pop()은 출력 후, 제거 // peek()는 출력만 하고 제거하지 않음
			System.out.println(str);
		}
	}
}