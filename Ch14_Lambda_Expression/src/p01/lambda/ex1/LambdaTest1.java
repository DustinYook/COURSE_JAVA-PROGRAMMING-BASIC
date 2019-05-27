package p01.lambda.ex1;

public class LambdaTest1 
{
	public static void main(String[] args) 
	{
		// 4가지 표현이 가능함 
		// 1.객체를 생성해서 사용하는 방법
		MyInterfaceImpl mi = new MyInterfaceImpl(); 
		mi.sayHello();
		
		// 2.다형성(Polymorphism)을 이용한 객체생성 방법
		MyInterface m2 = new MyInterfaceImpl(); // 부모의 눈으로 생성된 자식을 가리킴
		m2.sayHello();
		
		// 3.익명(Anonymous)구현객체를 사용하는 방법
		MyInterface ma = new MyInterface() 
		{
			@Override
			public void sayHello() 
			{
				System.out.println("익명구현객체를 이용");
			}
		};
		ma.sayHello();
		
		// 4.람다식 표현을 이용한 방법 => 람다식에서는 반드시 추상메소드가 1개만 있어야 함 with @FunctionalInterface
		MyInterface ml = () -> System.out.println("람다식을 이용"); // 람다식 표현
		ml.sayHello();
	}
}