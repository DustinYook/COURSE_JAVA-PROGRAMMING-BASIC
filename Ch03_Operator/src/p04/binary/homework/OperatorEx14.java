package p04.binary.homework;

public class OperatorEx14 
{
	public static void main(String[] args) 
	{
		char c = 'a';
		for(int i = 0; i < 26; i++)
			System.out.print(c++); // a부터 z까지의 알파벳 출력
		System.out.println(); 
		
		c = 'A';
		for(int i = 0; i < 26; i++)
			System.out.print((char)(c+i)); // A부터 Z까지의 알파벳 출력
		System.out.println(); 
		
		c = '0'; // 여기서 '0'은 문자상수 0으로 정수형변수의 리터럴 0과는 다르다
		int zero = c;
		System.out.println("'0'의 ASCII코드값:" + zero); // '0'의 ASCII코드값은 48임
		for(int i = 0; i < 10; i++)
			System.out.print(c++);
	}
}