package p05.comparator_comparable;
import java.util.Comparator;

public class DescendingComparator implements Comparator<Fruit> 
{
	// descending(내림차순): a1<a2일 때, a1,a2 순으로 나열되는 것
	@Override
	public int compare(Fruit f1, Fruit f2) // 비교를 쓰려면 우리가 만든 클래스이므로 재정의 해주어야 함
	{
		if(f1.price < f2.price) // 뒤에 것이 크면 1
			return 1;
		else if(f1.price == f2.price) // 같으면 0
			return 0;
		else
			return -1;
	} // 여기서 1과 -1의 순서를 바꾸면 오름차순
} // 재정의를 통해서 객체와 객체를 비교하여 내림차순/오름차순을 결정