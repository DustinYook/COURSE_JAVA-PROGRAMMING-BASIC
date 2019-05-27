package p12.variable;

public class VariableScopeEx2
{
	public static void main(String[] args) // 메소드 안의 변수는 지역변수 
	{
		int a = 15;
		int b = 0; // 지역변수는 반드시 초기화해야 함
		// int b; // 안하면 문법적오류 발생
		
		if(a > 10)
		{
			// int b = 0; // 블록 안의 b는 main함수에서 invisible (블록 밖을 벗어나면 소멸)
			b = a-10;
		}
			
		int c = a + b + 5;
		System.out.println(c);
	}
}