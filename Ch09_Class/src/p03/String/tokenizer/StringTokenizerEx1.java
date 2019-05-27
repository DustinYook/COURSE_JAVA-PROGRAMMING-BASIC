package p03.String.tokenizer;
import java.util.StringTokenizer;

public class StringTokenizerEx1 
{
	public static void main(String[] args) 
	{
		String data1 = "Grapefruit, Orange, Kiwi"; // �ڹ� �ܺο��� ����� �����Ͷ�� ���� (ex.����)
		StringTokenizer st1 = new StringTokenizer(data1, ", "); // ���д���
		while(st1.hasMoreTokens()) // hasMoreTokens()
		{
			String str = st1.nextToken();
			System.out.println(str);
		} System.out.println();
		
		String data2 = "Grapefruit Orange Kiwi"; // �ڹ� �ܺο��� ����� �����Ͷ�� ���� (ex.����)
		StringTokenizer st2 = new StringTokenizer(data2, " "); // StringTokenizer(���ڿ�,���д���=������)
		while(st2.hasMoreTokens()) // hasMoreTokens()
		{
			String str = st2.nextToken();
			System.out.println(str);
		}
	}
}