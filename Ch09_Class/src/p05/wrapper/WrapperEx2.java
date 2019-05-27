package p05.wrapper;
//Wrapper Class: 참조형 타입을 전체적으로 표현하는 용어 => Wrapper Class란 클래스는 API에 존재하지 않음 (이들을 합해서 부르는 용어)
//기본형 타입을 더욱 잘 활용하기 위해 존재하는 클래스가 wrapper class임
//기본형 -> 참조형: Boxing, 참조형 -> 기본형: UnBoxing
public class WrapperEx2 
{
	public static void main(String[] args) 
	{
		// 4가지 형식이 문자열을 숫자로 출력해주는 형식
		int i = new Integer("100"); 
		System.out.println(i + 100); // 숫자 200이 나옴
		
		int i2 = new Integer("100").intValue(); 
		System.out.println(i2 + 100);
		
		int i3 = Integer.parseInt("100"); 
		System.out.println(i3 + 100);
		
		Integer i4 = Integer.valueOf("100");
		System.out.println(i4 + 100);
		
		int i5 = Integer.parseInt("100", 2); // 2진수를 10진수로 변환; parseInt("해당진법표현",표현진법) 
		System.out.println(i5);
		
		int i6 = Integer.parseInt("FF", 16); // 16진수를 10진수로 변환
		System.out.println(i6);
		
		// 이건 문자열
		String str = new String("100");
		System.out.println(str + 100); // 100100이 나옴
	}
}