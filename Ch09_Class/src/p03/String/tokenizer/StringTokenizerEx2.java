package p03.String.tokenizer;
import java.util.StringTokenizer;
// StringTokenizer(String str, String delim, boolean returnDelims)
// token: ���ڿ��� �����ϴ� �ϳ��� ���� (ex.Apple,Chocolate,Champaign) => �̵��� token�̶�� ��
// delimiter(������/��ȣ): ex) '=' �� '|'
// boolean returnDelims: ���б�ȣ�� token���� ���(true/false)
// StringTokernizer: �ܺο��� ������� �����͸� �ڹٿ��� Ȱ���ϱ� ���ؼ� �ʿ���!
public class StringTokenizerEx2 
{
	public static void main(String[] args) 
	{
		String str = "���=10|���ݸ�=3|������=1"; // =, |�� ������(��ȣ)�μ��� ������ ����
		StringTokenizer s = new StringTokenizer(str,"=|",true); // ���б�ȣ�� '=','|' �ΰ��� ���
	    // ��� / = / 10 / | / ���ݸ� / = / 3 / | / ������ / = / 1 : ��ū
		while(s.hasMoreTokens())
		{
			String token = s.nextToken(); // Apple
			if(token.equals("=")) // 2)��� \t 
				System.out.print("\t");
			else if(token.equals("|")) // 4)��� \t 10 \n
				System.out.print("\n"); 
			else
				System.out.print(token); // 1)���  // 3)��� \t 10
		}
	}
}