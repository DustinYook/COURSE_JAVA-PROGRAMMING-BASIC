package p05.comparator_comparable;
import java.util.Iterator;
import java.util.TreeSet;

public class ComparableEx1 
{
	public static void main(String[] args) 
	{
		TreeSet<Person> ts = new TreeSet<>();
		ts.add(new Person("ȫ�浿", 45));
		ts.add(new Person("���İ�", 5));
		ts.add(new Person("��Ÿ��", 4));
//		System.out.println(ts); // ts�� �ּҰ��� ����: ���������̱� ����
		// toString()�� ������ �ؾ���
		Iterator<Person> it = ts.iterator();
		while(it.hasNext())
		{
			Person p = it.next(); // ����־��־�� ��
			System.out.println(p.name + " : " + p.age); // compareTo(): �˾Ƽ� ũ�⿡ ���� ���������� ���ĵ�
		}
	}
}