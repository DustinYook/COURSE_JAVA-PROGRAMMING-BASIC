// 프로그램 설명: 논리연산자에 대한 기본적인 이해
package p04.binary.homework;

public class OperatorEx24 
{
	public static void main(String[] args) 
	{
		int x = 0; // 변수 초기화
		char ch = ' '; // 변수 초기화
		boolean decide = false; // 논리값 저장 변수
		
		x = 15;
		decide = (10 < x) && (x < 20); // 10 초과 20미만인지 판단
		System.out.printf("x = %2d, (10 < x) && (x < 20) = %b\n", x, decide);
		
		x = 6;
		decide = (x%2==0)||(x%3==0)&&(x%6!=0); // x가 2의 배수 또는 3의 배수이면서 6의 배수가 아닌지 판단
		System.out.printf("x = %2d, (x%%2==0) || (x%%3==0) && (x%%6!=0) = %b\n", x, decide);
		decide = (x%2==0||x%3==0)&&(x%6!=0);
		System.out.printf("x = %2d, (x%%2==0 || x%%3==0) && (x%%6!=0) = %b\n", x, decide);
		
		ch = '1';
		decide = ('0'<=ch)&&(ch<='9');  // '1'의 ASCII코드값이 '0'과 '9'사이에 있는지 판단
		System.out.printf("ch = '%c', ('0'<=ch) && (ch<='9') = %b\n", ch, decide);
		
		ch = 'a';
		decide = ('a'<=ch)&&(ch<='z'); // 'a'의 ASCII코드값이 'a'과 'z'사이에 있는지 판단
		System.out.printf("ch = '%c', ('a'<=ch) && (ch<='z') = %b\n", ch, decide);
		
		ch = 'A';
		decide = ('A'<=ch)&&(ch<='Z'); // 'A'의 ASCII코드값이 'A'과 'Z'사이에 있는지 판단
		System.out.printf("ch = '%c', ('A'<=ch) && (ch<='Z') = %b\n", ch, decide);
		
		ch = 'q';
		decide = (ch=='q')||(ch=='Q'); // ch의 저장값이 'q' 또는  'Q'와 같은지 판단
		System.out.printf("ch = '%c', (ch=='q') || (ch=='Q') = %b\n", ch, decide);
	}
}