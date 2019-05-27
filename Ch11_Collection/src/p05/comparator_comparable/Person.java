package p05.comparator_comparable;

public class Person implements Comparable<Person> // comparable�� ������ �������־�� ��
{
	public String name;
	public int age;
	
	public Person(String name, int age) 
	{
		this.name = name;
		this.age = age;
	}

	// �Ϲ��� ��, �ٸ� Ŭ������ ��ü�񱳴� �Ұ� => �׷��� �� ��� equals()�� ��� ��
	@Override // �������ؾ� ��!
	public int compareTo(Person p) // ��������
	{
		// -1 or 0 or 1: �� ���� �� �ϳ��� ����
		if(this.age < p.age)
			return -1; // �۴� // ū ���� �ڿ�
		else if (this.age == p.age) // ���� ���� '==', ��ü/���ڿ��� �� equals()
			return 0; // ����
		else
			return 1; // ũ��
	}
	
}