package p04.iterator_listiterator;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
// keySet(): key���� ��Ƴ��� �ϴ� �޼ҵ�
// entrySet(): key��� value���� �ֵ��� ��Ƴ��� �ϴ� �޼ҵ�
// keySet()�� entrySet()�� ���ؼ� �� �˾Ƶα�!
public class Iterator_HashMap 
{
	public static void main(String[] args) 
	{
		// Map�� �������̽� (�迭�� �������̽�)
		Map<String, String> m = new HashMap<String, String>(); // Map�� �θ�, HashMap�� �������̽��� ������ Ŭ����
		m.put("1", "����");
		m.put("2", "���");
		
		// �̾ƴٰ� ������ ���
		Iterator<String> key = m.keySet().iterator(); // keySet(): key���� ��Ƴ��� �ϴ� �޼ҵ� => "1", "2" 
		Iterator<?> entry = m.entrySet().iterator(); // ?: ���ѵ� Ÿ���� ��  => ������ Ÿ���� ������ <-> Object�� ��� Ÿ���� ���� (?�ʹ� �ٸ�)
		// ?�� �� ����: key�� value�� Ÿ���� �ٸ� ���� �ֱ� ����
		// entrySet���� <"1","����">, <"2","���">�� �� ���� => key�� value�� ���ϸ� entry��� �θ�
		
		while(key.hasNext()) // ���� ���尪�� ������ true, ������ false
			System.out.println(key.next()); // key���� �̾Ƴ� => "1", "2" // key���� �˸� value���� �� �� ����
	
		while(entry.hasNext())
			System.out.println(entry.next()); // entry���� �̾Ƴ� => <"1", "����">, <"2", "���">
	}
}
//Stack�� List�迭
//Vetor�� ���������� ���� => ���α׷� �뷮 ���� ������ (StringBuilder, StringBuffer�� ����� ����)
//ArrayList�� �񵿱��� => ���α׷��� �ܼ��� ������