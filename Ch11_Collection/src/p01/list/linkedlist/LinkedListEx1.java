// ���α׷� ����: LinkedList�� ����
package p01.list.linkedlist;

import java.util.Iterator;
import java.util.LinkedList;

public class LinkedListEx1 
{
	public static void main(String[] args) 
	{
		LinkedList<String> list = new LinkedList<String>(); // LinkedList���� 
		list.add("���"); // 0�� �ε���
		list.add("����"); // 1�� �ε���
		list.add("����"); // 2�� �ε���
		
		// �߿�) �ݺ��ؼ� ���� �����͸� �о���� ó�� (iterate:�ݺ��Ͽ� ó��)
		Iterator<String> read = list.iterator(); 
		// iterator(): ����Ʈ ���� ������ ���� ���� �ݺ������� �о��
		
		while(read.hasNext()) // hasNext(): ������ ���� �ڷᰡ ������ true, ������ false ��ȯ
		{
			String str = read.next(); 
			System.out.println(str);
		}// �ݺ������� �����ؼ� StringŸ���� ���� list�� ���� (�������̽�)
	}
}
// List �迭   - 1) LinkedList: �������� ����/������ ���� ���
//          - 2) ArrayList: �������� ����/������ ���� ���