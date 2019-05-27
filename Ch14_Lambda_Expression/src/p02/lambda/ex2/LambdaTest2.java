package p02.lambda.ex2;

public class LambdaTest2
{
	public static void main(String[] args) 
	{
		// 1.객체생성
		MyInterfaceImpl2 m1 = new MyInterfaceImpl2();
		m1.calculate(10, 20);
		
		// 2.다형성 이용
		MyInterface2 m2 = new MyInterfaceImpl2(); // 인터페이스 -> 구현클래스
		m2.calculate(10, 20);
		
		// 3.익명구현 객체방식
		MyInterface2 mi = new MyInterface2() 
		{
			@Override
			public void calculate(int x, int y) 
			{
				int result = x*y;
				System.out.println("계산결과는: " + result);
			}
		};
		mi.calculate(10,20);
		
		// 4.람다식 표현
		MyInterface2 ml = (x, y) -> 
		{
			int result = x*y;
			System.out.println("계산결과는: " + result);
		};
		ml.calculate(10, 20);
	}
}