package p03.String.tokenizer;
import java.util.StringTokenizer;
// StringTokenizer(String str, String delim, boolean returnDelims)
// token: 문자열을 구분하는 하나의 단위 (ex.Apple,Chocolate,Champaign) => 이들을 token이라고 함
// delimiter(구분자/기호): ex) '=' 과 '|'
// boolean returnDelims: 구분기호를 token으로 사용(true/false)
// StringTokernizer: 외부에서 날라오는 데이터를 자바에서 활용하기 위해서 필요함!
public class StringTokenizerEx2 
{
	public static void main(String[] args) 
	{
		String str = "사과=10|초콜릿=3|샴페인=1"; // =, |는 구분자(기호)로서의 역할을 수행
		StringTokenizer s = new StringTokenizer(str,"=|",true); // 구분기호를 '=','|' 두개를 사용
	    // 사과 / = / 10 / | / 초콜릿 / = / 3 / | / 샴페인 / = / 1 : 토큰
		while(s.hasMoreTokens())
		{
			String token = s.nextToken(); // Apple
			if(token.equals("=")) // 2)사과 \t 
				System.out.print("\t");
			else if(token.equals("|")) // 4)사과 \t 10 \n
				System.out.print("\n"); 
			else
				System.out.print(token); // 1)사과  // 3)사과 \t 10
		}
	}
}