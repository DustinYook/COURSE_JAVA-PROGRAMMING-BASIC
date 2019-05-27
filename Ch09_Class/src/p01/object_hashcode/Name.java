package p01.object_hashcode;

public class Name 
{
	String firstName, lastName;

	public Name(String firstName, String lastName) 
	{
		this.firstName = firstName;
		this.lastName = lastName;
	}
	
	// 1�ܰ�: hashCode() ������(overriding)
	@Override 
	public int hashCode() 
	{
		return firstName.hashCode() + lastName.hashCode(); // � ������ �ϴ� ������� => ��ġȭ
	}
	
	// 2�ܰ�: equals() ������(overriding)
	@Override
	public boolean equals(Object obj) // Alex�� Dirk�� ��� �ٸ��� ����
	{
		if(!(obj instanceof Name)) 
			return false;
		Name n = (Name) obj;
		
		if(this.firstName.equals(n.firstName) && this.lastName.equals(n.lastName)) // ���� �̸��� ������ Ȯ��
			return true;
		else
			return false;
	}
}