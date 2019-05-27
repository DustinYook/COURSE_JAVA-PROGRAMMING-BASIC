package p01.inheritance; // 상속이 가장 중요!

public class Manager extends Employee // extends는 Employee에게 상속받았다는 표시 (모든 클래스는 object로부터 상속받음)
{ // Object클래스를 제외한 자연상속을 제외하고는 한 개의 클래스에서만 상속이 가능 (단일상속) => extends Employee, String(X)
	// 부모 클래스의 멤버변수와 멤버메소드는 상속대상 (단, 초기화블록과 생성자는 상속대상이 아님)
	String depart; 
	
	// 생성자 오버로딩: 매개변수 구성이 다른 여러 생성자를 의미 => 메소드 오버로딩
	public Manager()
	{
		System.out.println("자식클래스의 디폴트생성자");
	}
	
	public Manager(String n, int s, String d) // 생성자
	{
		// 부모클래스의 멤버변수에 저장
//		this.name = n; // 부모클래스에서 상속받았기 때문에 name을 this로 사용가능
//		this.salary = s; // 부모클래스에서 상속받았기 때문에 salray를 this로 사용가능
//		super(n, s); // 부모클래스의 해당 매개변수 구성을 가진 메소드에 접근 => this(var1, var2)와 비슷  
		// super(): 부모클래스의 생성자 호출
		this(n, s); // this(): 자신이 속한 클래스의 다른 생성자 호출
		
		// 자신클래스의 멤버변수에 저장
//		this.depart = d;
		System.out.println("자식클래스의 생성자1");
	} // 다른 클래스에 정의된 변수나 메소드를 가져다 쓰는 방법: 객체상성해서 쓰는 방법 or 상속을 받아서 쓰는 방법 (차이: 재정의 가능여부)
	
	public Manager(String n, int s) 
	{
		this.name = n; // 부모클래스에서 상속받았기 때문에 name을 this로 사용가능
		this.salary = s; // 부모클래스에서 상속받았기 때문에 salray를 this로 사용가능	
		System.out.println("자식클래스의 생성자2");
	}
	
	public String getManager()
	{
		return super.getEmployee() + " : " + depart; 
		//super는 부모클래스(Employee)를 지칭  
		// this는 자기자신이 속한 클래스
	}
	
	// #일반적인 객체생성의 경우와 다른점: 개발자가 재정의해서 사용할 수 있음 => 실행 시 우선순위는 오버라이드된 메소드
	// 메소드 오버라이딩(재정의): 부모의 메소드를 자식이 재정의해서 사용하는 것 => 나의 상황에 맞게 customize
	@Override // 객체생성: 부모클래스의 정의된 것만을 사용 vs 상속: 부모클래스의 것을 적절하게 수정해서 사용할 수 있음 
	public String getEmployee() 
	{
		return "재정의된 부모클래스의 getEmployee()";
	} // 시간을 절약하기 위해서 상속이란 개념이 도입됨 
	
	// 1)super.getEmployee();를 특정 메소드 안에 적는 방법
	public String aaa()
	{
		return "부모클래스의 getEmployee(): " + super.getEmployee();
	}
	// 여기에 super.은 사용불가
}