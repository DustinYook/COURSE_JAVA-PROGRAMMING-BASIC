package p01.basic;

public class HelloJava // class라는 것은 무엇인가? => 일종의 벽돌을 찍어내는 틀
{
	public static void main(String[] args) 
	{ 
        // 이것은 주석
		int num = 0; // num = 0의 의미는 수학과 다름 (대입연산)
		while(num < 10) // 0부터 9까지 10번 반복하는 처리
		{
			System.out.println("Hello, Java");
			num = num+1; // <=> num의 저장값을 1 증가시켜 저장시킴
		} 
	}
}
// '='는 오른쪽 값을 왼쪽 변수에 저장
// 반복적인 일을 처리하기 위해서 컴퓨터를 이용함
// 틀을 복사해서 내가 사용함
// 남의 클래스를 가져와서 사용하거나 또는 내가 정의하여 사용하는 방법이 있음
// 내일이 이번주 마지막 수업임