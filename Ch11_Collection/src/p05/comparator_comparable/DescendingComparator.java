package p05.comparator_comparable;
import java.util.Comparator;

public class DescendingComparator implements Comparator<Fruit> 
{
	// descending(��������): a1<a2�� ��, a1,a2 ������ �����Ǵ� ��
	@Override
	public int compare(Fruit f1, Fruit f2) // �񱳸� ������ �츮�� ���� Ŭ�����̹Ƿ� ������ ���־�� ��
	{
		if(f1.price < f2.price) // �ڿ� ���� ũ�� 1
			return 1;
		else if(f1.price == f2.price) // ������ 0
			return 0;
		else
			return -1;
	} // ���⼭ 1�� -1�� ������ �ٲٸ� ��������
} // �����Ǹ� ���ؼ� ��ü�� ��ü�� ���Ͽ� ��������/���������� ����