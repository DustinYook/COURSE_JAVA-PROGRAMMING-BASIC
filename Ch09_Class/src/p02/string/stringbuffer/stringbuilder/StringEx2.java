package p02.string.stringbuffer.stringbuilder;

public class StringEx2 
{
	public static void main(String[] args) 
	{
		// 1. equals() 사용: 객체나 문자열 비교할 때 사용
		String str1 = "Spring"; // 실제 값이 들어있음
		String str2 = "Spring"; 
		if(str1.equals(str2)) // str1과 str2의 주소값 비교
			System.out.println("Same");
		else
			System.out.println("Different");
		System.out.println("=============");
		
		// 동일한 것을 객체생성해서 함
		String str3 = new String("Spring"); // 힙 영역에 내용이 들어있음 (같은 위치에 들어있음)
		String str4 = new String("Spring");
		if(str3.equals(str4)) 
			System.out.println("Same");
		else
			System.out.println("Different");
		System.out.println("=============");
		
		// 2. 비교연산자(==) 사용
		String str5 = "Spring";
		String str6 = "Spring";
		if(str5 == str6) 
			System.out.println("Same");
		else
			System.out.println("Different");
		System.out.println("=============");
		
		String str7 = new String("Spring");
		String str8 = new String("Spring");
		if(str7 == str8) // 문자열 객체비교의 경우 반드시 비교연산자 대신 equals()를 써야함 
			System.out.println("Same");
		else
			System.out.println("Different");
		System.out.println("=============");
	}
}
// String(): 생성자