package p05.comparator_comparable;
import java.util.Iterator;
import java.util.TreeSet;

public class ComparableEx1 
{
	public static void main(String[] args) 
	{
		TreeSet<Person> ts = new TreeSet<>();
		ts.add(new Person("홍길동", 45));
		ts.add(new Person("알파고", 5));
		ts.add(new Person("베타고", 4));
//		System.out.println(ts); // ts는 주소값이 나옴: 참조변수이기 때문
		// toString()을 재정의 해야함
		Iterator<Person> it = ts.iterator();
		while(it.hasNext())
		{
			Person p = it.next(); // 집어넣어주어야 함
			System.out.println(p.name + " : " + p.age); // compareTo(): 알아서 크기에 따라 순차적으로 정렬됨
		}
	}
}