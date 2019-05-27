package p01.object_hashcode;

public class Name 
{
	String firstName, lastName;

	public Name(String firstName, String lastName) 
	{
		this.firstName = firstName;
		this.lastName = lastName;
	}
	
	// 1단계: hashCode() 재정의(overriding)
	@Override 
	public int hashCode() 
	{
		return firstName.hashCode() + lastName.hashCode(); // 어떤 연산을 하던 상관없음 => 수치화
	}
	
	// 2단계: equals() 재정의(overriding)
	@Override
	public boolean equals(Object obj) // Alex와 Dirk의 경우 다름을 보증
	{
		if(!(obj instanceof Name)) 
			return false;
		Name n = (Name) obj;
		
		if(this.firstName.equals(n.firstName) && this.lastName.equals(n.lastName)) // 성과 이름이 같은지 확인
			return true;
		else
			return false;
	}
}