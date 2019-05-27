package p02.format;
import java.text.MessageFormat;

public class MessageFormatEx1 
{
	public static void main(String[] args) 
	{
		String id = "yookdonny3";
		String name = "육동현";
		String tel = "010-4034-1075";
	
		String text = "회원ID: {0}\n회원이름: {1}\n회원전화: {2}"; // Messageformat.format()을 사용하기 위한 형식
		String result1 = MessageFormat.format(text, id, name, tel); 
		System.out.println(result1);
		System.out.println("====================");
		
		String sql = "insert into member values({0},{1},{2})"; 
		// 데이터 베이스에서 쓰는 query언어 (오라클DB에서는 ' '를 문자열로 사용, 자바에서는 " "사용) => query언어와 호환되게 할 목적
		Object obj[] = {"'yookdonny3'", "'육동현'", "'010-4034-1075'"}; // 여러 타입이므로 Object타입을 사용
		String result2 = MessageFormat.format(sql, obj); 
		System.out.println(result2);
	}
}