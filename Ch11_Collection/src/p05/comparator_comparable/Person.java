package p05.comparator_comparable;

public class Person implements Comparable<Person> // comparable를 쓰려면 구현해주어야 함
{
	public String name;
	public int age;
	
	public Person(String name, int age) 
	{
		this.name = name;
		this.age = age;
	}

	// 일반적 비교, 다른 클래스와 객체비교는 불가 => 그래서 그 경우 equals()를 써야 함
	@Override // 재정의해야 함!
	public int compareTo(Person p) // 오름차순
	{
		// -1 or 0 or 1: 세 가지 중 하나를 전달
		if(this.age < p.age)
			return -1; // 작다 // 큰 놈이 뒤에
		else if (this.age == p.age) // 값일 때는 '==', 객체/문자열일 때 equals()
			return 0; // 같다
		else
			return 1; // 크다
	}
	
}