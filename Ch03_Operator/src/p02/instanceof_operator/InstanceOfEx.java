package p02.instanceof_operator;

public class InstanceOfEx 
{
	public static void main(String[] args) 
	{
		int a = 10, b = 5;
		System.out.println(a==b); // 결과값: false
		System.out.println(a!=b); // 결과값: true
		System.out.println(a>b); // 결과값: true
		System.out.println(a>=b); // 결과값: true
		System.out.println(a<b); // 결과값: false
		System.out.println(a<=b); // 결과값: false
		
		String str ="Hello"; // String은 참조형타입 
		// str은 참조변수
		if(str instanceof String) // instanceof연산자
			System.out.println("같은 타입이므로 형변환 가능");
		else
			System.out.println("다른 타입이므로 형변환이 불가능");
		// 데이터타입: 기본형(변수에 값이 저장), 참조형(변수에 주소가 저장)
		
		b += a; // <=> b = b + a; (축약연산자)
		System.out.println(b); // b = 5 -> b + a = 15
		b %= a; // <=> b = b % a; (축약연산자)
		System.out.println(b); // b = 15 -> b % a = 0
	}
}