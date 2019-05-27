package p04.singleton;

public class Singleton // private에 의해 Singleton Pattern이 구현
{
	// static이므로 클래스 변수 => 메모리에 올라와 있음 // private이므로 이 클래스 내에서만 사용가능 (클래스 내부에서는 객체생성 가능)
	private static Singleton s = new Singleton(); // 생성된 객체를 메모리에 할당하고 이 클래스 내에서만 사용
//	Singleton s = new Singleton(); // 객체생성
	
	private Singleton() // 이 생성자는 이 클래스 내에서만 사용가능 (private의 의미) 
	{ // 아무것도 없는 것은 디폴트 제한자: 같은 패키지 내에서 쓸 수 있음
		System.out.println("디폴트 생성자");
	}
	
	public static Singleton getInstance() // 클래스 메소드: 객체생성없이 도트연산자로 접근
	{ // s라는 참조변수가 visible함  
		if(s == null) // 객체가 생성되지 않았으면 (참조변수가 아무것도 안 가르키면)
			s = new Singleton();
		return s; // 항상 수행
	}
}