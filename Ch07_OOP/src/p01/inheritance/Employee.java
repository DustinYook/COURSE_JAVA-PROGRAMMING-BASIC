package p01.inheritance;

public class Employee // 클래스 안에는 변수, 메소드, 초기화블록, 생성자가 있음
{
	// 1.멤버변수 
	String name; // 인스턴스 변수
	int salary; 
	
	// 2.초기화블록
	static 
	{ // 클래스 초기화블록
		System.out.println("부모클래스의 클래스 초기화블록: 상속받은 것 아님");
	}
	{ // 인스턴스 초기화블록
		System.out.println("부모클래스의 인스턴스 초기화블록: 상속받은 것 아님");
	}
	
	// 3.생성자
	public Employee() // 디폴트 생성자
	{
		System.out.println("부모클래스의 디폴트 생성자: 상속받은 것 아님");
	}
	public Employee(String name, int salary) // 생성자
	{
		this.name = name;
		this.salary = salary;
		System.out.println("부모클래스의 생성자: 상속받은 것 아님"); // 위의 두 문장과 순서바꿀 수 없음
	}
	
	// 4.메소드
	public String getEmployee() // 인스턴스 메소드
	{
		return name + " " + salary;
	}
}