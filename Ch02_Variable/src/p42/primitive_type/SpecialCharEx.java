// 프로그램 설명: escape sequence에 대한 활용예제
package p42.primitive_type;

public class SpecialCharEx 
{
	public static void main(String[] args) 
	{
		System.out.println('\''); // 작은 따옴표를 출력하기 위해서는 \'를 사용
		System.out.println("abc \t 123\b456"); // \t는 tab, \b는 backspace (왜 안지워짐?)
		System.out.println('\n'); // \n은 newline
		System.out.println("\"Hello World!\""); // 큰 따옴표를 출력하기 위해서는 \"를 사용
		System.out.println("c:\\"); // \를 출력하기 위해서는 \\를 사용
	}
}