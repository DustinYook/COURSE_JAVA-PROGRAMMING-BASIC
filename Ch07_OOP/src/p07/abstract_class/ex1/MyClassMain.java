package p07.abstract_class.ex1;
// 추상클래스의 특성 1.객체생성불가: 상속받은 자식객체생성 가능 -> 추상클래스를 써먹으려면 자식객체생성하여 상속받아 사용
//             2.강제성과 일관성을 사용하기 위함 -> 자바 프로젝트를 위해서 사용 // 추상클래스를 통해 일관적이게 설계
//             3.추상메소드는 자식클래스에서 재정의(overriding)해서 사용
//             4.추상메소드가 들어있으면 abstract키워드는 생략불가 => 인터페이스와 구분!
public class MyClassMain 
{
	public static void main(String[] args) 
	{
//		MyClass m = new MyClass(); // 추상클래스는 객체생성 불가
//		MyClass m = new MyClass() 
//		{	
//			@Override
//			public void methodB() 
//			{
//			}
//		};
		
		MyClassImpl m = new MyClassImpl(); 
		System.out.println(m.num); // abstract로 선언된 부모클래스로부터 상속받은 멤버변수
		m.methodA();
		m.methodB();
	}
}
//부모는 여러 자식거느릴 수 있음
//자식은 하나의 부모만 존재
//자식 클래스는 오로지 하나의 부모로부터 상속받을 수 있음 => 단일상속
//추상클래스: 미완성 설계도 => 대략적인 그림
//인터페이스: 추상클래스보다 추상화가 더 심함 => 더 대략적인 그림