package p01.lambda.ex1;

@FunctionalInterface // Annotation(기술주석): 람다식을 사용할 수 있다는 표현 => 이 기술주석은 추상메소드 1개만 쓸 수 있게 만들어 놓았다는 의미
public interface MyInterface // 인터페이스에는 4가지 요소가 들어가야 함 
{
//	// 1.static,final변수 
//	static final int SUMMER = 2; // final은 생략가능
	
//	// 2.default 메소드
//	default void my()
//	{
//	}
	
	// 3.추상 메소드 => *람다식에서는 여기에 집중! (추상 메소드가 반드시 한 개 있어야 함)
	abstract void sayHello(); // 사용 시 반드시 재정의해야 함 (abstract는 생략가능,단,인터페이스에서만)
//	abstract void sayGoodbye(); // 추상메소드를 2개 만들 수  없음 => @FunctionalInterface가 표시된 경우만
	
//	// 4.클래스 메소드(static 메소드)
//	static void myStatic()
//	{
//		
//	}
}
// 람다식을 쓰기 위해서는 하나의 추상 메소드가 존재해야 함 (여러개 있으면 안됨)
// 람다식의 표현: @FunctionalInterface(함수적 인터페이스) => API에서 이 표현이 있는 것은 람다식이 가능하다는 의미
// 람다식을 사용하는 이유: 중첩 클래스에서 안에 있는 클래스를 사용하기 위해서는 객체생성해서 사용해야 하지만
// 익명(anonymous)구현객체를 단축해서 사용하는 표현식 
// 인터페이스와 추상클래스는 객체를 생성할 수 없음 => 인터페이스를 구현한 클래스의 객체를 생성해서 사용해야 하는 불편함 존재
// => 이 불편함을 해소하기 위해서 함수적인터페이스(FunctionalInterface)를 사용함
// 람다식을 사용하기 위해서는 추상메소드가 하나만 존재해야 한다. (2개도 안됨!)