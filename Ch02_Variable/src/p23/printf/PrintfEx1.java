// 프로그램 설명: printf와 관련된 변환명세에 대한 학습 1
package p23.printf;

public class PrintfEx1 
{
	public static void main(String[] args) 
	{
		byte b = 1;
		System.out.printf("b: %d\n", b);
		
		short s = 2;
		System.out.printf("s: %d\n", s);
		
		char c = 'A';
		System.out.printf("c: %c, c의 ASCII 코드값: %d\n", c, (int)c); 
		// C언어의 printf는 명시적변환을 할 필요없이 변환명세에 따라 출력형식이 제어될 수 있다는 점이 다름
		
		int finger = 10;
		System.out.printf("finger = [%5d]\n", finger); // 대괄호 안에 5칸을 만들고 오른쪽정렬 (숫자는 오른쪽정렬이 디폴트값)
		System.out.printf("finger = [%-5d]\n", finger); // 숫자를 왼쪽정렬하기 위해서는 명시적으로 -를 붙여주어야 함
		System.out.printf("finger = [%+5d]\n", finger); // 변환명세 사이의 +는 양수에 생략된 +부호를 출력하게 해주며 오른족정렬시킴 
		System.out.printf("finger = [%05d]\n", finger); // 변환명세 사이의 0은 유효자리숫자가 아닌 공간을 0으로 채워줌
		
		long big = 100_000_000_000L; // long big = 100000000000L; 
		System.out.printf("big: %d\n", big); // 자릿수가 긴 숫자의 경우 underbar로 끊을 수 있음
		
		long hex = 0xFFFF_FFFF_FFFF_FFFFL;
		System.out.printf("hex의 16진수 표현법 : %x\n", hex); // x는 heXadecimal의 약자
		System.out.printf("hex의 접두사를 포함한 16진수 표현법 : %#x\n", hex); // %x사이에 #을 쓰면 16진수의 생략된 접두사 0x가 표시 
		System.out.printf("hex의 8진수 표현법: %o\n", hex); // o는 octal의 약자
		System.out.printf("hex의 접두사를 포함한 8진수 표현법: %#o\n", hex);  // %o사이에 #을 쓰면 8진수의 생략된 접두사 0이 표시
		
		int octNum = 010; // 8진수 10은 10진수로 8임 // 8진수로 저장하기 위해서는 명시적으로 0을 앞에 써주어야 함
		System.out.printf("octNum => 8진법 표현:%o, 10진법 표현:%d\n", octNum, octNum);
		
		int hexNum = 0x10; // 16진수 10은 10진수로 16임 // 16진수로 저장하기 위해서는 명시적으로 0x를 앞에 써주어야 함
		System.out.printf("hexNum => 16진법 표현:%x, 10진법 표현:%d\n", hexNum, hexNum);
		
		int binNum = 0b10; // 2진수 10은 10진수로 2임 // b는 binary(2진수)의 약자
		System.out.printf("binNum => 2진법 표현:%s, 10진법 표현:%d\n", Integer.toBinaryString(binNum), binNum); // 2진법 형식으로 표현할 수 있는 변환명세는 존재하지 않음
		// Integer.toBinaryString(argument)라는 메소드를 통해 이를 구현
	}	
}