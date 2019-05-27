package p10.polymorphism.instanceof_operator;
// instanceof 연산자: 형변환 가능여부를 알게함 => 주소를 가르키는지 확인하는 연산자 // 부모 자식관계인 경우
public class Employee // 부모클래스
{
	// 인스턴스 메소드 
	public void taxRate(Employee e) // 매개변수의 다형성: emp.taxRate(emp); / emp.taxRate(man); / emp.taxRate(eng);
	// 부모타입으로 해야지 자식타입으로 하면 들어올 수 없음 // 더 넓은 타입으로 해야 함 
	{
		if(e instanceof Manager) // Manager를 가르키는가?
		{
			Manager m = (Manager) e; // 명시적형변환
			System.out.println("Manager 세금 구하기");
		}
		else if(e instanceof Engineer) // Engineer를 가르키는가?
		{
			Engineer en = (Engineer) e;
			System.out.println("Engineer 세금 구하기");
		}
		else if(e instanceof Employee) // Employee를 가르키는가?
			System.out.println("Employee 세금 구하기");
		else
			System.out.println("형변환이 이루어지지 않음");
	}
}

// 이거는 외부클래스가 아님
class Manager extends Employee // 자식클래스 #1: Employee로부터 상속
{
}

class Engineer extends Employee // 자식클래스 #2: Employee로부터 상속
{	
}