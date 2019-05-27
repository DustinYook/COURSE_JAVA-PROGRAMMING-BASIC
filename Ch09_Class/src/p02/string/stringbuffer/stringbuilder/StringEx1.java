package p02.string.stringbuffer.stringbuilder;
// String 계열 클래스에 대한 개론적 지식 - 장단점 파악할 것 (큰 부분 buffer의 존재유무)
// String(1.0버전): buffer가 없음  => 수정 못하고 그대로 불러와서 씀
// StringBuffer(1.0버전): buffer가 있음 , 동기식(복잡, 속도 느림) => 프로그램을 더 집어넣어 만듦
// StringBuilder(1.5버전): buffer가 있음, 비동기식(단순, 속도 빠름) => 프로그램을 단순하게 만들어 넣음
// buffer가 있으면 출력 전에 수정,삭제,사용하여 한 번에 출력할 수 있는 장점이 존재
// 동일 메소드가 세 군데 모두 존재! 
public class StringEx1 
{
	public static void main(String[] args) 
	{
		String str = "자바커피"; // 문자열을 생성
		int len = str.length(); // String 클래스에 정의된 멤버 메소드
		for(int i = 0; i < len; i++)
			System.out.print(str.charAt(i)); // String.charAt(index): 배열 공간의 첨자에 위치한 문자상수 출력
	}
}