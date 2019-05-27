package p04.iterator_listiterator;
import java.util.ArrayList;
import java.util.ListIterator;
//iterator: 한쪽 방향으로 검색 (순방향)
//list iterator: 양쪽 방향으로 검색

public class ListIteratorEx1 
{
	public static void main(String[] args) 
	{
		ArrayList<String> list = new ArrayList<>(); // 가변적
		list.add("1");
		list.add("2");
		list.add("3");
		list.add("4");
		list.add("5");
		
		ListIterator<String> it = list.listIterator();// 인터페이스
		// 1.순방향으로 진해하면서 읽어옴
		while(it.hasNext()) 
			System.out.println(it.next());
		System.out.println();
		// 2.역방향으로 진행하면서 읽어옴
		while(it.hasPrevious())
			System.out.println(it.previous());
		System.out.println();
		// 1과 2를 합하면 양방향으로 검색가능
	}
}