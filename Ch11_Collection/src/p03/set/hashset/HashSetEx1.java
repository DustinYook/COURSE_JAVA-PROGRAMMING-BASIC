package p03.set.hashset;
import java.util.HashSet;
import java.util.Iterator;
// Set�迭: �ڷᰡ �ָӴϿ� ����ִ� �Ͱ� ��� => �ڷᰡ ��������, �ߺ� �Ұ�

public class HashSetEx1 
{
	public static void main(String[] args) 
	{
		HashSet<String> set =new HashSet<>();
		set.add("�ڹ�");
		set.add("īǪġ��");
		set.add("�ڹ�"); 
		System.out.println(set.size()); // �ߺ��� ���� �����ϰ� ���� ����
		
		// HashSet�� Ư¡: �ߺ��� ���� �����ϰ� ���� ����
		Iterator<String> it = set.iterator();
		while(it.hasNext())
		{
			String str = it.next(); // ���� ���� �޾ƿ�
			System.out.println(str);
		}
	}
}