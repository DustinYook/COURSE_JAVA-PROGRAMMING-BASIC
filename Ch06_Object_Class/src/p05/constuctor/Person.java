package p05.constuctor;

public class Person 
{
	// 멤버변수(field) = 전역변수, 공용변수, 클래스멤버 (인스턴스변수와 클래스변수 포함)
	String name; // 전역변수: 초기화 필요없음, 디폴트값 저장
	int age;
	
	public Person() // 디폴트생성자: 컴파일러가 내부적으로 자동으로 생성
	{ // "shift + alt -> constuctor" 또는 "ctrl + space"
		System.out.println("디폴트생성자 생성");
	} // 하지만 매개변수가 있는 생성자가 존재하는 경우에는 더 이상 컴파일러가 자동생성하지 않아 개발자가 만들어야 함
	
	public Person(String name) // 메소드 오버로딩: 매개변수의 순서, 타입이 중요!
	{ // 메소드 오버로딩: 매개변수의 구성(순서,타입,개수)이 다르고 메소드명이 같은 메소드가 여러 개 있는 경우를 지칭
		this.name = name; // this: 자기자신이 속한 클래스를 의미
	} 
	
	public Person(int age) 
	{ // #추가학습: this메소드?
		// System.out.println("매개변수있는 생성자2 생성"); // this메소드 위에 쓰면 에러
		this("홍길동",age); // this포인터는 자기자신이 속한 클래스의 멤버변수에 값을 전달, 자기 클래스 안에 있는 다른 생성자 호출
		System.out.println("매개변수있는 생성자2 생성");
	} // 순서: 홍길동 -> Person(String name)호출 -> this("홍길동",19)에 의해 Person(String n, int a)호출
	// 중요! 생성자 생성시 프로그램 실행순서 알아두는 것 매우 중요!

	public Person(String n, int a) 
	{
		this.name = n;
		this.age = a;
	}
	
//	public Person(String name, int age) // 순서가 같고 타입이 같은 메소드는 여러 개 정의할 수 없음
//	{
//		this.name = name;
//		this.age = age;
//	}
	
	public Person(int aa, String nn) 
	{
		this.name = nn;
		this.age = aa;
	}
	
	// getter & setter 메소드
	public String getName() 
	{
		return name;
	}
	public void setName(String name) 
	{
		this.name = name;
	}

	public int getAge() 
	{
		return age;
	}
	public void setAge(int age) 
	{
		this.age = age;
	}
}