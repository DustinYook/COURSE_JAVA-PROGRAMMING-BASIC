package p01.unary;

public class OperatorEx01 
{
	public static void main(String[] args) 
	{
		int i = 5; // 대입연산자: 숫자 5를 변수공간 i에 저장한다
		// i++; // 연산을 완전히 종료시킴
		System.out.println(i++); // 후치 증가연산자: i = i; -> i = i + 1;
		System.out.println(i);
		
		int j = 5;
		System.out.println(++j); // 전치 증가연산자: j = j + 1; -> j = j; 
		System.out.println(j);
		
		i = 5;
		++i;
		System.out.println(i);
	}
}
// i++ or ++i: 증감연산자, 단항연산자(피연산자가 1개) => 증감연산자는 변수의 저장값을 변화시킴