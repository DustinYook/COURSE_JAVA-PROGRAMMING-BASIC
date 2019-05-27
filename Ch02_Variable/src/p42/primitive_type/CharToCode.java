// 프로그램 설명: 기본자료형인 char(문자형)에 대한 출력예시
package p42.primitive_type;

public class CharToCode 
{
	public static void main(String[] args) 
	{
		char ch = 'A'; // char ch = 65; (A의 ASCII 코드값은 65)
		int code = (int)ch; // ch에 저장된 값을 int 타입으로 변환하여 저장
		System.out.printf("%c = %d (%#X)\n", ch, code, code); // #은 접두사 출력, %x는 16진법으로 표현 
	
		char hch = '가'; // char hch = 0xAC00; (가의 ASCII 코드값은 16진수로 0xAC00)
		System.out.printf("%c = %d (%#X)\n", hch, (int)hch, (int)hch);
	}
}