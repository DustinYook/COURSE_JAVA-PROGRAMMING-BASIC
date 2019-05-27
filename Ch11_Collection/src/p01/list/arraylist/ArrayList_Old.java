// ���α׷� ����: ������ ArrayList �����
package p01.list.arraylist;

import java.util.ArrayList;

public class ArrayList_Old 
{
	public static void main(String[] args) 
	{
		ArrayList al = new ArrayList(); // ArrayList�� ����
		// �ڹ� 5.0���� ���� Generic(<>)�� �̿��� Ư�� Ÿ�� ������ �ʼ�
		// Generic: Ư�� Ÿ�Կ� ���� ��� (<>) => ���� ���̼�

		// ArrayList�� ���� �� �ִ� �ڷ���
		al.add("ȫ�浿"); // ���ڿ�
		al.add(3); // ����
		al.add('A'); // ���ڻ��
		al.add(5.5); // �Ǽ�
		// ArrayList Ŭ������ ���ǵ� add()�� ArrayList�� �ڷ��� �߰�
		
		final int MAX = al.size();
		for(int i = 0; i < MAX; i++)
		{
			Object obj = al.get(i); // get(): �� �ε����� �ִ� ������ ������
			System.out.print(obj + " ");
		}
	}
}
// List �迭: �ڷᰡ ������, �ߺ������� Ư�� ���� => ArrayList�� List�� ����
// ArrayList: �ڷ��� ũ�Ⱑ �������� �� ��� <-> Array: �ڷ��� ũ�Ⱑ �������� ���� (����Ǹ� ũ�⺯��Ұ�)