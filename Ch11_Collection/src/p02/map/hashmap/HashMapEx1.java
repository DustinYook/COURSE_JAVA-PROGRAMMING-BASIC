package p02.map.hashmap;
import java.util.HashMap;
// HashMap: Map �迭 
// Map<key,value>

public class HashMapEx1 
{
	public static void main(String[] args) 
	{
		// 1.�ڷḦ ����
		HashMap<String, Integer> h = new HashMap<>();
		// �����͸� ������ ���� ���� �� ����
		h.put("ȫ�浿", 95); // key�� value�� ����
		h.put("���İ�", new Integer(93)); // WrapperClass�� Ȱ�� 
		h.put("ȫ�浿", 100); // key ���� �ߺ��� �Ǹ� ����Ⱑ ��
		// key ���� �߿���: key->value�� ���������� value->key�� �Ұ�
		// key�� ������ ���� �������� ����
		
		// 2.�ڷḦ ���
		Integer result = h.get("ȫ�浿"); // get()�� �߿���!
		System.out.println("ȫ�浿�� ����: " + result + "��");
		System.out.println(h.size());
	}
}