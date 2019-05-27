// 프로그램 목적: 비트연산자의 이해
package p04.binary.homework;

public class OperatorEx28 
{
	public static void main(String[] args) 
	{
		int x = 0xAB; // 0x는 16진수의 접두어
		int y = 0xF;
		System.out.printf("x = %#X, y = %#X\n", x, y);
		System.out.printf("x = %s\n", Integer.toBinaryString(x)); 
		System.out.printf("y = %s\n", Integer.toBinaryString(y));
		// toBinaryString(): Integer클래스에 정의된 이진수형태의 String을 반환하는 메소드
		System.out.printf("%#X | %#X = %s\n", x, y, Integer.toBinaryString(x|y)); 
		// 비트OR연산: 둘 중 하나라도 1이 있으면 1의 값을 반환 
		// 논리OR연산은 앞의 항이 참이면 뒤의 것 skip, 비트OR연산의 경우 모든 자리에 대해서 수행함
		System.out.printf("%#X & %#X = %s\n", x, y, Integer.toBinaryString(x&y)); 
		// 비트AND연산: 둘 중 하나라도 0이 있으면 0의 값을 반환
		// 논리AND연산은 앞의 항이 거짓이면 뒤의 것 skip, 비트AND연산의 경우 모든 자리에 대해서 수행함
		System.out.printf("%#X ^ %#X = %s\n", x, y, Integer.toBinaryString(x^y)); 
		// 비트XOR연산: 두 수가 다르면 1을, 두 수가 같으면 0의 값을 반환
		
		int result = x^y^y;
		System.out.printf("%#X ^ %#X ^ %#X = %#X\n", x, y, y, result);
		System.out.printf("%s\n", Integer.toBinaryString(x^y^y));
		
		int denial1 = ~x;
		int denial2 = ~y;
		System.out.printf("x = %s\n", Integer.toBinaryString(denial1));
		System.out.printf("y = %s\n", Integer.toBinaryString(denial2));
	}
}