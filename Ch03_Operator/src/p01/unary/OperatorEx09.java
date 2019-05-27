package p01.unary;

public class OperatorEx09 
{
	public static void main(String[] args) 
	{
		int x = 10, y = 8;
		System.out.printf("%d를 %d로 나누면\n", x, y); // 표준입력함수: printf
		System.out.printf("몫은 %d이고, 나머지는 %d입니다.\n\n", x/y, x%y); 
		// '/'는 나눗셈의 몫, '%'는 나눗셈의 나머지
		
		// 등가 비교연산자
		System.out.print("x의 저장값이 10일때, x==10의 결과: "); // 같다
		if(x==10)
			System.out.println(true);
		else
			System.out.println(false);
		
		System.out.print("x의 저장값이 10일때, x!=10의 결과: "); // 같지않다
		if(x!=10)
			System.out.println(true);
		else
			System.out.println(false);
	}
} // 이름변경: Refactor - Rename