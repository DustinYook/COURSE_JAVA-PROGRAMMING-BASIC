// 프로그램 설명: 논리연산자에서 주의해야 할 사항
package p04.binary.homework;

public class OperatorEx26 
{
	public static void main(String[] args) 
	{
		int a = 5;
		int b = 0;
		boolean decide = false;
		
		System.out.printf("a = %d, b = %d\n", a, b);
		decide = (a!=0)||(++b!=0); // 주의) 논리OR연산자는 좌측이 true이면 우측을 수행하지 않음!
		System.out.printf("(a!=0) || (++b!=0) = %b\n", decide);
		System.out.printf("a = %d, b = %d\n", a, b);
		decide = (a==0) && (++b!=0); // 주의) 논리AND연산자는 좌측이 false이면 우측을 수행하지 않음!
		System.out.printf("(a==0) && (++b!=0) = %b\n", decide);
		System.out.printf("a = %d, b = %d\n", a, b);
	}
}