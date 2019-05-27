package p08.interface_ex2;

public class DemoMain 
{
	public static void main(String[] args) 
	{
		// 1.다형성(Polymorphism): 부모의 하나 타입으로 여러 자식을 가르킬 수 있는 것 => 대상: 클래스, 추상클래스, 인터페이스
		Demo d = new DemoImpl(); // 다형성: 여기서 Demo는 인터페이스 => 다형성의 문제: 부모에 없고 자식에 있는 것에서 문제
		d.print(); // 부모와 자식 공통으로 가지고 있는 것
//		d.write(); // 부모에는 없고 자식만 가지고 있는 것 => 문법적 오류 // 부모의 눈에 보이지 않음
		((DemoImpl)d).write(); // 형변환이라는 안경을 씌워서 다형성의 문제를 극복함
		System.out.println("Demo.PI: " + Demo.PI);
		System.out.println("Demo.a: " + Demo.a);
		System.out.println("d.PI: " + d.PI);
		System.out.println("d.a: " + d.a);
		
		// 2.자식객체를 생성해서 쓰게되는 경우 (과거 방식)
		DemoImpl di = new DemoImpl(); // 자식클래스의 객체를 생성하는 것
		di.print();
		di.write();
		// 1번 방향이 더 효율적이기 때문에 이를 추구해야 함
		System.out.println("di.PI: " + di.PI);
		System.out.println("di.a: " + di.a);
		
		// 3.인터페이스 객체를 생성하여 쓰게 되는 경우 => 인터페이스는 객체생성이 불가
		// Demo de = new Demo();
		
		// 4.익명(Anonymous) 구현(implements) 객체생성
		Demo demo = new Demo() // 익명객체생성 // DemoImpl과는 전혀 다른 객체임 (공통점: Demo라는 공통 인터페이스를 구현)
		{
			@Override
			public void print() 
			{
				System.out.println("Anonymous print()");
			}
			
			// 부모 인터페이스와 다르게 새로 만든  메소드는 사용불가 (#1)
//			void buy()
//			{
//				System.out.println("buy()");
//			}
		};
		demo.print();
//		demo.buy(); // 문법적 오류발생 (#1)
	}
}