// ���α׷� ����: �迭�� ���� ���� #1
package p01.basic_array; 
public class ArrayEx01 
{
	public static void main(String[] args) // �޼ҵ� ��ȣ ���� ������ �Ű�����(parameter)��� ��
	{ 
		// 1.�迭����
		int ages[]; // int���� �迭����  (������ �տ� �ִ� ���� Ÿ��)
		String names[]; // String���� �迭���� (����: String[] names;�� ����)
		
		// 2.�迭��ü ����  => �޸𸮿� �Ҵ�
		ages = new int[3]; // int�� ũ��(4����Ʈ)������ 3ĭ ����		
		names = new String[3]; // String�� ũ�� ������ 3ĭ ����
		
		// 3. �迭��ü �ʱ�ȭ
		// 1) for���� �̿��� �ʱ�ȭ ���
		for(int i = 0; i < ages.length; i++) // length�� ����ϴ� ���� ����!
			ages[i] = i; // i�� �迭÷��(index)��� ��, �迭÷�ڴ� 0���� ����
		// 2) �� ���ҿ� ������ �����ϴ� ���
		names[0] = "ȫ�浿"; // �迭���� ������ ������ ����
		names[1] = "���İ�";
		names[2] = "������";
		
		// 4. �迭��ü�� ���尪 ��� => �迭÷�ڸ� Ȱ���ϱ����� �ݺ��� ���
		// 1) �Ϲ����� for������ ���尪 ����ϴ� ���
		for(int i = 0; i < ages.length; i++)
			System.out.printf("age[%d]: %d\n", i, ages[i]);
		System.out.println();
		// 2) ���� for������ ���尪 ����ϴ� ���
		for(String str : names) // #�߰��н��ʿ�
			System.out.println(str);			
	}
} 
