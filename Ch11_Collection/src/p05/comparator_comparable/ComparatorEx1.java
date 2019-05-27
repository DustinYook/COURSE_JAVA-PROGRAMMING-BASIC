package p05.comparator_comparable;
import java.util.Iterator;
import java.util.TreeSet;

public class ComparatorEx1 
{
	public static void main(String[] args) 
	{
//		TreeSet<Fruit> ts = new TreeSet<>();
		// Fruit�� comparable�� �������� �ʾұ� ������ ���ܹ߻�
		
		TreeSet<Fruit> ts = new TreeSet<>(new DescendingComparator()); // ��������
		ts.add(new Fruit("����", 3000)); 
		ts.add(new Fruit("����", 1000)); 
		ts.add(new Fruit("����", 2000));
		
		Iterator<Fruit> it = ts.iterator(); // �ݺ��ؼ� ���� �޾ƿ�
		while(it.hasNext())
		{
			Fruit f = it.next();
			System.out.println(f.name + " : " + f.price + "��");
		}
	}
} // ���ؼ� �������� or ��������