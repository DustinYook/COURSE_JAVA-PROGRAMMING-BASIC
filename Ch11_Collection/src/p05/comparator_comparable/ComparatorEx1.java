package p05.comparator_comparable;
import java.util.Iterator;
import java.util.TreeSet;

public class ComparatorEx1 
{
	public static void main(String[] args) 
	{
//		TreeSet<Fruit> ts = new TreeSet<>();
		// Fruit이 comparable를 구현하지 않았기 때문에 예외발생
		
		TreeSet<Fruit> ts = new TreeSet<>(new DescendingComparator()); // 내림차순
		ts.add(new Fruit("포도", 3000)); 
		ts.add(new Fruit("수박", 1000)); 
		ts.add(new Fruit("딸기", 2000));
		
		Iterator<Fruit> it = ts.iterator(); // 반복해서 값을 받아옴
		while(it.hasNext())
		{
			Fruit f = it.next();
			System.out.println(f.name + " : " + f.price + "원");
		}
	}
} // 비교해서 오름차순 or 내림차순