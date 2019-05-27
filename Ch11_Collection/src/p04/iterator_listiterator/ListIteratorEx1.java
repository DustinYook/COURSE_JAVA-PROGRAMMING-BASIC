package p04.iterator_listiterator;
import java.util.ArrayList;
import java.util.ListIterator;
//iterator: ���� �������� �˻� (������)
//list iterator: ���� �������� �˻�

public class ListIteratorEx1 
{
	public static void main(String[] args) 
	{
		ArrayList<String> list = new ArrayList<>(); // ������
		list.add("1");
		list.add("2");
		list.add("3");
		list.add("4");
		list.add("5");
		
		ListIterator<String> it = list.listIterator();// �������̽�
		// 1.���������� �����ϸ鼭 �о��
		while(it.hasNext()) 
			System.out.println(it.next());
		System.out.println();
		// 2.���������� �����ϸ鼭 �о��
		while(it.hasPrevious())
			System.out.println(it.previous());
		System.out.println();
		// 1�� 2�� ���ϸ� ��������� �˻�����
	}
}