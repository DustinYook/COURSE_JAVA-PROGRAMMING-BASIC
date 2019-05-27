package p03.set.hashset;
import java.util.HashSet;
import java.util.Iterator;
// Set계열: 자료가 주머니에 들어있는 것과 비슷 => 자료가 순서없고, 중복 불가

public class HashSetEx1 
{
	public static void main(String[] args) 
	{
		HashSet<String> set =new HashSet<>();
		set.add("자바");
		set.add("카푸치노");
		set.add("자바"); 
		System.out.println(set.size()); // 중복된 것은 제거하고 값이 나옴
		
		// HashSet의 특징: 중복된 것을 제거하고 값이 나옴
		Iterator<String> it = set.iterator();
		while(it.hasNext())
		{
			String str = it.next(); // 다음 값을 받아옴
			System.out.println(str);
		}
	}
}