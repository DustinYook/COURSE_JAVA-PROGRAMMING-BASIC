package p04.array_class_ex;

public class Cat 
{
	// 멤버변수 정의
	String name;
	String kind;
	
	// 생성자 정의
	public Cat(String n, String k) 
	{
		// super();
		this.name = n;
		this.kind = k;
	}
	
	@Override // 재정의(오버라이딩)
	public String toString() 
	{
		return name + "는 " + kind + "입니다.";
	}
}