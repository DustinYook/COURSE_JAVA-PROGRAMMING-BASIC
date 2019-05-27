package p04.binary.homework;

public class OperatorEx12 
{
	public static void main(String[] args) 
	{
		char c1 = 'a'; // ASCII코드값:97
		char c2 = c1; // 'a'가 c2에 저장
		char c3 = ' '; // 공백문자로 초기화
		int i = c1 + 1; // ASCII코드값 97을 저장 
		
		c3 = (char)(c1 + 1); // c1 + 1의 결과는 int이므로 명시적형변환 필요
		c2++;
		c2++;
		
		System.out.println("i=" + i);
		System.out.println("c2=" + c2);
		System.out.println("c3=" + c3);
	}
}