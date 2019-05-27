package p03.String.tokenizer;
import java.util.StringTokenizer;

public class StringTokenizerEx1 
{
	public static void main(String[] args) 
	{
		String data1 = "Grapefruit, Orange, Kiwi"; // 자바 외부에서 날라온 데이터라고 가정 (ex.엑셀)
		StringTokenizer st1 = new StringTokenizer(data1, ", "); // 구분단위
		while(st1.hasMoreTokens()) // hasMoreTokens()
		{
			String str = st1.nextToken();
			System.out.println(str);
		} System.out.println();
		
		String data2 = "Grapefruit Orange Kiwi"; // 자바 외부에서 날라온 데이터라고 가정 (ex.엑셀)
		StringTokenizer st2 = new StringTokenizer(data2, " "); // StringTokenizer(문자열,구분단위=구분자)
		while(st2.hasMoreTokens()) // hasMoreTokens()
		{
			String str = st2.nextToken();
			System.out.println(str);
		}
	}
}