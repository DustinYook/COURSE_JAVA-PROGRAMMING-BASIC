package p01.inheritance; // 패키지명은 소문자로 시작 => 클래스의 묶음

public class ManagerMain 
{
	public static void main(String[] args) // 메모리에 올라오게 하는법: 객체생성 or staic
	{
		// 부모(Employee)가 자식 생성
		// Manager m = new Manager(); // 자식객체를 생성하면 자동으로 내부적으로 부모객체를 생성함
		// Manager m = new Manager("홍길동", 2000);
		Manager m = new Manager("홍길동", 2000, "개발부"); // 변수를 더 넣고 싶으면 생성자를 생성하면 됨
		// object(자연상속)와 자식클래스, 부모클래스의 멤버변수와 멤버메소드가 보여짐
		System.out.println(m.name + m.salary + m.depart + " => " + m.getManager()); 
		// 재정의를 하면 부모클래스의 것보다 자식클래스의 재정의된 것이 우선순위를 가짐
		System.out.println(m.getEmployee()); 
		// 부모객체가 먼저 생성되고 자식객체가 생성됨 => 자식객체를 생성하면 부모객체를 내부적으로 자동으로 생성함
		// 재정의를 하지 않는 것은 일반적인 객체생성과 동일: 객체생성은 재정의할 수 없음!
		
		// 오버라이드 된 부모클래스의 메소드를 사용하는 방법은 2가지 있음
		// 1)메소드를 하나 정의하여 super.getEmployee();를 적는 방법
		System.out.println(m.aaa());
		// 2)부모클래스의 객체를 생성하여 사용하는 방법
		Employee e = new Employee(); // 부모클래스를 생성: 자식클래스와 관계없는 일반클래스
	}
}
// 상속을 쓰는 이유: 중복된 코드를 줄일 수 있기 때문, 부모클래스의 메소드를 재정의 가능
// Object: 모든 클래스의 부모 (자연상속)
// superclass: 부모 클래스 지정